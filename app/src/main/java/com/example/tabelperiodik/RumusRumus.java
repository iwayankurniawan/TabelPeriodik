package com.example.tabelperiodik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class RumusRumus extends AppCompatActivity {

    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus_rumus);

        ImageButton GoToAfinitasElektron = (ImageButton) findViewById(R.id.AfinitasElektron);
        GoToAfinitasElektron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                score = 1;
                pindah();
            }
        });

        ImageButton GoToEnergiIonisasi = (ImageButton) findViewById(R.id.EnergiIonisasi);
        GoToEnergiIonisasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                score = 2;
                pindah();
            }
        });

        ImageButton GoToJariAtom = (ImageButton) findViewById(R.id.JariAtom);
        GoToJariAtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                score = 3;
                pindah();
            }
        });

        ImageButton GoToKelektronegatifan = (ImageButton) findViewById(R.id.Kelektronegatifan);
        GoToKelektronegatifan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                score = 4;
                pindah();
            }
        });
    }

    public void pindah(){
        Intent intent = new Intent(this, IsiRumusRumus.class);
        intent.putExtra("my_score", score);
        startActivity(intent);
    }
}
