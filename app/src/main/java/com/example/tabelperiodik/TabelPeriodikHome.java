package com.example.tabelperiodik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TabelPeriodikHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel_periodik_home);

        ImageButton h = (ImageButton) findViewById(R.id.H);
        ImageButton li = (ImageButton) findViewById(R.id.Li);

        h.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
             startActivity(new Intent(TabelPeriodikHome.this,H.class));

            }
        });
        li.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(TabelPeriodikHome.this,Li.class));

            }
        });
    }
}
