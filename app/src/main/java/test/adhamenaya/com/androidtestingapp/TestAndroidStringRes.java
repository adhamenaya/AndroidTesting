package test.adhamenaya.com.androidtestingapp;

import android.content.Context;

/**
 * Created by AENAYA on 29/08/2016.
 */
public class TestAndroidStringRes {


    public String getString(Context context){
        // ap name should be: AndroidTestingApp
        return context.getString(R.string.app_name);
    }
}
