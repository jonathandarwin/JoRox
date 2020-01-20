package com.jonathandarwin.rxvolley.model;

import com.google.gson.annotations.SerializedName;
import com.jonathandarwin.rxvolley.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {
    protected int id;
    protected String email;
    @SerializedName("first_name")
    protected String firstName;
    @SerializedName("last_name")
    protected String lastName;
    @SerializedName("avatar")
    protected String avatar;

    @Bindable
    public String getNameDisplay(){
        return this.firstName + this.lastName;
    }

    @Bindable
    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
        return this;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
        return this;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
        return this;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
        return this;
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public User setAvatar(String avatar) {
        this.avatar = avatar;
        notifyPropertyChanged(BR.avatar);
        return this;
    }
}
