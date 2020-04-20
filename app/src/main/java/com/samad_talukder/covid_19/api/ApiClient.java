package com.samad_talukder.covid_19.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.itkacher.okhttpprofiler.OkHttpProfilerInterceptor;
import com.samad_talukder.covid_19.BuildConfig;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiClient implements URLConstant {
    private static Retrofit retrofit = null;
    private static Retrofit customRetrofit = null;

    private static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URLConstant.BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(okHttpClient())
                    .build();
        }
        return retrofit;
    }

    public static Retrofit getRetrofitInstance(String CUSTOM_BASE_URL) {
        if (customRetrofit == null) {
            customRetrofit = new Retrofit.Builder()
                    .baseUrl(CUSTOM_BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(okHttpClient())
                    .build();
        }
        return customRetrofit;
    }

    private static OkHttpClient okHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        builder.readTimeout(360, TimeUnit.SECONDS).connectTimeout(360, TimeUnit.SECONDS);

        builder.addInterceptor(new Interceptor() {
            @NotNull
            @Override
            public Response intercept(@NotNull Chain chain) throws IOException {
                Request request = chain.request().newBuilder()
                        .addHeader(URLConstant.HEADER_HOST_NAME, URLConstant.HEADER_HOST_VALUE)
                        .addHeader(URLConstant.HEADER_KEY_NAME, URLConstant.HEADER_KEY_VALUE)
                        .build();
                return chain.proceed(request);
            }
        });

        if (BuildConfig.DEBUG) {
            builder.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
            builder.addInterceptor(new OkHttpProfilerInterceptor());
        }

        return builder.build();
    }

    private static Gson gson = new GsonBuilder().setLenient().create();

    public static ApiConfig getApiService() {
        return getRetrofitInstance().create(ApiConfig.class);
    }


}
