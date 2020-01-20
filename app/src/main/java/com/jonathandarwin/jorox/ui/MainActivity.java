package com.jonathandarwin.rxvolley.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.jonathandarwin.rxvolley.R;
import com.jonathandarwin.rxvolley.databinding.MainActivityBinding;
import com.jonathandarwin.rxvolley.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    private MainActivityBinding binding;
    private MainAdapter adapter;
    private List<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        setAdapter();
        setListener();
        viewModel.getUser();
    }

    private void setAdapter(){
        adapter = new MainAdapter(userList);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);
    }

    private void setListener(){
        viewModel.loading.observe(this, (status) -> {
            switch (status){
                case MainViewModel.SHOW_LOADING:
                    binding.loading.setVisibility(View.VISIBLE);
                    break;
                case MainViewModel.REMOVE_LOADING:
                    binding.loading.setVisibility(View.GONE);
                    break;
            }
        });

        viewModel.userList.observe(this, (users) -> {
            userList.clear();
            userList.addAll(users);
            adapter.notifyDataSetChanged();
        });
    }
}
