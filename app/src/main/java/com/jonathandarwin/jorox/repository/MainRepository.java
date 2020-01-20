package com.jonathandarwin.rxvolley.repository;

import android.app.Application;

import com.jonathandarwin.rxvolley.datamodel.MainRequest;
import com.jonathandarwin.rxvolley.datamodel.MainResponse;
import com.jonathandarwin.rxvolley.repository.remote.JoRox;

import rx.Observable;

public class MainRepository {

    private Application application;

    public MainRepository(Application application){
        this.application = application;
    }

    public Observable<MainResponse> getUser(){
        JoRox<MainRequest, MainResponse> jorox = new JoRox<>(application, MainResponse.class);
        return jorox
                .setUrl("https://reqres.in/api/users?page=1")
                .setParam(null)
                .get();
    }
}
