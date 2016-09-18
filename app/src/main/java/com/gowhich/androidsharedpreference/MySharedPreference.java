package com.gowhich.androidsharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by durban126 on 16/9/18.
 */
public class MySharedPreference {

    private Context context;


    public MySharedPreference(Context context) {
        this.context = context;
    }

    public boolean saveMessage(String name, String pass) {
        boolean flag = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("userinfo", Context.MODE_PRIVATE);

        //对数据进行编辑
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", name);
        editor.putString("pass", pass);
        flag = editor.commit();//将数据持久化到介质中

        return flag;
    }

    public Map<String, Object> getMessage() {
        Map<String, Object> map = new HashMap<>();
        SharedPreferences sharedPreferences = context.getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name", "");
        String pass = sharedPreferences.getString("pass", "");

        map.put("name", name);
        map.put("pass", pass);

        return map;
    }


}
