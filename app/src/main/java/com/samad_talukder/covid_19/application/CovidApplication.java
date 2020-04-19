package com.samad_talukder.covid_19.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import com.samad_talukder.covid_19.utils.LogUtils;

public class CovidApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LogUtils.timberLogInitialize("COVID");
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}
