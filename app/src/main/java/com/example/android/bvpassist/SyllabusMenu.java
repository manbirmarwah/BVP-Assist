package com.example.android.bvpassist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SyllabusMenu extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_menu);

        Button b1 = (Button) findViewById(R.id.odd);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showOdd = new Intent(getApplicationContext(), OddSubjects.class);
                startActivity(showOdd);
            }
        });

        Button b2 = (Button) findViewById(R.id.even);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showEven = new Intent(getApplicationContext(), EvenSubjects.class);
                startActivity(showEven);
            }
        });

    }
}
