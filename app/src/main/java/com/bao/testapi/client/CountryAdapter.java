package com.bao.testapi.client;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.bao.testapi.InforCovid;
import com.bao.testapi.R;
import com.bao.testapi.data.model.Geoname;
import com.squareup.picasso.Picasso;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryItemViewHolder> {

    Context c;
    public static List<Geoname> countryList1;

    public CountryAdapter(Context c, List<Geoname> lists) {
        this.c = c;
        this.countryList1 = lists;
    }

    @Override
    public CountryAdapter.CountryItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new CountryItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CountryAdapter.CountryItemViewHolder holder, int position) {
        Geoname n = countryList1.get(position);

        String flagUrl="https://img.geonames.org/flags/x/"+n.getCountryCode().toLowerCase()+".gif";
        Picasso.with(c)
                .load(flagUrl)
                .into(holder.flag);
        holder.tvName.setText(n.getCountryName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(c, InforCovid.class);
                intent.putExtra("position", position);
                c.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return countryList1.size();
    }

    public void updateAPI(List<Geoname> countryArrayList){
        countryList1=countryArrayList;
        notifyDataSetChanged();
    }


    public static class CountryItemViewHolder extends RecyclerView.ViewHolder{
        public TextView tvName;
        public ImageView flag;



        public CountryItemViewHolder(View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.country_name);
            flag=itemView.findViewById(R.id.flag_img);
        }
    }
}

