package com.samad_talukder.covid_19.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.samad_talukder.covid_19.api.ApiClient;
import com.samad_talukder.covid_19.api.ApiConfig;
import com.samad_talukder.covid_19.model.WorldStateResponse;
import com.samad_talukder.covid_19.utils.AppConstant;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class WorldStatRepository {

    private MutableLiveData<WorldStateResponse> worldStateLiveData = new MutableLiveData<>();
    private Context context;

    public WorldStatRepository(Context context) {
        ApiClient.getApiService();
        this.context = context;
    }

    public LiveData<WorldStateResponse> getWorldStateLiveData() {

        ApiClient.getApiService().getWorldStateResponse().enqueue(new Callback<WorldStateResponse>() {
            @Override
            public void onResponse(@NotNull Call<WorldStateResponse> call, @NotNull Response<WorldStateResponse> response) {
                if (response.isSuccessful()) {
                    Timber.e("Success");
                    WorldStateResponse worldStateResponse = response.body();
                    if (worldStateResponse!=null){
                        worldStateLiveData.setValue(worldStateResponse);
                    }

                }
            }

            @Override
            public void onFailure(@NotNull Call<WorldStateResponse> call, @NotNull Throwable t) {
                Timber.e(AppConstant.ERROR + t.getMessage());

            }
        });

        return worldStateLiveData;
    }
}
