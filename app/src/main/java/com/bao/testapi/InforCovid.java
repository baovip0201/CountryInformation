package com.bao.testapi;

import static com.bao.testapi.client.CountryAdapter.countryList1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bao.testapi.data.model.Geoname;
import com.squareup.picasso.Picasso;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class InforCovid extends AppCompatActivity {
    TextView population, area, countryName, capital;
    ImageView back, flag;
    int position=-1;
    List<Geoname> lists;
    Locale localeEN=new Locale("en","EN");
    NumberFormat en=NumberFormat.getInstance(localeEN);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor_covid);
        initView();
        getIntentMethod();
        metaData();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(InforCovid.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    private void getIntentMethod() {
        position=getIntent().getIntExtra("position",-1);
    }

    private void metaData() {
        lists=countryList1;
        Locale locale=new Locale("en","EN");
        NumberFormat en=NumberFormat.getInstance(locale);

        population.setText(en.format(lists.get(position).getPopulation())+" người");
        countryName.setText(lists.get(position).getCountryName());
        area.setText(en.format(lists.get(position).getAreaInSqKm())+" km2");
        capital.setText(lists.get(position).getCapital());

        String flagUrl="https://img.geonames.org/flags/x/"+lists.get(position).getCountryCode().toLowerCase()+".gif";
        Picasso.with(getApplicationContext())
                .load(flagUrl)
                .into(flag);

    }

    private void initView() {
        countryName=findViewById(R.id.country);
        population=findViewById(R.id.population);
        area=findViewById(R.id.area);
        capital=findViewById(R.id.capital);
        flag=findViewById(R.id.flag);
        back=findViewById(R.id.back);
    }
}