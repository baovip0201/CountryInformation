package com.bao.testapi.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SOAnswersResponse {
    @SerializedName("geonames")
    @Expose
    private List<com.bao.testapi.data.model.Geoname> geonames = null;

    public List<com.bao.testapi.data.model.Geoname> getGeonames() {
        return geonames;
    }
    public void setGeonames(List<com.bao.testapi.data.model.Geoname> geonames) {
        this.geonames = geonames;
    }

}

