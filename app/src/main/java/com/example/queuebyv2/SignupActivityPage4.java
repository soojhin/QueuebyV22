package com.example.queuebyv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivityPage4 extends AppCompatActivity {
    Button asp4Backbtn, asp4Nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page4);

        asp4Backbtn = findViewById(R.id.asp4Backbtn);
        asp4Nextbtn = findViewById(R.id.asp4Nextbtn);

        asp4Backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivityPage4.this,SignupActivityPage3.class);
                startActivity(intent);
            }
        });

        asp4Nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivityPage4.this,HomepageActivity.class);
                startActivity(intent);
            }
        });

    }
}