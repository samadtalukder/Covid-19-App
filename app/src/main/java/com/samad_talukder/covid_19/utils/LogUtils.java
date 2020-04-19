package com.samad_talukder.covid_19.utils;


import com.samad_talukder.covid_19.BuildConfig;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timber.log.Timber;

public class LogUtils {
    public static void timberLogInitialize(final String tagName) {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree() {
                @Override
                protected @Nullable String createStackElementTag(@NotNull StackTraceElement element) {
                    return tagName + ":[" + super.createStackElementTag(element) + ":" + element.getLineNumber() + "]";
                }
            });
        }
    }
}
