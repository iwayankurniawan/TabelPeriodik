package com.example.tabelperiodik;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MudahMenghafal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudah_menghafal);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button GoToIA = (Button) findViewById(R.id.IA);
        GoToIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                TextView GetNamaunsur = (TextView) findViewById(R.id.NamaUnsur);
                GetNamaunsur.setText("H\n\nLi\n\nNa\n\nK\n\nRb\n\nCs\n\nFr");

                Button GetSuaraUnsur = (Button) findViewById(R.id.ButtonSound);
                GetSuaraUnsur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(MudahMenghafal.this,R.raw.april);
                        mp.start();
                    }
                });

                TextView GetHafalan = (TextView) findViewById(R.id.Hafalan);
                GetHafalan.setText("- Hai LiNa Kau Rebut Calon Suami Fransiska" + "\n\n- HaLiNa Kawin Ruby Cs Frustasi");

                Button GotoGame = (Button) findViewById(R.id.Latihan);
                GotoGame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View view) {
                        Intent intent = new Intent(MudahMenghafal.this, game.class);
                        startActivity(intent);
                    }
                });
            }
        });

        Button GoToIIA = (Button) findViewById(R.id.IIA);
        GoToIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                TextView GetNamaunsur = (TextView) findViewById(R.id.NamaUnsur);
                GetNamaunsur.setText("Be\n\nMg\n\nCa\n\nSr\n\nBa\n\nRa");
                Button GetSuaraUnsur = (Button) findViewById(R.id.ButtonSound);
                GetSuaraUnsur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(MudahMenghafal.this,R.raw.august);
                        mp.start();
                    }
                });
                TextView GetHafalan = (TextView) findViewById(R.id.Hafalan);
                GetHafalan.setText("- Beli Mangga Campur Sirup Banyak Rasa"+"\n\n- Bemo Mogok Cari Serep Ban Radial");

                Button GotoGame = (Button) findViewById(R.id.Latihan);
                GotoGame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View view) {
                        Intent intent = new Intent(MudahMenghafal.this, gameIIA.class);
                        startActivity(intent);
                    }
                });
            }
        });

        Button GoToIIIA = (Button) findViewById(R.id.IIIA);
        GoToIIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                TextView GetNamaunsur = (TextView) findViewById(R.id.NamaUnsur);
                GetNamaunsur.setText("B\n\nAl\n\nGa\n\nIn\n\nTi");
                Button GetSuaraUnsur = (Button) findViewById(R.id.ButtonSound);
                GetSuaraUnsur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(MudahMenghafal.this,R.raw.camel);
                        mp.start();
                    }
                });
                TextView GetHafalan = (TextView) findViewById(R.id.Hafalan);
                GetHafalan.setText("- Bu AlGa InTi"+"\n\n- Boron Alamatnya Ganti di Indonesia Timur");

                Button GotoGame = (Button) findViewById(R.id.Latihan);
                GotoGame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View view) {
                        Intent intent = new Intent(MudahMenghafal.this, gameIIIA.class);
                        startActivity(intent);
                    }
                });
            }
        });

        Button GoToIVA = (Button) findViewById(R.id.IVA);
        GoToIVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                TextView GetNamaunsur = (TextView) findViewById(R.id.NamaUnsur);
                GetNamaunsur.setText("C\n\nSi\n\nGe\n\nSn\n\nPb");
                Button GetSuaraUnsur = (Button) findViewById(R.id.ButtonSound);
                GetSuaraUnsur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(MudahMenghafal.this,R.raw.baby);
                        mp.start();
                    }
                });
                TextView GetHafalan = (TextView) findViewById(R.id.Hafalan);
                GetHafalan.setText("- Cewek Si Gendut Senang Playboy"+"\n\n- Cewek Si Gery Senang main Pb");

                Button GotoGame = (Button) findViewById(R.id.Latihan);
                GotoGame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View view) {
                        Intent intent = new Intent(MudahMenghafal.this, gameIVA.class);
                        startActivity(intent);
                    }
                });
            }
        });

        Button GoToVA = (Button) findViewById(R.id.VA);
        GoToVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                TextView GetNamaunsur = (TextView) findViewById(R.id.NamaUnsur);
                GetNamaunsur.setText("N\n\nP\n\nAs\n\nSb\n\nBi");
                Button GetSuaraUnsur = (Button) findViewById(R.id.ButtonSound);
                GetSuaraUnsur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(MudahMenghafal.this,R.raw.boy);
                        mp.start();
                    }
                });
                TextView GetHafalan = (TextView) findViewById(R.id.Hafalan);
                GetHafalan.setText("- Nembak Pacar Asal Sabar Bisa"+"\n\n- NaPas SeBelum Bicara");

                Button GotoGame = (Button) findViewById(R.id.Latihan);
                GotoGame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View view) {
                        Intent intent = new Intent(MudahMenghafal.this, gameVA.class);
                        startActivity(intent);
                    }
                });
            }
        });

        Button GoToVIA = (Button) findViewById(R.id.VIA);
        GoToVIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                TextView GetNamaunsur = (TextView) findViewById(R.id.NamaUnsur);
                GetNamaunsur.setText("O\n\nS\n\nSe\n\nTe\n\nPo");
                Button GetSuaraUnsur = (Button) findViewById(R.id.ButtonSound);
                GetSuaraUnsur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(MudahMenghafal.this,R.raw.butterfly);
                        mp.start();
                    }
                });
                TextView GetHafalan = (TextView) findViewById(R.id.Hafalan);
                GetHafalan.setText("- Om Saya Sebal Terkena Polusi"+"\n\n- OSeng oSEng Telur Puyuh");

                Button GotoGame = (Button) findViewById(R.id.Latihan);
                GotoGame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View view) {
                        Intent intent = new Intent(MudahMenghafal.this, gameVIA.class);
                        startActivity(intent);
                    }
                });
            }
        });

        Button GoToVIIA = (Button) findViewById(R.id.VIIA);
        GoToVIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                TextView GetNamaunsur = (TextView) findViewById(R.id.NamaUnsur);
                GetNamaunsur.setText("F\n\nCl\n\nBr\n\nI\n\nAt");
                Button GetSuaraUnsur = (Button) findViewById(R.id.ButtonSound);
                GetSuaraUnsur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(MudahMenghafal.this,R.raw.camel);
                        mp.start();
                    }
                });
                TextView GetHafalan = (TextView) findViewById(R.id.Hafalan);
                GetHafalan.setText("- Feni Culik Brondong Imut"+"\n\n- Fire Club Baru Ingin Atraksi");

                Button GotoGame = (Button) findViewById(R.id.Latihan);
                GotoGame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View view) {
                        Intent intent = new Intent(MudahMenghafal.this, gameVIIA.class);
                        startActivity(intent);
                    }
                });
            }
        });

        Button GoToVIIIA = (Button) findViewById(R.id.VIIIA);
        GoToVIIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                TextView GetNamaunsur = (TextView) findViewById(R.id.NamaUnsur);
                GetNamaunsur.setText("He\n\nNe\n\nAr\n\nKr\n\nXe\n\nRn");
                Button GetSuaraUnsur = (Button) findViewById(R.id.ButtonSound);
                GetSuaraUnsur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(MudahMenghafal.this,R.raw.august);
                        mp.start();
                    }
                });
                TextView GetHafalan = (TextView) findViewById(R.id.Hafalan);
                GetHafalan.setText("- Helen Nenek Arnold Kurus Xeperti Ranting"+"\n\n- Heboh Negara Arab Karena Xerangan Radon");

                Button GotoGame = (Button) findViewById(R.id.Latihan);
                GotoGame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View view) {
                        Intent intent = new Intent(MudahMenghafal.this, gameVIIIA.class);
                        startActivity(intent);
                    }
                });
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
