package com.example.bttonghop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgProfile,imgNews,imgSchool,imgExit;
    private Boolean img_exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgProfile = (ImageView) findViewById(R.id.img_profile);
        imgSchool = (ImageView) findViewById(R.id.img_school);
        imgNews = (ImageView) findViewById(R.id.img_news);
        imgExit = (ImageView) findViewById(R.id.img_exit);



        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        imgNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TravelActivity.class);
                startActivity(intent);
            }
        });

        imgSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SchoolActivity.class);
                startActivity(intent);
            }
        });
//btn thoát
        final DialogInterface.OnClickListener dialogClickListeners = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case DialogInterface.BUTTON_POSITIVE:
                        finish();
                        break;
                    case DialogInterface.BUTTON_NEGATIVE:

                        break;
                }
            }
        };
        imgExit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // skien back lai page
//                AlertDialog.Builder builde = new AlertDialog.Builder(MainActivity.this);
//                builde.setMessage(
//                                "Bạn có muốn thoát không?")
//                        .setPositiveButton("Yes ", dialogClickListeners)
//                        .setNegativeButton("Cancel", dialogClickListeners).show();
                //                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
//                event out activity
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);

                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
                finish();
            }
        });

    }
}