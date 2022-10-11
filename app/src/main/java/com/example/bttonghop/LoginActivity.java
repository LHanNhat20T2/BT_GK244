package com.example.bttonghop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btnlogin;
    EditText edtUser,edtPass;
    TextView tvsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//    requestWindowFeature(Window.FEATURE_NO_TITLE);
//      this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//     getSupportActionBar().hide();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        setContentView(R.layout.activity_login);

        btnlogin = (Button) findViewById(R.id.buttonLogin);
        edtUser = (EditText) findViewById(R.id.edittextUser);
        edtPass = (EditText) findViewById(R.id.edittextPassword);
        tvsignup = (TextView) findViewById(R.id.textviewsignup);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "hannhat244@gmail.com";
                String password = "hannhat123";
                if (edtUser.getText().toString().equals(username) && edtPass.getText().toString().equals(password)) {
                    Toast.makeText(getApplicationContext(), R.string.loginsucess, Toast.LENGTH_SHORT).show();
                    Intent it = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(it);
                } else {
                    Toast.makeText(getApplicationContext(), R.string.loginerror, Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });

    }
}