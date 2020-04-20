package com.samad_talukder.covid_19.model;

import com.google.gson.annotations.SerializedName;
import com.samad_talukder.covid_19.utils.NullRemoveUtil;

import java.util.List;

public class StateByCountryResponse {
    @SerializedName("country")
    private String country;

    @SerializedName("latest_stat_by_country")
    private List<LatestStatByCountry> latestStatByCountry;

    public String getCountry() {
        return NullRemoveUtil.getNotNull(country);
    }

    public List<LatestStatByCountry> getLatestStatByCountry() {
        return NullRemoveUtil.getNotNull(latestStatByCountry);
    }


}
