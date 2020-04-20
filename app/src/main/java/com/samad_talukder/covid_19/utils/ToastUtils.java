package com.samad_talukder.covid_19.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;

import com.samad_talukder.covid_19.R;

import es.dmoral.toasty.Toasty;

public interface ToastUtils {

    public static void successToast(Context context, String str) {
        Toasty.success(context, str, Toasty.LENGTH_SHORT, true).show();
    }

    public static void infoToast(Context context, String str) {
        Toasty.info(context, str, Toasty.LENGTH_SHORT, true).show();
    }

    public static void errorToast(Context context, String str) {
        Toasty.error(context, str, Toasty.LENGTH_SHORT, true).show();
    }

    @SuppressLint("ResourceType")
    public static void warningToast(Context context, String str) {
        Toasty.custom(context,  str, R.drawable.ic_stats, Color.parseColor("#FFA500"), Toasty.LENGTH_SHORT, true, true).show();
    }
}
