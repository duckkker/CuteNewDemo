package com.example.fragmenttest.RecyclerView.StaticRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewDataFactory {
   private static String[] content = {"blackpink in your area","iz*one in your area","Twice in your area","Forever young"};


    public static List<RecyclerViewData> createRecData(int num){
        List<RecyclerViewData> Datas = new ArrayList<>();
        for (int i = 0;i<num;i++){
            String contents = content[i%4];
            Datas.add(new RecyclerViewData((i+1)+" "+contents));
        }
        return Datas;
    }
}
