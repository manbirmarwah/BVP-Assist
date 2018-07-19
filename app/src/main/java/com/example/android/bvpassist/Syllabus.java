package com.example.android.bvpassist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Syllabus extends BaseActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.syllabus);

        textView = (TextView) findViewById(R.id.syllabus);
        textView.setText(getIntent().getStringExtra("data"));
    }
}
