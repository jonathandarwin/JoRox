package com.jonathandarwin.rxvolley.repository.remote;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;
import rx.Observable;
import rx.subjects.PublishSubject;

public class JoRox<Req, Res> {

    private Application application;
    private String url;
    private Req param;
    private Class<Res> res;

    public JoRox(Application application, Class<Res> res){
        this.application = application;
        this.res = res;
    }

    public JoRox setUrl(String url){
        this.url = url;
        return this;
    }

    public JoRox setParam(Req param){
        this.param = param;
        return this;
    }

    public Observable<Res> get(){
        PublishSubject<Res> publishSubject = PublishSubject.create();
        Gson gson = new GsonBuilder().create();
        JSONObject object = null;
        try{
            object = new JSONObject(param.toString());
        }
        catch (Exception e){
            object = null;
        }

        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                url,
                object,
                response -> {
                    Res res = gson.fromJson(response.toString(), this.res);
                    publishSubject.onNext(res);
                    publishSubject.onCompleted();
                },
                error -> {
                    publishSubject.onError(error);
                    publishSubject.onCompleted();
                }
        );
        RequestQueue queue = Volley.newRequestQueue(application);
        queue.add(request);
        return publishSubject;
    }
}
