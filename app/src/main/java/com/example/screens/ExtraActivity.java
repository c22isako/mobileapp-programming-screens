package com.example.screens;

import static android.content.Intent.getIntent;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


public class ExtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("Potato");
            int number = extras.getInt("seven");

            //Log.d("Tomat", name);

            TextView ExtrasTextView = findViewById(R.id.ExtrasTextView);
            ExtrasTextView.setText("Potatos are great. ");
            // Do something with the name and number
        }
    }
}