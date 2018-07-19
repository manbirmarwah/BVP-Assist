package com.example.android.bvpassist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ScrollView;

public class Societies extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.societies);

        Button b1 = (Button) findViewById(R.id.visit1);
        Button b2 = (Button) findViewById(R.id.visit2);
        Button b3 = (Button) findViewById(R.id.visit3);
        Button b4 = (Button) findViewById(R.id.visit4);
        Button b5 = (Button) findViewById(R.id.visit5);
        Button b6 = (Button) findViewById(R.id.visit6);
        Button b7 = (Button) findViewById(R.id.visit7);
        Button b8 = (Button) findViewById(R.id.visit8);
        Button b9 = (Button) findViewById(R.id.visit9);
        Button b10 = (Button) findViewById(R.id.visit10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acm = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bvcoe.acm.org/"));
                startActivity(acm);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dsc = new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com/dscbvp/"));
                startActivity(dsc);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ieee = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sites.ieee.org/sb-bvcoend/"));
                startActivity(ieee);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nss = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bvcoend.ac.in/site/home/index/412"));
                startActivity(nss);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent csi = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/bvcoecsi/"));
                startActivity(csi);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isa = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.isadelhi.org/bvb.html"));
                startActivity(isa);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mosc = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bvpmosc.tech/"));
                startActivity(mosc);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enactus = new Intent(Intent.ACTION_VIEW, Uri.parse("https://enactusbvcoe.wordpress.com/"));
                startActivity(enactus);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aagaaz = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/aagaaz.bvcoe/"));
                startActivity(aagaaz);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iste = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bvp-iste.com/"));
                startActivity(iste);
            }
        });

    }
}
