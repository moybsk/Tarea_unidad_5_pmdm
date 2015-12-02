package com.example.moises.tarea_unidad_5_pmdm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    private Button registro, loterias, ajustes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        registro = (Button) findViewById(R.id.registro);
        loterias = (Button) findViewById(R.id.loterias);
        ajustes = (Button) findViewById(R.id.ajustes);

        //Implementamos el evento “click” del botón
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Principal.this, Registro.class);
                startActivity(intent);
            }
        });
        loterias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Principal.this, Loterias.class);
                startActivity(intent);
            }
        });
        ajustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Principal.this, Ajustes.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public void onClick(View v) {

    }
}
