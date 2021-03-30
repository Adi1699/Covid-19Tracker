package com.aditya.covid_19tracker.ui.country;

public class CovidCountry {

    String mCovidCountry, mcases, mTodayCases, mDeaths, mTodayDeaths, mRecovered, mCritical;

    public CovidCountry(String mCovidCountry, String mcases) {
        this.mCovidCountry = mCovidCountry;
        this.mcases = mcases;
        this.mTodayCases = mTodayCases;
        this.mDeaths = mDeaths;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecovered = mRecovered;
        this.mCritical = mCritical;
    }

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public String getMcases() {
        return mcases;
    }
}
