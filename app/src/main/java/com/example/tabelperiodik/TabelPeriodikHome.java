package com.example.tabelperiodik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class TabelPeriodikHome extends AppCompatActivity {

    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel_periodik_home);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            /*
        case R.id.add:
            startActivity(new Intent(TabelPeriodikHome.this,RumusRumus.class));
            return(true);
        case R.id.reset:
            startActivity(new Intent(TabelPeriodikHome.this,MudahMenghafal.class));
            return(true);*/
        case R.id.about:
            startActivity(new Intent(TabelPeriodikHome.this,MengurutkanUnsur.class));
            return(true);
       /* case R.id.game:
            startActivity(new Intent(TabelPeriodikHome.this,game.class));
            return(true);
        case R.id.exit:
            finish();
            return(true);*/
    }
        return(super.onOptionsItemSelected(item));
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
