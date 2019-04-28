package com.example.fragmenttest.RecyclerView.CustomRecyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.fragmenttest.R;

import java.util.ArrayList;
import java.util.List;

public class CRecyclerView extends AppCompatActivity {

    private List<CRecyclerViewData> MsgList = new ArrayList<>();
    private EditText msg_content;
    private Button msg_button;
    private RecyclerView recyclerView;

    private CRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_custom);

        msg_content = findViewById(R.id.talk_edit);
        msg_button = findViewById(R.id.send);
        recyclerView = findViewById(R.id.custom_RecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);//定义布局
        recyclerView.setLayoutManager(layoutManager);
        adapter = new CRecyclerViewAdapter(MsgList);//调用适配器，开始传数据
        recyclerView.setAdapter(adapter);
        //RecyclerView recyclerView = new RecyclerView(this,CRecyclerViewData);

        msg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = msg_content.getText().toString();
                if (!"".equals(content)){
                    CRecyclerViewData data = new CRecyclerViewData(content);
                    MsgList.add(data);
                    adapter.notifyItemInserted(MsgList.size()-1);
                    recyclerView.scrollToPosition(MsgList.size()-1);
                    msg_content.setText("");
                }
            }
        });
    }
}
