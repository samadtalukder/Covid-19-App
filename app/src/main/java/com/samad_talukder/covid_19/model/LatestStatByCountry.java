package com.samad_talukder.covid_19.model;

import com.google.gson.annotations.SerializedName;

public class LatestStatByCountry {
    @SerializedName("id")
    private String id;

    @SerializedName("country_name")
    private String countryName;

    @SerializedName("total_cases")
    private String totalCases;

    @SerializedName("new_cases")
    private String newCases;

    @SerializedName("active_cases")
    private String activeCases;

    @SerializedName("total_deaths")
    private String totalDeaths;

    @SerializedName("new_deaths")
    private String newDeaths;

    @SerializedName("total_recovered")
    private String totalRecovered;

    @SerializedName("serious_critical")
    private String seriousCritical;

    @SerializedName("region")
    
    private Object region;
    @SerializedName("total_cases_per1m")
    
    private String totalCasesPer1m;
    @SerializedName("record_date")
    
    private String recordDate;
    @SerializedName("deaths_per1m")
    
    private String deathsPer1m;
    @SerializedName("total_tests")
    
    private String totalTests;
    @SerializedName("total_tests_per1m")
    
    private String totalTestsPer1m;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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

    public String getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
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

    public String getSeriousCritical() {
        return seriousCritical;
    }

    public void setSeriousCritical(String seriousCritical) {
        this.seriousCritical = seriousCritical;
    }

    public Object getRegion() {
        return region;
    }

    public void setRegion(Object region) {
        this.region = region;
    }

    public String getTotalCasesPer1m() {
        return totalCasesPer1m;
    }

    public void setTotalCasesPer1m(String totalCasesPer1m) {
        this.totalCasesPer1m = totalCasesPer1m;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getDeathsPer1m() {
        return deathsPer1m;
    }

    public void setDeathsPer1m(String deathsPer1m) {
        this.deathsPer1m = deathsPer1m;
    }

    public String getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(String totalTests) {
        this.totalTests = totalTests;
    }

    public String getTotalTestsPer1m() {
        return totalTestsPer1m;
    }

    public void setTotalTestsPer1m(String totalTestsPer1m) {
        this.totalTestsPer1m = totalTestsPer1m;
    }
}
