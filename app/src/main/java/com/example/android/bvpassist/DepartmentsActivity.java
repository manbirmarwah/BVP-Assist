package com.example.android.bvpassist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DepartmentsActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);


        Button d1 = (Button) findViewById(R.id.dept1);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent de1 = new Intent(DepartmentsActivity.this,AppSciActivity.class);
                startActivity(de1);
            }
        });

        Button d2 = (Button) findViewById(R.id.dept2);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent de2 = new Intent(DepartmentsActivity.this,CseActivity.class);
                startActivity(de2);
            }
        });

        Button d3 = (Button) findViewById(R.id.dept3);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent de3 = new Intent(DepartmentsActivity.this,ItActivity.class);
                startActivity(de3);
            }
        });

        Button d4 = (Button) findViewById(R.id.dept4);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent de4 = new Intent(DepartmentsActivity.this,EceActivity.class);
                startActivity(de4);
            }
        });

        Button d5 = (Button) findViewById(R.id.dept5);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent de5 = new Intent(DepartmentsActivity.this,EeeActivity.class);
                startActivity(de5);
            }
        });

        Button d6 = (Button) findViewById(R.id.dept6);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent de6 = new Intent(DepartmentsActivity.this,IceActivity.class);
                startActivity(de6);
            }
        });



    }
}
