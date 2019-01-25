package com.example.oeloem.dasar2spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Atribut
    TextView txtPilih;
    private Spinner spinner;
    private String[] list = {"Pilih", "Indonesia", "Amerika Serikat", "Arab Saudi", "China", "Jepang"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find viewnya
        txtPilih = findViewById(R.id.txtSpinner);
        spinner = findViewById(R.id.spinner);

        //Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long I) {
                //Memasukan Parameter
                txtPilih.setText(list[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Jika tidak di klik
                txtPilih.setText(" ");
            }
        });

        //Array
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
