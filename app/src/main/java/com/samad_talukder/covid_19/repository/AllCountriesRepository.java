package com.samad_talukder.covid_19.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.samad_talukder.covid_19.api.ApiClient;
import com.samad_talukder.covid_19.api.ApiConfig;
import com.samad_talukder.covid_19.api.URLConstant;
import com.samad_talukder.covid_19.model.CountriesStatResponse;
import com.samad_talukder.covid_19.model.CountryResponse;
import com.samad_talukder.covid_19.model.StateByCountryResponse;
import com.samad_talukder.covid_19.model.WorldStateResponse;
import com.samad_talukder.covid_19.utils.AppConstant;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class AllCountriesRepository {
    private MutableLiveData<CountriesStatResponse> countriesStatLiveData = new MutableLiveData<>();
    private Context context;

    public AllCountriesRepository(Context context) {
        ApiClient.getApiService();
        this.context = context;
    }

    public LiveData<CountriesStatResponse> getCountriesStatResponseLiveData() {

        ApiClient.getApiService().getAllCountriesResponse().enqueue(new Callback<CountriesStatResponse>() {
            @Override
            public void onResponse(@NotNull Call<CountriesStatResponse> call, @NotNull Response<CountriesStatResponse> response) {

                if (response.isSuccessful()) {

                    Timber.e("Success State By All Country Response");

                    CountriesStatResponse countriesStatResponse = response.body();

                    if (countriesStatResponse != null) {

                        countriesStatLiveData.setValue(countriesStatResponse);
                    }
                }
            }

            @Override
            public void onFailure(@NotNull Call<CountriesStatResponse> call, @NotNull Throwable t) {
                Timber.e("%s%s", AppConstant.ERROR, t.getMessage());

            }
        });

        return countriesStatLiveData;
    }
}
