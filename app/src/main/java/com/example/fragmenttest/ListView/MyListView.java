package com.example.fragmenttest.ListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        Mlv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                id = 1;
                Toast.makeText(MyListView.this, "点击 pos: " + position, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
