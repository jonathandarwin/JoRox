package com.jonathandarwin.rxvolley.ui;

import android.app.Application;

import com.jonathandarwin.rxvolley.model.User;
import com.jonathandarwin.rxvolley.repository.MainRepository;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainViewModel extends AndroidViewModel {

    private MainRepository mainRepository;
    public MutableLiveData<List<User>> userList = new MutableLiveData<>();
    public MutableLiveData<Integer> loading = new MutableLiveData<>();

    public static final int SHOW_LOADING = 1;
    public static final int REMOVE_LOADING = 2;


    public MainViewModel(Application application){
        super(application);
        mainRepository = new MainRepository(application);
    }

    public void getUser(){
        loading.postValue(SHOW_LOADING);
        mainRepository.getUser()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        (result) -> {
                            loading.postValue(REMOVE_LOADING);
                            userList.postValue(result.getData());
                        },
                        (error) -> {
                            loading.postValue(REMOVE_LOADING);
                            userList.postValue(new ArrayList<>());
                        }
                );
    }
}
