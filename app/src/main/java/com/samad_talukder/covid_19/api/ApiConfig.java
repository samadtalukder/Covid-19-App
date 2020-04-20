package com.samad_talukder.covid_19.api;

import com.samad_talukder.covid_19.model.CountriesStatResponse;
import com.samad_talukder.covid_19.model.CountryResponse;
import com.samad_talukder.covid_19.model.StateByCountryResponse;
import com.samad_talukder.covid_19.model.WorldStateResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiConfig {

    @GET(URLConstant.COVID_19_COUNTRIES)
    Call<List<CountryResponse>> getCountryList();

    @GET(URLConstant.WORLD_STAT)
    Call<WorldStateResponse> getWorldStateResponse();

    @GET(URLConstant.LATEST_STAT_BY_COUNTRY)
    Call<StateByCountryResponse> getStateByCountryResponse(
            @Query("country") String country
    );

    @GET(URLConstant.CASES_BY_COUNTRY)
    Call<CountriesStatResponse> getAllCountriesResponse();

    @GET(URLConstant.HISTORY_BY_PARTICULAR_COUNTRY_BY_DATE)
    Call<StateByCountryResponse> getCountryHistoryByDateResponse(
            @Query("country") String country,
            @Query("date") String date
    );

}
