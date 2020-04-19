package com.samad_talukder.covid_19.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.samad_talukder.covid_19.model.StateByCountryResponse;
import com.samad_talukder.covid_19.model.WorldStateResponse;
import com.samad_talukder.covid_19.repository.StatByCountryRepository;
import com.samad_talukder.covid_19.repository.WorldStatRepository;

public class StatByCountryViewModel extends AndroidViewModel {
    private StatByCountryRepository statByCountryRepository;

    public StatByCountryViewModel(@NonNull Application application) {
        super(application);
        statByCountryRepository = new StatByCountryRepository(application);
    }

    public LiveData<StateByCountryResponse> getWorldStateLiveData(String country) {
        return statByCountryRepository.getStateByCountryLiveData(country);
    }
}
