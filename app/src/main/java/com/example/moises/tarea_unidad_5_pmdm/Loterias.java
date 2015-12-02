package com.example.moises.tarea_unidad_5_pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loterias extends AppCompatActivity implements View.OnClickListener {
    private Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loterias);
        volver = (Button) findViewById(R.id.volver);
        volver.setOnClickListener(this);
    }
    public void onClick(View view) {
        Intent i = new Intent(this, Principal.class);

        startActivity(i);
}}
