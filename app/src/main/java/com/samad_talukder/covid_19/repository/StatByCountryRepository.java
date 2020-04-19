package com.samad_talukder.covid_19.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.samad_talukder.covid_19.api.ApiClient;
import com.samad_talukder.covid_19.model.StateByCountryResponse;
import com.samad_talukder.covid_19.model.WorldStateResponse;
import com.samad_talukder.covid_19.utils.AppConstant;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class StatByCountryRepository {

    private MutableLiveData<StateByCountryResponse> statByCountryLiveData = new MutableLiveData<>();
    private Context context;

    public StatByCountryRepository(Context context) {
        ApiClient.getApiService();
        this.context = context;
    }

    public LiveData<StateByCountryResponse> getStateByCountryLiveData(String country) {

        ApiClient.getApiService().getStateByCountryResponse(country).enqueue(new Callback<StateByCountryResponse>() {
            @Override
            public void onResponse(@NotNull Call<StateByCountryResponse> call, @NotNull Response<StateByCountryResponse> response) {
                if (response.isSuccessful()) {
                    Timber.e("Success State By Country Response");
                    StateByCountryResponse stateByCountryResponse = response.body();
                    if (stateByCountryResponse!=null){
                        statByCountryLiveData.setValue(stateByCountryResponse);
                    }
                }
            }

            @Override
            public void onFailure(@NotNull Call<StateByCountryResponse> call, @NotNull Throwable t) {
                Timber.e(AppConstant.ERROR + t.getMessage());

            }
        });

        return statByCountryLiveData;
    }
}
