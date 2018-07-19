package com.example.android.bvpassist;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutMain extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity_main);

       Button ab =  findViewById(R.id.aboutus);

        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about =  new Intent(AboutMain.this,AboutActivity.class);
                startActivity(about);
            }
        });

      Button  dis =  findViewById(R.id.discover);

        dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent discover = new Intent(AboutMain.this,DiscoverActivity.class);
                startActivity(discover);
            }
        });

      Button deptt = findViewById(R.id.departments);

      deptt.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent department = new Intent(AboutMain.this,DepartmentsActivity.class);
              startActivity(department);

          }
      });

      Button perk = findViewById(R.id.perks);

      perk.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent perrk = new Intent(AboutMain.this,PerkActivity.class);
              startActivity(perrk);

          }
      });


    }
}
