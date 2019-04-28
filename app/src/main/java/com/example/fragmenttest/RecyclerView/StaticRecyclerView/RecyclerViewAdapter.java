package com.example.fragmenttest.RecyclerView.StaticRecyclerView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmenttest.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context context;
    List<RecyclerViewData> Datas;
    public RecyclerViewAdapter(Context context,List<RecyclerViewData> Datas){
        this.context = context;
        this.Datas = Datas;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parents, int i) {
        LayoutInflater inflater = LayoutInflater.from(parents.getContext());
        View itemView = inflater.inflate(R.layout.recyclerview_item,parents,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        RecyclerViewData Data = Datas.get(i);
        viewHolder.RecContent.setText(Data.getContent());
    }

    @Override
    public int getItemCount() {
        return Datas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView RecContent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            RecContent = itemView.findViewById(R.id.RecyclerView_content);
        }
    }
}
