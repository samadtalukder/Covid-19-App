package com.samad_talukder.covid_19.model;

import com.google.gson.annotations.SerializedName;

public class CountryResponse {
    @SerializedName("name")
   
    private String name;
    @SerializedName("total_cases")
   
    private String totalCases;
    @SerializedName("new_cases")
   
    private String newCases;
    @SerializedName("total_deaths")
   
    private String totalDeaths;
    @SerializedName("new_deaths")
   
    private String newDeaths;
    @SerializedName("total_recovered")
   
    private String totalRecovered;
    @SerializedName("active_cases")
   
    private String activeCases;
    @SerializedName("critical_cases")
   
    private String criticalCases;
    @SerializedName("flag")
   
    private String flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(String totalCases) {
        this.totalCases = totalCases;
    }

    public String getNewCases() {
        return newCases;
    }

    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }

    public String getCriticalCases() {
        return criticalCases;
    }

    public void setCriticalCases(String criticalCases) {
        this.criticalCases = criticalCases;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
