package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvDetailName, tvDetailNumber, tvDetailStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvDetailName = findViewById(R.id.tvDetailName);
        tvDetailNumber = findViewById(R.id.tvDetailNumber);
        tvDetailStatus = findViewById(R.id.tvDetailStatus);

        ContactModel element = (ContactModel) getIntent().getSerializableExtra("ContactModel");
        tvDetailName.setText(element.getName());
        tvDetailName.setTextColor(Color.parseColor(element.getColor()));
        tvDetailNumber.setText(element.getNumber());
        tvDetailStatus.setText(element.getStatus());


    }
}