package com.example.android.bvpassist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EvenSubjects extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subjects_even);

        TextView syllabusText = (TextView) findViewById(R.id.syllabus);

        Button b1 = (Button) findViewById(R.id.maths2);
        Button b2 = (Button) findViewById(R.id.phy2);
        Button b3 = (Button) findViewById(R.id.evs);
        Button b4 = (Button) findViewById(R.id.ed);
        Button b5 = (Button) findViewById(R.id.ip);
        Button b6 = (Button) findViewById(R.id.em);
        Button b7 = (Button) findViewById(R.id.cs);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String maths2 = getString(R.string.maths2);
                displaySyllabus.putExtra("data", maths2);
                startActivity(displaySyllabus);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String phy2 = getString(R.string.phy2);
                displaySyllabus.putExtra("data", phy2);
                startActivity(displaySyllabus);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String evs = getString(R.string.evs);
                displaySyllabus.putExtra("data", evs);
                startActivity(displaySyllabus);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String ed = getString(R.string.ed);
                displaySyllabus.putExtra("data", ed);
                startActivity(displaySyllabus);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String ip = getString(R.string.ip2);
                displaySyllabus.putExtra("data", ip);
                startActivity(displaySyllabus);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String em = getString(R.string.em);
                displaySyllabus.putExtra("data", em);
                startActivity(displaySyllabus);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String cs = getString(R.string.cs1);
                displaySyllabus.putExtra("data", cs);
                startActivity(displaySyllabus);
            }
        });
    }
}
