package com.exemplo.tripvr;


import android.os.Bundle;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CategoriasActivity extends AppCompatActivity {


    Spinner btnMuseu,btnParque,btnPalacio,btnTeatro;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
            setContentView(R.layout.activity_categorias);
        }


        private void incializarComponentes(){
        btnMuseu = findViewById(R.id.spinnerMuseus);
        btnPalacio = findViewById(R.id.spinnerPalacios);
        btnParque = findViewById(R.id.spinnerParques);
        btnTeatro = findViewById(R.id.spinnerTeatros);

        }


}

