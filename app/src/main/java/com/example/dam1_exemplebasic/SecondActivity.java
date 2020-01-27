package com.example.dam1_exemplebasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mensaje = findViewById(R.id.secondTextView);

        String msg = getIntent().getStringExtra("MENSAJE");

        mensaje.setText(msg);

    }
}
