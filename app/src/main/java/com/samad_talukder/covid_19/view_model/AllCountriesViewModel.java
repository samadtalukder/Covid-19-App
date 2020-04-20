package com.samad_talukder.covid_19.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.samad_talukder.covid_19.model.CountriesStatResponse;
import com.samad_talukder.covid_19.model.CountryResponse;
import com.samad_talukder.covid_19.model.StateByCountryResponse;
import com.samad_talukder.covid_19.model.WorldStateResponse;
import com.samad_talukder.covid_19.repository.AllCountriesRepository;
import com.samad_talukder.covid_19.repository.WorldStatRepository;

import java.util.List;

public class AllCountriesViewModel extends AndroidViewModel {
    private AllCountriesRepository allCountriesRepository;

    public AllCountriesViewModel(@NonNull Application application) {
        super(application);
        allCountriesRepository = new AllCountriesRepository(application);
    }

    public LiveData<CountriesStatResponse> getStateByCountryLiveData() {
        return allCountriesRepository.getCountriesStatResponseLiveData();
    }
}
