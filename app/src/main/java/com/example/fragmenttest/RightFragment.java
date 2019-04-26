package com.example.fragmenttest;

import android.os.Bundle;
import android.renderscript.Element;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RightFragment extends Fragment {
    public static final String TAG = "RightFragment";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.right_fragment,container,false);
        return view;
    }
}
