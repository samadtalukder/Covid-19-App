package com.samad_talukder.covid_19.api;

public interface URLConstant {
    String BASE_URL = "https://coronavirus-monitor.p.rapidapi.com/coronavirus/";
    String BASE_URL_COUNTRY = "https://us-central1-covid19stats-78dd3.cloudfunctions.net/";

    String WORLD_STAT = "worldstat.php";
    String AFFECTED_COUNTRY = "affected.php";
    String COVID_19_COUNTRIES = "covid19countries";
    String CASES_BY_COUNTRY = "cases_by_country.php";
    String LATEST_STAT_BY_COUNTRY = "latest_stat_by_country.php";
    String CASES_BY_PARTICULAR_COUNTRY = "cases_by_particular_country.php";
    String HISTORY_BY_PARTICULAR_COUNTRY_BY_DATE = "history_by_particular_country_by_date.php";


    String KEY_COUNTRY = "country";
    String KEY_DATE = "date";

    String HEADER_HOST_NAME = "x-rapidapi-host";
    String HEADER_HOST_VALUE = "coronavirus-monitor.p.rapidapi.com";
    String HEADER_KEY_NAME = "x-rapidapi-key";
    String HEADER_KEY_VALUE = "ecc2ac5209msh1d98f7f80327a7dp10bd9djsn691a95068531";
}
