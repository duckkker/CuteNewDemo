package com.example.fragmenttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragmenttest.ListView.MyListView;
import com.example.fragmenttest.RecyclerView.CustomRecyclerView.CRecyclerView;
import com.example.fragmenttest.RecyclerView.StaticRecyclerView.MyRecyclerView;

public class CenterFragment extends Fragment implements View.OnClickListener{
    private Button toListView;
    private Button toRecyclerView;
    private Button toRecyclerViewCustom;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.center_fragment,container,false);
        return view;
    }

    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        toListView = view.findViewById(R.id.Listview_button);
        toRecyclerView = view.findViewById(R.id.Recyclerview_button);
        toRecyclerViewCustom = view.findViewById(R.id.InsertRecV_button);

        toListView.setOnClickListener(this);
        toRecyclerView.setOnClickListener(this);
        toRecyclerViewCustom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Listview_button:
                Intent intent1 = new Intent(getActivity(), MyListView.class);
                startActivity(intent1);
                break;
            case R.id.Recyclerview_button:
                Intent intent2 = new Intent(getActivity(), MyRecyclerView.class);
                startActivity(intent2);
                break;
            case R.id.InsertRecV_button:
                Intent intent3 = new Intent(getActivity(), CRecyclerView.class);
                startActivity(intent3);
                break;

            default:break;
        }

    }
}
