package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ExtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String type = extras.getString("Potato");
            int number = extras.getInt("seven");

            TextView ExtrasTextView = findViewById(R.id.ExtrasTextView);
            ExtrasTextView.setText("Potatos are great. Especially the type " + type + ". And Atleast " + number + " Each meal.");

        }
    }
}