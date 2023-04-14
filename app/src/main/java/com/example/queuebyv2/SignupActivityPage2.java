package com.example.queuebyv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivityPage2 extends AppCompatActivity {
   Button sp2Backbutton, sp2nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page2);

        sp2Backbutton = findViewById(R.id.sp2Backbtn);
        sp2nextbtn = findViewById(R.id.sp2nextbtn);

        sp2Backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivityPage2.this,SignupActivity.class);
                startActivity(intent);
            }
        });

        sp2nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivityPage2.this,SignupActivityPage3.class);
                startActivity(intent);
            }
        });

    }
}