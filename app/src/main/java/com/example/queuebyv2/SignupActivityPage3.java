package com.example.queuebyv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivityPage3 extends AppCompatActivity {

    Button asp3Nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page3);

        asp3Nextbtn = findViewById(R.id.asp3Nextbtn);

        asp3Nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivityPage3.this,SignupActivityPage4.class);
                startActivity(intent);
            }
        });
    }
}