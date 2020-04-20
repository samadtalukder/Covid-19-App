package com.samad_talukder.covid_19.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.samad_talukder.covid_19.api.ApiClient;
import com.samad_talukder.covid_19.api.ApiConfig;
import com.samad_talukder.covid_19.api.URLConstant;
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

public class WorldStatRepository {
    private MutableLiveData<StateByCountryResponse> statByCountryLiveData = new MutableLiveData<>();
    private MutableLiveData<WorldStateResponse> worldStateLiveData = new MutableLiveData<>();
    private MutableLiveData<List<CountryResponse>> countryResponseLiveData = new MutableLiveData<>();
    private Context context;

    public WorldStatRepository(Context context) {
        ApiClient.getApiService();
        this.context = context;
    }

    public LiveData<List<CountryResponse>> getCountryResponseLiveData() {

        ApiConfig apiConfig = ApiClient.getRetrofitInstance(URLConstant.BASE_URL_COUNTRY).create(ApiConfig.class);

        apiConfig.getCountryList().enqueue(new Callback<List<CountryResponse>>() {
            @Override
            public void onResponse(@NotNull Call<List<CountryResponse>> call, @NotNull Response<List<CountryResponse>> response) {
                if (response.isSuccessful()) {
                    Timber.e("Country Response Success");

                    List<CountryResponse> countryResponse = response.body();
                    if (countryResponse != null) {
                        countryResponseLiveData.setValue(countryResponse);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<CountryResponse>> call, Throwable t) {
                Timber.e(AppConstant.ERROR + t.getMessage());
            }
        });



        return countryResponseLiveData;
    }

    public LiveData<WorldStateResponse> getWorldStateLiveData() {

        ApiClient.getApiService().getWorldStateResponse().enqueue(new Callback<WorldStateResponse>() {
            @Override
            public void onResponse(@NotNull Call<WorldStateResponse> call, @NotNull Response<WorldStateResponse> response) {
                if (response.isSuccessful()) {
                    Timber.e("Success");
                    WorldStateResponse worldStateResponse = response.body();
                    if (worldStateResponse != null) {
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

    public LiveData<StateByCountryResponse> getStateByCountryLiveData(String country) {

        ApiClient.getApiService().getStateByCountryResponse(country).enqueue(new Callback<StateByCountryResponse>() {
            @Override
            public void onResponse(@NotNull Call<StateByCountryResponse> call, @NotNull Response<StateByCountryResponse> response) {
                if (response.isSuccessful()) {
                    Timber.e("Success State By Country Response");
                    StateByCountryResponse stateByCountryResponse = response.body();
                    if (stateByCountryResponse != null) {
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
