package com.samad_talukder.covid_19.model;

public class WorldStateResponse {
    public String total_cases;
    public String total_deaths;
    public String total_recovered;
    public String new_cases;
    public String new_deaths;
    public String statistic_taken_at;

    public String getTotal_cases() {
        return total_cases;
    }

    public String getTotal_deaths() {
        return total_deaths;
    }

    public String getTotal_recovered() {
        return total_recovered;
    }

    public String getNew_cases() {
        return new_cases;
    }

    public String getNew_deaths() {
        return new_deaths;
    }

    public String getStatistic_taken_at() {
        return statistic_taken_at;
    }
}
