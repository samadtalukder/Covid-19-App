package com.samad_talukder.covid_19.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StateByCountryResponse {
    @SerializedName("country")
    private String country;

    @SerializedName("latest_stat_by_country")
    private List<LatestStatByCountry> latestStatByCountry;

    public String getCountry() {
        return country;
    }

    public List<LatestStatByCountry> getLatestStatByCountry() {
        return latestStatByCountry;
    }


}
