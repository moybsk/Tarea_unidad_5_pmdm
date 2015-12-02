package com.example.moises.tarea_unidad_5_pmdm;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;

public class Ajustes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("dinero");
        spec.setContent(R.id.tabDinero);
        spec.setIndicator("Dinero",
                res.getDrawable(android.R.drawable.sym_call_incoming));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("combinacion");
        spec.setContent(R.id.tabCombinacion);
        spec.setIndicator("Combinacion",
                res.getDrawable(android.R.drawable.sym_call_outgoing));
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        //Array de valores del adaptador
        String[] datos = new String[]{"1","2","5","10"};

        //Creamos el adaptador
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item,datos);

        //Asociamos el adaptador a la vista
        Spinner selectorDinero = (Spinner) findViewById(R.id.selectorDinero);
        selectorDinero.setAdapter(adaptador);
    }
}
