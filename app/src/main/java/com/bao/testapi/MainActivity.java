package com.bao.testapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import com.bao.testapi.client.CountryAdapter;
import com.bao.testapi.data.model.Geoname;
import com.bao.testapi.data.model.SOAnswersResponse;
import com.bao.testapi.data.remote.ApiClient;
import com.bao.testapi.data.remote.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity{
    private CountryAdapter recyclerAdapter;
    private RecyclerView mRecyclerView;
    static List<Geoname> geonames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        geonames =new ArrayList<>();

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new CountryAdapter(getApplicationContext(), geonames);
        mRecyclerView.setAdapter(recyclerAdapter);
        getApi();
        EditText filterText=findViewById(R.id.search);
        filterText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }
        });

    }


    void getApi(){
        ApiInterface apiInterface=ApiClient.getClient().create(ApiInterface.class);
        Call<SOAnswersResponse> call=apiInterface.getAnswers();
        call.enqueue(new Callback<SOAnswersResponse>() {
            @Override
            public void onResponse(Call<SOAnswersResponse> call, Response<SOAnswersResponse> response) {
                Log.d("Log", response.body().getGeonames().toString());
                geonames=response.body().getGeonames();
                recyclerAdapter.updateAPI(geonames);
            }

            @Override
            public void onFailure(Call<SOAnswersResponse> call, Throwable t) {
                Log.d("TAG", t.toString());
            }
        });
    }

    private void filter(String toString) {
        List<Geoname> filteredList=new ArrayList<>();
        for(Geoname c: geonames){
            if(c.getCountryName().toLowerCase().contains(toString.toLowerCase()))
            {
                filteredList.add(c);
            }
        }
        recyclerAdapter.updateAPI(filteredList);
    }


}