package com.exemplo.tripvr.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.exemplo.tripvr.R;
import com.exemplo.tripvr.helper.FirebaseHelper;
import com.google.firebase.database.DatabaseReference;

public class CategoriasActivity extends AppCompatActivity {

    private Spinner spinnerPalacios;
    private Spinner spinnerTeatros;
    private Spinner spinnerParques;
    private Spinner spinnerMuseus;
    private ImageButton btnvoltar;

    private DatabaseReference db;
    int currentItem =0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        db = FirebaseHelper.getFirebase();


        setContentView(R.layout.activity_categorias);

        inicializarComponentes();

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

        spinnerMuseus.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
        spinnerTeatros.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        spinnerParques.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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



        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent 
            }
        });


    }

    private void inicializarComponentes(){
        spinnerMuseus = findViewById(R.id.spinnerMuseus);
        spinnerPalacios = findViewById(R.id.spinnerPalacios);
        spinnerParques = findViewById(R.id.spinnerParques);
        spinnerTeatros = findViewById(R.id.spinnerTeatros);
        btnvoltar = findViewById(R.id.btn_voltar_principal);
    }

}

