package com.example.tabelperiodik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MengurutkanUnsur extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] bankNames={"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    CheckBox aktinida, bukanlogam, gasmulia, halogen, lantanida,logamalkali,logamalkalitanah,metaloids,poslogamtransisi,logamtransisi;

    // Declare Variables
    public int nilai;
    ListView list;
    ListViewAdapter adapter;
    EditText editsearch;
    int[][] GambarUnsur;
    String[][] NamaUnsur;
    ArrayList<DaftarNamaUnsur> arraylist = new ArrayList<DaftarNamaUnsur>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengurutkan_unsur);


        // Generate sample data
        GambarUnsur = new int[][]{
                {R.drawable.th, R.drawable.pa, R.drawable.u, R.drawable.np, R.drawable.pu, R.drawable.am, R.drawable.cm, R.drawable.bk, R.drawable.cf, R.drawable.es, R.drawable.fm, R.drawable.md, R.drawable.no, R.drawable.lr},
                {R.drawable.h, R.drawable.c, R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.s, R.drawable.se},
                {R.drawable.he, R.drawable.ne, R.drawable.ar, R.drawable.kr, R.drawable.xe, R.drawable.rn},
                {R.drawable.f, R.drawable.cl, R.drawable.br, R.drawable.i, R.drawable.at},
                {R.drawable.la, R.drawable.ce, R.drawable.pr, R.drawable.nd, R.drawable.pm, R.drawable.sm, R.drawable.eu, R.drawable.gd, R.drawable.tb, R.drawable.dy, R.drawable.ho, R.drawable.er, R.drawable.tm, R.drawable.yb, R.drawable.lu},
                {R.drawable.li, R.drawable.na, R.drawable.k, R.drawable.rb, R.drawable.cs, R.drawable.fr},
                {R.drawable.be, R.drawable.mg, R.drawable.ca, R.drawable.sr, R.drawable.ba, R.drawable.ra},
                {R.drawable.sc, R.drawable.ti, R.drawable.v, R.drawable.cr, R.drawable.mn, R.drawable.fe, R.drawable.co, R.drawable.ni, R.drawable.cu, R.drawable.zn, R.drawable.y, R.drawable.zr, R.drawable.nb, R.drawable.mo, R.drawable.tc, R.drawable.ru, R.drawable.rh, R.drawable.pd, R.drawable.ag, R.drawable.cd, R.drawable.hf, R.drawable.ta, R.drawable.w, R.drawable.re, R.drawable.os, R.drawable.ir, R.drawable.pt, R.drawable.au, R.drawable.hg, R.drawable.rf, R.drawable.db, R.drawable.sg},
                {R.drawable.b, R.drawable.si, R.drawable.ge, R.drawable.as, R.drawable.sb, R.drawable.te, R.drawable.po},
                {R.drawable.al, R.drawable.ga, R.drawable.in, R.drawable.sn, R.drawable.tl, R.drawable.pb, R.drawable.bi}
        };

        NamaUnsur = new String[][]{
                {"Torium", "Protaktinium", "Uranium", "Neptunium", "Plutonium", "Amerisium", "Curium", "Berkelium", "Kalifornium", "Einstenium", "Fermium", "Mendelevium", "Nobelium", "Lawrensium"},//aktinida
                {"Hidrogen", "Karbon", "Nitrogen", "Oksigen", "Fosfor", "Sulphur", "Selenium"},//Bukan Logam
                {"Helium", "Neon", "Argon", "Kripton", "Xenon", "Radon"},//Gas Mulia
                {"Fluor", "Klor", "Brom", "Yodium", "Astatin"},//Halogen
                {"Lantanum", "Serium", "Praseodimium", "Neodimium", "Prometium", "Samarium", "Europium", "Gadolinium", "Terbium", "Disprosium", "Holmium", "Erbium", "Tulium", "Iterbium", "Lutetium"},//Lantanida
                {"Litium", "Natrium", "Kalium", "Rubidium", "Sesium", "Fransium"},//Logam ALkali
                {"Berilium", "Magnesium", "Kalsium", "Strontium", "Barium", "Radium"},//Logam Alkali Tanah
                {"Skandium", "Titanium", "Vanadium", "Krom", "Mangan", "Besi", "Kobalt", "Nikel", "Tembaga", "Seng", "Itrium", "Zirkonium", "Niobium", "Molibden", "Teknetium", "Ruthenium", "Rodium", "Paladium", "Perak", "Kadmium", "Hafnium", "Tantalum", "Tungsten", "Renium", "Osmium", "Iridium", "Platina", "Emas", "Raksa", "Rutherfordium", "Dubnium", "Seaborgium"},//Logam Transisi
                {"Boron", "Silikon", "Germanium", "Arsen", "Antimon", "Telurium", "Polonium"},//Metaloids
                {"Alumunium", "Galium", "Indium", "Timah", "Talium", "Timbal", "Bismut"}//Pos Logam Transisi
        };

        // Locate the ListView in listview_main.xml
        list = (ListView) findViewById(R.id.listview);
        for (int i = 0; i < NamaUnsur.length; i++)
        {
            for (int j = 0; j < NamaUnsur[i].length; j++) {
                DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[i][j], NamaUnsur[i][j]);
                // Binds all strings into an array
                arraylist.add(wp);
            }
        }

        adapter = new ListViewAdapter(this, arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.SearchHuruf);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bankNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);


        // initiate views
        aktinida = (CheckBox) findViewById(R.id.aktinida);
        aktinida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aktinida.isChecked()) {
                    nilai = 1;
                    bukanlogam.setChecked(false);bukanlogam.setClickable(false);
                    gasmulia.setChecked(false);gasmulia.setClickable(false);
                    halogen.setChecked(false);halogen.setClickable(false);
                    lantanida.setChecked(false);lantanida.setClickable(false);
                    logamalkali.setChecked(false);logamalkali.setClickable(false);
                    logamalkalitanah.setChecked(false);logamalkalitanah.setClickable(false);
                    logamtransisi.setChecked(false);logamtransisi.setClickable(false);
                    metaloids.setChecked(false);metaloids.setClickable(false);
                    poslogamtransisi.setChecked(false);poslogamtransisi.setClickable(false);

                    selanjutnya();

                }
                else {
                    nilai =0;
                    bukanlogam.setClickable(true);gasmulia.setClickable(true);halogen.setClickable(true);lantanida.setClickable(true);
                    logamalkali.setClickable(true);logamalkalitanah.setClickable(true);logamtransisi.setClickable(true);metaloids.setClickable(true);
                    poslogamtransisi.setClickable(true);
                    selanjutnya();
                }
            }
        });

        bukanlogam = (CheckBox) findViewById(R.id.bukanlogam);
        bukanlogam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bukanlogam.isChecked()) {
                    nilai = 2;
                    aktinida.setChecked(false);aktinida.setClickable(false);
                    gasmulia.setChecked(false);gasmulia.setClickable(false);
                    halogen.setChecked(false);halogen.setClickable(false);
                    lantanida.setChecked(false);lantanida.setClickable(false);
                    logamalkali.setChecked(false);logamalkali.setClickable(false);
                    logamalkalitanah.setChecked(false);logamalkalitanah.setClickable(false);
                    logamtransisi.setChecked(false);logamtransisi.setClickable(false);
                    metaloids.setChecked(false);metaloids.setClickable(false);
                    poslogamtransisi.setChecked(false);poslogamtransisi.setClickable(false);
                    selanjutnya();

                }
                else {
                    nilai =0;
                   aktinida.setClickable(true);gasmulia.setClickable(true);halogen.setClickable(true);lantanida.setClickable(true);
                    logamalkali.setClickable(true);logamalkalitanah.setClickable(true);logamtransisi.setClickable(true);metaloids.setClickable(true);
                    poslogamtransisi.setClickable(true);
                    selanjutnya();
                }
            }
        });
        gasmulia = (CheckBox) findViewById(R.id.gasmulia);
        gasmulia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gasmulia.isChecked()) {
                    nilai = 3;
                    aktinida.setChecked(false);aktinida.setClickable(false);
                    bukanlogam.setChecked(false);bukanlogam.setClickable(false);
                    halogen.setChecked(false);halogen.setClickable(false);
                    lantanida.setChecked(false);lantanida.setClickable(false);
                    logamalkali.setChecked(false);logamalkali.setClickable(false);
                    logamalkalitanah.setChecked(false);logamalkalitanah.setClickable(false);
                    logamtransisi.setChecked(false);logamtransisi.setClickable(false);
                    metaloids.setChecked(false);metaloids.setClickable(false);
                    poslogamtransisi.setChecked(false);poslogamtransisi.setClickable(false);
                    selanjutnya();
                }
                else {
                    nilai =0;
                    aktinida.setClickable(true);bukanlogam.setClickable(true);halogen.setClickable(true);lantanida.setClickable(true);
                    logamalkali.setClickable(true);logamalkalitanah.setClickable(true);logamtransisi.setClickable(true);metaloids.setClickable(true);
                    poslogamtransisi.setClickable(true);
                    selanjutnya();
                }
            }
        });
        halogen = (CheckBox) findViewById(R.id.halogen);
        halogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (halogen.isChecked()) {
                    nilai = 4;
                    aktinida.setChecked(false);aktinida.setClickable(false);
                    bukanlogam.setChecked(false);bukanlogam.setClickable(false);
                    gasmulia.setChecked(false);gasmulia.setClickable(false);
                    lantanida.setChecked(false);lantanida.setClickable(false);
                    logamalkali.setChecked(false);logamalkali.setClickable(false);
                    logamalkalitanah.setChecked(false);logamalkalitanah.setClickable(false);
                    logamtransisi.setChecked(false);logamtransisi.setClickable(false);
                    metaloids.setChecked(false);metaloids.setClickable(false);
                    poslogamtransisi.setChecked(false);poslogamtransisi.setClickable(false);
                    selanjutnya();

                }
                else {
                    nilai =0;
                    aktinida.setClickable(true);bukanlogam.setClickable(true);gasmulia.setClickable(true);lantanida.setClickable(true);
                    logamalkali.setClickable(true);logamalkalitanah.setClickable(true);logamtransisi.setClickable(true);metaloids.setClickable(true);
                    poslogamtransisi.setClickable(true);
                    selanjutnya();
                }
            }
        });
        lantanida = (CheckBox) findViewById(R.id.lantanida);
        lantanida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lantanida.isChecked()) {
                    nilai = 5;
                    aktinida.setChecked(false);aktinida.setClickable(false);
                    bukanlogam.setChecked(false);bukanlogam.setClickable(false);
                    gasmulia.setChecked(false);gasmulia.setClickable(false);
                    halogen.setChecked(false);halogen.setClickable(false);
                    logamalkali.setChecked(false);logamalkali.setClickable(false);
                    logamalkalitanah.setChecked(false);logamalkalitanah.setClickable(false);
                    logamtransisi.setChecked(false);logamtransisi.setClickable(false);
                    metaloids.setChecked(false);metaloids.setClickable(false);
                    poslogamtransisi.setChecked(false);poslogamtransisi.setClickable(false);
                    selanjutnya();
                }
                else {
                    nilai =0;
                    aktinida.setClickable(true);bukanlogam.setClickable(true);gasmulia.setClickable(true);halogen.setClickable(true);
                    logamalkali.setClickable(true);logamalkalitanah.setClickable(true);logamtransisi.setClickable(true);metaloids.setClickable(true);
                    poslogamtransisi.setClickable(true);
                    selanjutnya();
                }
            }
        });

        logamalkali = (CheckBox) findViewById(R.id.logamalkali);
        logamalkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (logamalkali.isChecked()) {
                    nilai = 6;
                    aktinida.setChecked(false);aktinida.setClickable(false);
                    bukanlogam.setChecked(false);bukanlogam.setClickable(false);
                    gasmulia.setChecked(false);gasmulia.setClickable(false);
                    halogen.setChecked(false);halogen.setClickable(false);
                    lantanida.setChecked(false);lantanida.setClickable(false);
                    logamalkalitanah.setChecked(false);logamalkalitanah.setClickable(false);
                    logamtransisi.setChecked(false);logamtransisi.setClickable(false);
                    metaloids.setChecked(false);metaloids.setClickable(false);
                    poslogamtransisi.setChecked(false);poslogamtransisi.setClickable(false);
                    selanjutnya();
                }
                else {
                    nilai =0;
                    aktinida.setClickable(true);bukanlogam.setClickable(true);gasmulia.setClickable(true);halogen.setClickable(true);
                    lantanida.setClickable(true);logamalkalitanah.setClickable(true);logamtransisi.setClickable(true);metaloids.setClickable(true);
                    poslogamtransisi.setClickable(true);
                    selanjutnya();
                }
            }
        });

        logamalkalitanah = (CheckBox) findViewById(R.id.logamalkalitanah);
        logamalkalitanah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (logamalkalitanah.isChecked()) {
                    nilai = 7;
                    aktinida.setChecked(false);aktinida.setClickable(false);
                    bukanlogam.setChecked(false);bukanlogam.setClickable(false);
                    gasmulia.setChecked(false);gasmulia.setClickable(false);
                    halogen.setChecked(false);halogen.setClickable(false);
                    lantanida.setChecked(false);lantanida.setClickable(false);
                    logamalkali.setChecked(false);logamalkali.setClickable(false);
                    logamtransisi.setChecked(false);logamtransisi.setClickable(false);
                    metaloids.setChecked(false);metaloids.setClickable(false);
                    poslogamtransisi.setChecked(false);poslogamtransisi.setClickable(false);
                    selanjutnya();
                }
                else {
                    nilai =0;
                    aktinida.setClickable(true);bukanlogam.setClickable(true);gasmulia.setClickable(true);halogen.setClickable(true);
                    lantanida.setClickable(true);logamalkali.setClickable(true);logamtransisi.setClickable(true);metaloids.setClickable(true);
                    poslogamtransisi.setClickable(true);
                    selanjutnya();
                }
            }
        });

        logamtransisi = (CheckBox) findViewById(R.id.logamtransisi);
        logamtransisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (logamtransisi.isChecked()) {
                    nilai = 8;
                    aktinida.setChecked(false);aktinida.setClickable(false);
                    bukanlogam.setChecked(false);bukanlogam.setClickable(false);
                    gasmulia.setChecked(false);gasmulia.setClickable(false);
                    halogen.setChecked(false);halogen.setClickable(false);
                    lantanida.setChecked(false);lantanida.setClickable(false);
                    logamalkalitanah.setChecked(false);logamalkalitanah.setClickable(false);
                    logamalkali.setChecked(false);logamalkali.setClickable(false);
                    metaloids.setChecked(false);metaloids.setClickable(false);
                    poslogamtransisi.setChecked(false);poslogamtransisi.setClickable(false);
                    selanjutnya();
                }
                else {
                    nilai =0;
                    aktinida.setClickable(true);bukanlogam.setClickable(true);gasmulia.setClickable(true);halogen.setClickable(true);
                    lantanida.setClickable(true);logamalkalitanah.setClickable(true);logamalkali.setClickable(true);metaloids.setClickable(true);
                    poslogamtransisi.setClickable(true);
                    selanjutnya();
                }
            }
        });

        metaloids = (CheckBox) findViewById(R.id.metaloids);
        metaloids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (metaloids.isChecked()) {
                    nilai = 9;
                    aktinida.setChecked(false);aktinida.setClickable(false);
                    bukanlogam.setChecked(false);bukanlogam.setClickable(false);
                    gasmulia.setChecked(false);gasmulia.setClickable(false);
                    halogen.setChecked(false);halogen.setClickable(false);
                    lantanida.setChecked(false);lantanida.setClickable(false);
                    logamalkalitanah.setChecked(false);logamalkalitanah.setClickable(false);
                    logamalkali.setChecked(false);logamalkali.setClickable(false);
                    logamtransisi.setChecked(false);logamtransisi.setClickable(false);
                    poslogamtransisi.setChecked(false);poslogamtransisi.setClickable(false);
                    selanjutnya();
                }
                else {
                    nilai =0;
                    aktinida.setClickable(true);bukanlogam.setClickable(true);gasmulia.setClickable(true);halogen.setClickable(true);
                    lantanida.setClickable(true);logamalkalitanah.setClickable(true);logamalkali.setClickable(true);logamtransisi.setClickable(true);
                    poslogamtransisi.setClickable(true);
                    selanjutnya();
                }
            }
        });

        poslogamtransisi = (CheckBox) findViewById(R.id.poslogamtransisi);
        poslogamtransisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (poslogamtransisi.isChecked()) {
                    nilai = 10;
                    aktinida.setChecked(false);aktinida.setClickable(false);
                    bukanlogam.setChecked(false);bukanlogam.setClickable(false);
                    gasmulia.setChecked(false);gasmulia.setClickable(false);
                    halogen.setChecked(false);halogen.setClickable(false);
                    lantanida.setChecked(false);lantanida.setClickable(false);
                    logamalkalitanah.setChecked(false);logamalkalitanah.setClickable(false);
                    logamalkali.setChecked(false);logamalkali.setClickable(false);
                    logamtransisi.setChecked(false);logamtransisi.setClickable(false);
                    metaloids.setChecked(false);metaloids.setClickable(false);
                    selanjutnya();
                }
                else {
                    nilai =0;
                    aktinida.setClickable(true);bukanlogam.setClickable(true);gasmulia.setClickable(true);halogen.setClickable(true);
                    lantanida.setClickable(true);logamalkalitanah.setClickable(true);logamalkali.setClickable(true);logamtransisi.setClickable(true);
                    metaloids.setClickable(true);
                    selanjutnya();
                }
            }
        });
    }

    public void selanjutnya (){
        switch(nilai){
            case 1:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[0].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[0][i], NamaUnsur[0][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);

                }
                break;
            case 2:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[1].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[1][i], NamaUnsur[1][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);
                }
                break;
            case 3:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[2].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[2][i], NamaUnsur[2][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);

                }
                break;
            case 4:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[3].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[3][i], NamaUnsur[3][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);

                }
                break;
            case 5:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[4].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[4][i], NamaUnsur[4][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);

                }
                break;
            case 6:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[5].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[5][i], NamaUnsur[5][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);

                }
                break;
            case 7:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[6].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[6][i], NamaUnsur[6][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);

                }
                break;
            case 8:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[7].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[7][i], NamaUnsur[7][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);

                }
                break;
            case 9:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[8].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[8][i], NamaUnsur[8][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);

                }
                break;
            case 10:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur[9].length; i++)
                {
                    DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[9][i], NamaUnsur[9][i]);
                    // Binds all strings into an array
                    arraylist.add(wp);

                }
                break;
            default:
                adapter.clearfiltercheckbox();
                for (int i = 0; i < NamaUnsur.length; i++)
                {
                    for (int j = 0; j < NamaUnsur[i].length; j++) {
                        DaftarNamaUnsur wp = new DaftarNamaUnsur(GambarUnsur[i][j], NamaUnsur[i][j]);
                        // Binds all strings into an array
                        arraylist.add(wp);
                    }
                }
        }


        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter(this, arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.SearchHuruf);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bankNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }






    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Spinner spin = (Spinner) findViewById(R.id.SearchHuruf);
        String text = spin.getSelectedItem().toString();
        adapter.filter(text); //spinner filter

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }




}
