package com.samad_talukder.covid_19.utils;

import java.util.ArrayList;
import java.util.List;

public interface NullRemoveUtil {

    static String getNotNull(String data) {
        return data == null ? "" : data;
    }

    static int getNotNull(int data) {
        return data;
    }

    static long getNotNull(long data) {
        return data;
    }

    static <T> List<T> getNotNull(List<T> data) {
        return data == null ? new ArrayList<>() : data;
    }
}
