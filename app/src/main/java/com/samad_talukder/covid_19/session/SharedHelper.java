package com.samad_talukder.covid_19.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.samad_talukder.covid_19.application.CovidApplication;

public class SharedHelper {
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;
    private int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "covid_preference";
    private Context context;

    @SuppressLint("CommitPrefEdits")
    public SharedHelper(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }

    public static boolean writeKey(String key, String value) {
        editor.putString(key, value);
        return editor.commit();
    }

    public static String readKey(String key) {
        return sharedPreferences.getString(key, "");
    }
}
