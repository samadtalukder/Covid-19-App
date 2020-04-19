package com.samad_talukder.covid_19.api;

import com.samad_talukder.covid_19.model.StateByCountryResponse;
import com.samad_talukder.covid_19.model.WorldStateResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiConfig {

    @GET(URLConstant.WORLD_STAT)
    Call<WorldStateResponse> getWorldStateResponse();

    @GET(URLConstant.LATEST_STAT_BY_COUNTRY)
    Call<StateByCountryResponse> getStateByCountryResponse(
            @Query("country") String country
    );

}
