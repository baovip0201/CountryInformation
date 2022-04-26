package com.bao.testapi.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geoname {

    @SerializedName("continent")
    @Expose
    private String continent;
    @SerializedName("capital")
    @Expose
    private String capital;
    @SerializedName("languages")
    @Expose
    private String languages;
    @SerializedName("geonameId")
    @Expose
    private Integer geonameId;
    @SerializedName("south")
    @Expose
    private Double south;
    @SerializedName("isoAlpha3")
    @Expose
    private String isoAlpha3;
    @SerializedName("north")
    @Expose
    private Double north;
    @SerializedName("fipsCode")
    @Expose
    private String fipsCode;
    @SerializedName("population")
    @Expose
    private int population;
    @SerializedName("east")
    @Expose
    private Double east;
    @SerializedName("isoNumeric")
    @Expose
    private String isoNumeric;
    @SerializedName("areaInSqKm")
    @Expose
    private Double areaInSqKm;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("west")
    @Expose
    private Double west;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("postalCodeFormat")
    @Expose
    private String postalCodeFormat;
    @SerializedName("continentName")
    @Expose
    private String continentName;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getAreaInSqKm() {
        return areaInSqKm;
    }

    public void setAreaInSqKm(double areaInSqKm) {
        this.areaInSqKm = areaInSqKm;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public Double getSouth() {
        return south;
    }

    public void setSouth(Double south) {
        this.south = south;
    }

    public String getIsoAlpha3() {
        return isoAlpha3;
    }

    public void setIsoAlpha3(String isoAlpha3) {
        this.isoAlpha3 = isoAlpha3;
    }

    public Double getNorth() {
        return north;
    }

    public void setNorth(Double north) {
        this.north = north;
    }

    public String getFipsCode() {
        return fipsCode;
    }

    public void setFipsCode(String fipsCode) {
        this.fipsCode = fipsCode;
    }



    public Double getEast() {
        return east;
    }

    public void setEast(Double east) {
        this.east = east;
    }

    public String getIsoNumeric() {
        return isoNumeric;
    }

    public void setIsoNumeric(String isoNumeric) {
        this.isoNumeric = isoNumeric;
    }



    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Double getWest() {
        return west;
    }

    public void setWest(Double west) {
        this.west = west;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPostalCodeFormat() {
        return postalCodeFormat;
    }

    public void setPostalCodeFormat(String postalCodeFormat) {
        this.postalCodeFormat = postalCodeFormat;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
