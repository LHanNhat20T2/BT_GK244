package com.example.bttonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detail_MySon extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_myson);

        TextView txtNameMS = (TextView) findViewById(R.id.txtName);

    }
}