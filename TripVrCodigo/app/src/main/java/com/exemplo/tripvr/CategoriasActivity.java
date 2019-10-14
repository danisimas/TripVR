package com.exemplo.tripvr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CategoriasActivity extends AppCompatActivity {

    Spinner spinnerPalacios;
    Spinner spinnerTeatros;
    Spinner spinnerPArques;
    Spinner spinnerMuseus;

    int currentItem =0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_categorias);

        spinnerPalacios = (Spinner)findViewById(R.id.spinner_palacios);

        spinnerPalacios.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(currentItem==position){
                    return;
                }else{
                    Intent intent = new Intent(CategoriasActivity.this, AbrirLocalActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ImageButton btnvoltar;
        btnvoltar = findViewById(R.id.btn_voltar);

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }




}

