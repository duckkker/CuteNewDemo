package com.example.fragmenttest.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecyclerViewDataFactory {
    private static String[] content = {"blackpink in your area","iz*one in your area","Twice in your area"};

    public static List<RecyclerViewData> createRecData(int num){
        List<RecyclerViewData> Datas = new ArrayList<>();
        for (int i = 0;i<num;i++){
            String contents = content[i];
            Datas.add(new RecyclerViewData(contents));
        }
        return Datas;
    }
}
