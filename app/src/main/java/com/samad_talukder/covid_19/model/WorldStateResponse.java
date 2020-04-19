package com.samad_talukder.covid_19.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WorldStateResponse {
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
    @SerializedName("serious_critical")

    private String seriousCritical;
    @SerializedName("total_cases_per_1m_population")

    private String totalCasesPer1mPopulation;
    @SerializedName("deaths_per_1m_population")

    private String deathsPer1mPopulation;
    @SerializedName("statistic_taken_at")

    private String statisticTakenAt;

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

    public String getSeriousCritical() {
        return seriousCritical;
    }

    public void setSeriousCritical(String seriousCritical) {
        this.seriousCritical = seriousCritical;
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

    public String getStatisticTakenAt() {
        return statisticTakenAt;
    }

    public void setStatisticTakenAt(String statisticTakenAt) {
        this.statisticTakenAt = statisticTakenAt;
    }
}
