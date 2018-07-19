package com.example.android.bvpassist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OddSubjects extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subjects_odd);

        TextView syllabusText = (TextView) findViewById(R.id.syllabus);

        Button b1 = (Button) findViewById(R.id.maths1);
        Button b2 = (Button) findViewById(R.id.phy1);
        Button b3 = (Button) findViewById(R.id.chem1);
        Button b4 = (Button) findViewById(R.id.mp);
        Button b5 = (Button) findViewById(R.id.et);
        Button b6 = (Button) findViewById(R.id.hv);
        Button b7 = (Button) findViewById(R.id.foc);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String maths1 = getString(R.string.maths1);
                displaySyllabus.putExtra("data", maths1);
                startActivity(displaySyllabus);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String phy1 = getString(R.string.phy1);
                displaySyllabus.putExtra("data", phy1);
                startActivity(displaySyllabus);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String chem1 = getString(R.string.chem1);
                displaySyllabus.putExtra("data", chem1);
                startActivity(displaySyllabus);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String mp = getString(R.string.mp);
                displaySyllabus.putExtra("data", mp);
                startActivity(displaySyllabus);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String et = getString(R.string.et);
                displaySyllabus.putExtra("data", et);
                startActivity(displaySyllabus);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String hv = getString(R.string.maths1);
                displaySyllabus.putExtra("data", hv);
                startActivity(displaySyllabus);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displaySyllabus = new Intent(getApplicationContext(),Syllabus.class);
                String foc = getString(R.string.foc);
                displaySyllabus.putExtra("data", foc);
                startActivity(displaySyllabus);
            }
        });
    }
}
