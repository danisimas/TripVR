package com.exemplo.tripvr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AbrirLocal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_abrir_local);
    }
}
