package com.bao.testapi.data.remote;

import com.bao.testapi.data.model.SOAnswersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("countryInfoJSON?username=baovip0201")
    Call<SOAnswersResponse> getAnswers();
}
