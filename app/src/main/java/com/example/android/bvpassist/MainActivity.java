package com.example.android.bvpassist;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.books);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent booksActivity = new Intent(MainActivity.this, BookListActivity.class);
                startActivity(booksActivity);
            }
        });

        Button b2 = (Button) findViewById(R.id.syllabusMenu);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syllabusActivity = new Intent(MainActivity.this, SyllabusMenu.class);
                startActivity(syllabusActivity);
            }
        });

        Button b3 = (Button) findViewById(R.id.society);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent societyActivity = new Intent(MainActivity.this, Societies.class);
                startActivity(societyActivity);
            }
        });

        Button b4 = (Button) findViewById(R.id.about);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about = new Intent(MainActivity.this, AboutMain.class);
                startActivity(about);
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Are you sure you want to exit?");
        alert.setCancelable(true);

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "See you soon!",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = alert.create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.aboutus: {
                Intent aboutUs = new Intent(MainActivity.this, AboutDevelopers.class);
                startActivity(aboutUs);

                return true;
            }

            case R.id.restart: {
                Intent intent = getIntent();
                finish();
                startActivity(intent);

                Toast toast = Toast.makeText(this, "Restarting", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.RIGHT, 60, 170);
                toast.show();
            }

            case R.id.exit: {
                finish();

            }
        }

        return (super.onOptionsItemSelected(item));
    }
}
