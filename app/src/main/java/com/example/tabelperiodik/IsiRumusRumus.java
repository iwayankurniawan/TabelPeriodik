package com.example.tabelperiodik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class IsiRumusRumus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_rumus_rumus);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        int score_now = extras.getInt("my_score");

        switch(score_now){
            case 1:
                setTitle("Afinitas Elektron");
                TextView judulpenjelasan = (TextView) findViewById(R.id.judulpenjelasan);
                judulpenjelasan.setText("Afinitas Elektron");

                ImageView background = (ImageView) findViewById(R.id.background);
                background.setImageResource(R.drawable.afinitaselektron);

                TextView penjelasan = (TextView) findViewById(R.id.penjelasan);
                penjelasan.setText("Afinitas electron adalah besarnya energi yang dihasilkan atau dilepaskan apabila suatu atom menarik sebuah electron. Afinitas electron dapat digunakan sebagai ukuran mudah tidaknya suatu atom menarik electron.\n" +
                        "Semakin besar afinitas electron, semakin besar pula kecenderungan atom tersebut menarik electron dan menjadi ion negative.\n");
                break;
            case 2:
                setTitle("Energi Ionisasi");
                TextView judulpenjelasan1 = (TextView) findViewById(R.id.judulpenjelasan);
                judulpenjelasan1.setText("Energi Ionisasi");

                ImageView background1 = (ImageView) findViewById(R.id.background);
                background1.setImageResource(R.drawable.energiionisasi);

                TextView penjelasan1 = (TextView) findViewById(R.id.penjelasan);
                penjelasan1.setText("Energi ionisasi adalah  energi yang diperlukan untuk melepaskan electron yang terikat paling lemah oleh suatu atom-atom atau ion dalam wujud gas. Electron yang terikat paling lemah dari suatu atom adalah electron yang terdapat pada kulit terluar.\n" +
                        "Besarnya energi ionisasi merupakan ukuran mudah tidaknya electron terlepas dari atom, atau kuat tidaknya electron terikat oleh inti atom. Semakin besar energi ionisasinya, semakin sukar electron terlepas dari atom. Sebaliknya semakin kecil energi ionisasinya, semakin mudah electron terlepas dari atom.\n" +
                        "Semakin panjang jari-jari atom, semakin kecil energi ionisasinya.\n");
                break;
            case 3:
                setTitle("Jari-Jari Atom");
                TextView judulpenjelasan2 = (TextView) findViewById(R.id.judulpenjelasan);
                judulpenjelasan2.setText("Jari-Jari Atom");

                ImageView background2 = (ImageView) findViewById(R.id.background);
                background2.setImageResource(R.drawable.jariatom);

                TextView penjelasan2 = (TextView) findViewById(R.id.penjelasan);
                penjelasan2.setText("Jari jari atom merupakan jarak dari pusat atom (inti atom) sampai kulit electron terluar yang ditempati electron. Panjang pendeknya jari-jari atom ditentukan oleh 2 faktor yaitu:\n" +
                        "1.\tJumlah kulit electron\n" +
                        "Semakin banyak jumlah kulit yang dimiliki oleh suatu atom, maka semakin panjang jari-jari atomnya\n" +
                        "2.\tMuatan inti atom\n" +
                        "Semakin besar muatan intinya gaya Tarik inti atom terhadap electron lebih kuat, sehingga electron lebih mendekat ke inti atom.\n" +
                        "Dalam satu periode dari kiri ke kanan, muatan inti semakin bertambah, sedangkan jumlah kulit electron nya tetap. Akibatnya, gaya Tarik inti terhadap electron terluar semakin kuat sehingga menyebabkan jarak electron terluar dengan inti semakin dekat.\n" +
                        "Dalam satu golongan, semakin kebawah, jumlah kulitnya semakin banyak. Meskipun dengan hal ini jumlah muatan inti semakin banyak, tetapi pengaruh bertambahnya jumlah kulit lebih besar daripada pengaruh muatan inti. Akibatnya jarak electron kulit terluar terhadap inti semakin jauh.\n" +
                        "Jari-jari atom menunjukan besarnya volume atom tersebut. Keperiodikan volume atom dapat digunakan sebagai gambaran sifat keperiodikan jari-jari atom.\n");
                break;
            case 4:
                setTitle("Keelektronegatifan");
                TextView judulpenjelasan3 = (TextView) findViewById(R.id.judulpenjelasan);
                judulpenjelasan3.setText("Keelektronegatifan");

                ImageView background3 = (ImageView) findViewById(R.id.background);
                background3.setImageResource(R.drawable.kelektronegatifan);

                TextView penjelasan3 = (TextView) findViewById(R.id.penjelasan);
                penjelasan3.setText("Keelektronrgatifan atau electronegatifitas adalah kecenderungan suatu atom dalam menarik  pasangan electron yang digunakan bersama dalam membentuk ikatan.\n" +
                        "Semakin besar nilai keelektronegatifan suatu atom, semakin mudah bagi atom tersebut untuk menarik pasangan electron ikatan, atau gaya tarik electron dari atom tersebut semakin kuat.\n" +
                        "Keelektronegatifan berlawanan dengan energi ionisasi Karena semakin mudah suatu atom melepaskan electron berarti semakin sukar dalam menarik electron, dan sebaliknya.\n");
                break;
        }


    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
