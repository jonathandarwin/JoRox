package com.jonathandarwin.rxvolley.datamodel;

import com.google.gson.annotations.SerializedName;
import com.jonathandarwin.rxvolley.model.User;

import java.util.List;

public class MainResponse {
    protected int page;
    @SerializedName("per_page")
    protected int perPage;
    @SerializedName("total_page")
    protected int totalPage;
    protected List<User> data;

    public int getPage() {
        return page;
    }

    public int getPerPage() {
        return perPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public List<User> getData() {
        return data;
    }
}
