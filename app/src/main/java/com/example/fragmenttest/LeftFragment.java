package com.example.fragmenttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class LeftFragment extends Fragment implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private TextView textView1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.left_fragment,container,false);

        return view;
    }
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        button1 = view.findViewById(R.id.left_button);
        button2 = view.findViewById(R.id.left_button2);
        textView1 = view.findViewById(R.id.text);
       // Fragment fragment = view.findViewById(R.id.);



        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.left_button:
                Intent intent = new Intent(getActivity(),AnotherActivity.class);
                startActivity(intent);
                break;
            case R.id.left_button2:
                textView1.setText("TTTT");
                default:break;
        }
    }
}
