package com.example.fragmenttest.ListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import com.example.fragmenttest.R;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyListView extends AppCompatActivity {

    private ListView Mlv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        Mlv1 = findViewById(R.id.listview);
        Mlv1.setAdapter(new ListViewAdapter(MyListView.this));


    }
}
