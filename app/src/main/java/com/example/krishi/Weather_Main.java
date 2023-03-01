package com.example.krishi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Weather_Main extends AppCompatActivity {

    RelativeLayout idRLHome;
    ProgressBar pbloading;
    ImageView IvSearch,idBack, idTVTempIcon;
    TextView tvCityName,TVTemp,idTvCondition;
    TextInputEditText idEdtCity;
    RecyclerView idRvWeather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_main);

        idRLHome = findViewById(R.id.idRLHome);
        pbloading = findViewById(R.id.pbloading);
        idRLHome = findViewById(R.id.idRLHome);
        IvSearch = findViewById(R.id.IvSearch);
        idBack = findViewById(R.id.idBack);
        idTVTempIcon = findViewById(R.id.idTVTempIcon);
        tvCityName = findViewById(R.id.tvCityName);
        TVTemp = findViewById(R.id.TVTemp);
        idEdtCity = findViewById(R.id.idEdtCity);
        idRvWeather = findViewById(R.id.idRvWeather);
        idTvCondition = findViewById(R.id.idTvCondition);
    }
}