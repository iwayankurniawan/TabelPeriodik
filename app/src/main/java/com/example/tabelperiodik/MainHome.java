package com.example.tabelperiodik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        Button GoToTabelPeriodik = (Button) findViewById(R.id.tabelperiodik);
        GoToTabelPeriodik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainHome.this, TabelPeriodikHome.class);
                startActivity(intent);
            }
        });

        Button GoToMudahMenghafal = (Button) findViewById(R.id.jembatan);
        GoToMudahMenghafal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainHome.this, MudahMenghafal.class);
                startActivity(intent);
            }
        });

        Button GoToRumusRumus = (Button) findViewById(R.id.sifatkeperiodikan);
        GoToRumusRumus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainHome.this, RumusRumus.class);
                startActivity(intent);
            }
        });

        Button GoToTentang = (Button) findViewById(R.id.Tentang);
        GoToTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainHome.this, tentang.class);
                startActivity(intent);
            }
        });

    }
}
