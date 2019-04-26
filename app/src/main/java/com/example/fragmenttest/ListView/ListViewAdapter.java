package com.example.fragmenttest.ListView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.fragmenttest.R;

import java.util.LinkedList;

public class ListViewAdapter extends BaseAdapter {
    private Context mContext;
    //private LinkedList<ListViewData> mData;
    private LayoutInflater mLayoutInflater;

    public ListViewAdapter(){

    }
    public ListViewAdapter(Context mContext){
        this.mContext = mContext;
        mLayoutInflater = LayoutInflater.from(mContext);
       // this.mData = mData;
    }

    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder = null;
        if (view == null){
            view = mLayoutInflater.from(mContext).inflate(R.layout.list_view_item,parent,false);
            holder = new ViewHolder();
            holder.txt_BDZ = view.findViewById(R.id.BDZ_context);
            view.setTag(holder);
        }else
            holder = (ViewHolder) view.getTag();
           // holder.txt_BDZ.setText("BDZTT");

        return view;
    }

    static class ViewHolder{
        public TextView txt_BDZ;
    }
}
