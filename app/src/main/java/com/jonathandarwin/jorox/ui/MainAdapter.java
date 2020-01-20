package com.jonathandarwin.rxvolley.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jonathandarwin.rxvolley.R;
import com.jonathandarwin.rxvolley.databinding.ListUserItemBinding;
import com.jonathandarwin.rxvolley.model.User;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<User> userList;

    public MainAdapter(List<User> userList){
        this.userList = userList;
    }

    class MainViewHolder extends RecyclerView.ViewHolder{
        private ListUserItemBinding binding;

        public MainViewHolder(ListUserItemBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(User user){
            binding.setViewModel(user);
        }
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListUserItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.list_user_item, parent, false);
        return new MainViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(userList.get(position));
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
