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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CategoriasActivity extends AppCompatActivity {

    private Spinner spinnerPalacios;
    private Spinner spinnerTeatros;
    private Spinner spinnerParques;
    private Spinner spinnerMuseus;
    private ImageButton btnvoltar;
    private DatabaseReference db;
    private FirebaseDatabase firebaseDatabase;
    int currentItem = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_categorias);

        firebaseDatabase = FirebaseDatabase.getInstance();
        db = firebaseDatabase.getReference("locais");

        inicializarComponentes();
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    private void inicializarComponentes() {
        spinnerMuseus = findViewById(R.id.spinnerMuseus);
        spinnerPalacios = findViewById(R.id.spinnerPalacios);
        spinnerParques = findViewById(R.id.spinnerParques);
        spinnerTeatros = findViewById(R.id.spinnerTeatros);
        btnvoltar = findViewById(R.id.btn_voltar_principal);
    }


    private void pesquisarLocalFirebase(){

    }

}

