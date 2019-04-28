package com.example.fragmenttest.RecyclerView.CustomRecyclerView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fragmenttest.R;
import com.example.fragmenttest.RecyclerView.StaticRecyclerView.RecyclerViewData;

import java.util.List;

/**
 * 适配器负责实例化RecyclerView中的各项目，之后可以与主Activity的xml进行关联！
 */
public class CRecyclerViewAdapter extends RecyclerView.Adapter<CRecyclerViewAdapter.ViewHolder> {
    @NonNull
    List<CRecyclerViewData> MsgList;
    public CRecyclerViewAdapter(){}
    public CRecyclerViewAdapter(List<CRecyclerViewData> MsgList){
        this.MsgList = MsgList;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.recyclerview_custom_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        CRecyclerViewData msg = MsgList.get(i);
        viewHolder.send.setText(msg.getContent());
    }

    @Override
    public int getItemCount() {
        return MsgList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

       // LinearLayout Layout;
        TextView send;

        public ViewHolder(@NonNull View view) {//用于声明和实例化各种控件~~
            super(view);
            //Layout = view.findViewById(R.id.Msg_item);
            send = view.findViewById(R.id.send_item);
        }
    }
}
