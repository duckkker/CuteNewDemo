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

    private FragmentManager fragmentManager;

//    LeftFragment leftFragmentFlag;
//    CenterFragment centerFragmentFlag;
//    RightFragment rightFragmentFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button left_button = findViewById(R.id.left_name);
        Button center_button = findViewById(R.id.center_namelist);
        Button right_button = findViewById(R.id.right_setting);

//        LeftFragment = new LeftFragment();
//        RightFragment = new RightFragment();
//        CenterFragment = new CenterFragment();


        left_button.setOnClickListener(this);
        center_button.setOnClickListener(this);
        right_button.setOnClickListener(this);


        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (LeftFragment == null) {
            LeftFragment = new LeftFragment();
            fragmentTransaction.add(R.id.framelayout, LeftFragment);
            Log.d("-----","if");
        } else {
            fragmentTransaction.show(LeftFragment);
        }
        Log.d("-----","onCreate");
        fragmentTransaction.commit();

        //getSupportFragmentManager().beginTransaction().add(R.id.framelayout,LeftFragment).commitAllowingStateLoss();
        //replaceFragment(new LeftFragment(),"a");

    }

    //
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left_name:
//                LeftFragment = new LeftFragment();
                Log.d("-----","onCreate123");
                replaceFragment(LeftFragment,"a");
                //getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,LeftFragment).commitAllowingStateLoss();
                break;
            case R.id.center_namelist:
//                RightFragment = new RightFragment();
                replaceFragment(new CenterFragment(),"b");
                //getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,CenterFragment).commitAllowingStateLoss();
                break;
            case R.id.right_setting:
//                CenterFragment = new CenterFragment();
                replaceFragment(new RightFragment(),"c");
               // getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,RightFragment).commitAllowingStateLoss();
                break;
            default:
                break;
        }
    }

    //

    private void replaceFragment(Fragment fragment,final String tag) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.framelayout, fragment);
//        transaction.commit();


        Fragment fragmentTag = getSupportFragmentManager().findFragmentByTag(tag);
//        if (fragment == null&&(tag == "a"||tag == "b"||tag == "c")){
//           // Fragment fragmentTag = getSupportFragmentManager().findFragmentByTag(tag);
//            getSupportFragmentManager().beginTransaction().hide(fragmentTag).add(R.id.framelayout,fragment).addToBackStack(null).commitAllowingStateLoss();
//        }
//        else {
//            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,fragment).addToBackStack(null).commitAllowingStateLoss();
//        }


        if (fragmentTag != null){
            getSupportFragmentManager().beginTransaction().hide(fragmentTag).add(R.id.framelayout,fragment).addToBackStack(null).commitAllowingStateLoss();
            //fragmentTransaction.hide(fragment);
        }else if (fragmentTag == null){
            Log.d("-----","onCreate3");
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,fragment).addToBackStack(null).commitAllowingStateLoss();
            Log.d("-----","onCreate4");
        }//隐藏当前fragment
    }
}


