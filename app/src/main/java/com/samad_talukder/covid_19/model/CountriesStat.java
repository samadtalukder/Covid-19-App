package com.samad_talukder.covid_19.model;

import com.google.gson.annotations.SerializedName;

public class CountriesStat {
    @SerializedName("country_name")
    
    private String countryName;
    @SerializedName("cases")
    
    private String cases;
    @SerializedName("deaths")
    
    private String deaths;
    @SerializedName("region")
    
    private String region;
    @SerializedName("total_recovered")
    
    private String totalRecovered;
    @SerializedName("new_deaths")
    
    private String newDeaths;
    @SerializedName("new_cases")
    
    private String newCases;
    @SerializedName("serious_critical")
    
    private String seriousCritical;
    @SerializedName("active_cases")
    
    private String activeCases;
    @SerializedName("total_cases_per_1m_population")
    
    private String totalCasesPer1mPopulation;
    @SerializedName("deaths_per_1m_population")
    
    private String deathsPer1mPopulation;
    @SerializedName("total_tests")
    
    private String totalTests;
    @SerializedName("tests_per_1m_population")
    
    private String testsPer1mPopulation;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getNewCases() {
        return newCases;
    }

    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public String getSeriousCritical() {
        return seriousCritical;
    }

    public void setSeriousCritical(String seriousCritical) {
        this.seriousCritical = seriousCritical;
    }

    public String getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }

    public String getTotalCasesPer1mPopulation() {
        return totalCasesPer1mPopulation;
    }

    public void setTotalCasesPer1mPopulation(String totalCasesPer1mPopulation) {
        this.totalCasesPer1mPopulation = totalCasesPer1mPopulation;
    }

    public String getDeathsPer1mPopulation() {
        return deathsPer1mPopulation;
    }

    public void setDeathsPer1mPopulation(String deathsPer1mPopulation) {
        this.deathsPer1mPopulation = deathsPer1mPopulation;
    }

    public String getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(String totalTests) {
        this.totalTests = totalTests;
    }

    public String getTestsPer1mPopulation() {
        return testsPer1mPopulation;
    }

    public void setTestsPer1mPopulation(String testsPer1mPopulation) {
        this.testsPer1mPopulation = testsPer1mPopulation;
    }
}
