package com.exemplo.tripvr.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.exemplo.tripvr.CategoriasActivity;
import com.exemplo.tripvr.R;

public class PrincipalFragment extends Fragment {

    private Button btn_categorias;

    public PrincipalFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_principal,container,false);
        inicializarComponentes(view);
        btn_categorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i = new Intent(getContext(),CategoriasActivity.class);
                startActivity(i);
            }
        });
        return view;

    }


    private void  inicializarComponentes(View v){


        btn_categorias = v.findViewById(R.id.btn_categorias);


    }

}
