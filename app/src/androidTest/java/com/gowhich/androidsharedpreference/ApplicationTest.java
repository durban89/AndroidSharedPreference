package com.gowhich.androidsharedpreference;

import android.app.Application;
import android.content.Context;
import android.test.ApplicationTestCase;
import android.util.Log;

import org.junit.Test;

import java.util.Map;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    @Test
    public void save(){
        Context context = getContext();
        MySharedPreference sharedPreference = new MySharedPreference(context);
        boolean flag = sharedPreference.saveMessage("123", "123");
        Log.i("MyText", "----->" + flag);
    }

    @Test
    public void fetch(){
        Context context = getContext();
        MySharedPreference sharedPreference = new MySharedPreference(context);
        Map<String, Object> map = sharedPreference.getMessage();
        Log.i("MyText", "||||------>" + map.toString());
    }
}