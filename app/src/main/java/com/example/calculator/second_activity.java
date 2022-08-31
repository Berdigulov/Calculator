package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class second_activity extends AppCompatActivity {

    private TextView text_result;
    private MaterialButton redButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text_result = findViewById(R.id.text_centre);
        String text =getIntent().getStringExtra("key1");
        text_result.setText(text);
        redButton = findViewById(R.id.btn_main);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

    }
}