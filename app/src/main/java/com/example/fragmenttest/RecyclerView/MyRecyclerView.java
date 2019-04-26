package com.example.fragmenttest.RecyclerView;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import com.example.fragmenttest.R;

import java.util.List;

public class MyRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        List<RecyclerViewData> RecyclerViewData = RecyclerViewDataFactory.createRecData(3);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,RecyclerViewData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
