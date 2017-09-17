package com.example.tabelperiodik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by acer on 09/09/2017.
 */
public class SingleItemView extends Activity {
    // Declare Variables
    ImageView txtGambarUnsur;
    TextView txtNamaUnsur;
    int GambarUnsur;
    String NamaUnsur;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_singleitemview);
        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();
        // Get the results of rank
        GambarUnsur = i.getIntExtra("GambarUnsur",0);
        // Get the results of country
        NamaUnsur = i.getStringExtra("NamaUnsur");
        // Get the results of population

        // Locate the TextViews in singleitemview.xml
        txtGambarUnsur = findViewById(R.id.imageView);
        txtNamaUnsur = findViewById(R.id.NamaUnsurDitampilkan);


        // Load the results into the TextViews
        txtGambarUnsur.setImageResource(GambarUnsur);
        txtNamaUnsur.setText(NamaUnsur);

    }
}
