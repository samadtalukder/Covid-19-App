package com.samad_talukder.covid_19.api;

import com.samad_talukder.covid_19.model.WorldStateResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiConfig {
    @GET(URLConstant.WORLD_STAT)
    Call<WorldStateResponse> getWorldStateResponse();

}
