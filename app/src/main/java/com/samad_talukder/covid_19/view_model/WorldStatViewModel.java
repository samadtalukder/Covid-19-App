package com.samad_talukder.covid_19.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.samad_talukder.covid_19.model.WorldStateResponse;
import com.samad_talukder.covid_19.repository.WorldStatRepository;

public class WorldStatViewModel extends AndroidViewModel {
    private WorldStatRepository worldStatRepository;

    public WorldStatViewModel(@NonNull Application application) {
        super(application);
        worldStatRepository = new WorldStatRepository(application);
    }

    public LiveData<WorldStateResponse> getWorldStateLiveData() {
        return worldStatRepository.getWorldStateLiveData();
    }
}
