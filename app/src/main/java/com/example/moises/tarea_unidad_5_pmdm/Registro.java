package com.example.moises.tarea_unidad_5_pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity implements View.OnClickListener {
private Button validar,volver;
    private EditText nombre,edad,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        validar = (Button) findViewById(R.id.validar);
        volver = (Button) findViewById(R.id.volver);
        nombre = (EditText) findViewById(R.id.nombre);
        edad = (EditText) findViewById(R.id.edad);
        email = (EditText) findViewById(R.id.email);
        final int[] intEdad = new int[1];
        validar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                intEdad[0] = Integer.parseInt(edad.getText().toString());
                if(intEdad[0]<18){
                tostada(String.valueOf(R.string.tostadaValidarMenor));
            }else{
                    tostada(String.valueOf(R.string.tostadaValidarMayor));
                }
        }});
        volver.setOnClickListener(this);


    }
    public void onClick(View view) {
        Intent i = new Intent(this, Principal.class);

        startActivity(i);
    }

    private void tostada(String str) {
        Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
    }
}
