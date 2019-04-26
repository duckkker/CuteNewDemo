package com.example.fragmenttest;

import android.annotation.SuppressLint;
import android.nfc.Tag;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LeftFragment LeftFragment;
    private RightFragment RightFragment;
    private CenterFragment CenterFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button left_button = findViewById(R.id.left_name);
        Button center_button = findViewById(R.id.center_namelist);
        Button right_button = findViewById(R.id.right_setting);

        LeftFragment = new LeftFragment();
        RightFragment = new RightFragment();
        CenterFragment = new CenterFragment();


        left_button.setOnClickListener(this);
        center_button.setOnClickListener(this);
        right_button.setOnClickListener(this);

        getSupportFragmentManager().beginTransaction().add(R.id.framelayout,LeftFragment).commitAllowingStateLoss();
       // replaceFragment(new LeftFragment());

    }

    //
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left_name:
                //replaceFragment(new LeftFragment());
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,LeftFragment,"left").commitAllowingStateLoss();
                break;
            case R.id.center_namelist:
                //replaceFragment(new CenterFragment());
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,CenterFragment).commitAllowingStateLoss();
                break;
            case R.id.right_setting:
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,RightFragment).commitAllowingStateLoss();
                break;
            default:
                break;
        }
    }

    //

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout, fragment);
        transaction.commit();

    }
}


