package com.sazid.destinationhunter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.sazid.destinationhunter.adapter.RecentsAdapter;
import com.sazid.destinationhunter.adapter.TopPlacesAdapter;
import com.sazid.destinationhunter.model.RecentsData;
import com.sazid.destinationhunter.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;
public class MainActivity2 extends AppCompatActivity {
    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;
    ImageView profile,flight,hotel, imageprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        profile = (ImageView)findViewById(R.id.profile);
        imageprofile = (ImageView)findViewById(R.id.imageprofile);
        flight = (ImageView)findViewById(R.id.flight);
        hotel = (ImageView)findViewById(R.id.hotel);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),profilepage.class);
                startActivity(intent);
            }
        });
        imageprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),profilepage.class);
                startActivity(intent);
            }
        });
        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),flight.class);
                startActivity(intent);
            }
        });
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),holetpage.class);
                startActivity(intent);
            }
        });
        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Vinno Jagat","Banglabesh","From 2,000Tk",R.drawable.a));
        recentsDataList.add(new RecentsData("Sundarban","Banglabesh","From 2,500Tk",R.drawable.b));
        recentsDataList.add(new RecentsData("Jaflong, Sylhet","Banglabesh","From 3,000Tk",R.drawable.c));
        recentsDataList.add(new RecentsData("Cox's Bazar","Banglabesh","From 4,000Tk",R.drawable.d));
        recentsDataList.add(new RecentsData("Sundarban","Banglabesh","From 2,500Tk",R.drawable.sundora));
        recentsDataList.add(new RecentsData("Cox's Bazar","Banglabesh","From 4,000Tk",R.drawable.coxc));
        setRecentRecycler(recentsDataList);
        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Cox's Bazar","Banglabesh","4,000Tk - 8,000Tk",R.drawable.coxb));
        topPlacesDataList.add(new TopPlacesData("Sundarban","Banglabesh","2,500Tk - 3,500Tk",R.drawable.sundorb));
        topPlacesDataList.add(new TopPlacesData("Vinno Jagat","Banglabesh","2,000Tk - 6,000Tk",R.drawable.vinnoa));
        topPlacesDataList.add(new TopPlacesData("Jaflong, Sylhet","Banglabesh","3,000Tk - 6,000Tk",R.drawable.jafa));
        topPlacesDataList.add(new TopPlacesData("Cox's Bazar","Banglabesh","4,000Tk - 8,000Tk",R.drawable.coxc));
        setTopPlacesRecycler(topPlacesDataList);
    }
    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList) {
        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);
    }
    private void setRecentRecycler(List<RecentsData> recentsDataList) {
        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
}