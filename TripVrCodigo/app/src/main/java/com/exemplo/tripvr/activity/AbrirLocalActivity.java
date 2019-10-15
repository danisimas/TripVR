package com.exemplo.tripvr.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.exemplo.tripvr.R;
import com.exemplo.tripvr.activity.CategoriasActivity;
import com.exemplo.tripvr.model.Categorias;

public class AbrirLocalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_abrir_local);

        ImageButton btn_voltar = findViewById(R.id.btn_voltar_categoria);
        btn_voltar.setOnClickListener(new View.OnClickListener() {

            public void onBackPressed() {

                Intent intent = new Intent(AbrirLocalActivity.this, CategoriasActivity.class);
                startActivity(intent);

                return;
            }

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}
