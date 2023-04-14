package com.example.queuebyv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Request extends AppCompatActivity {
    EditText etFN, etMN, etLN, etHouseno, etBarangay, etCity, etPurpose;
    String tvStatus;
    Button btnSubmit;
    DatabaseReference certdb;
    Intent intent;
    certs certs;
    long maxid = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        etFN = findViewById(R.id.etFN);
        etMN = findViewById(R.id.etMN);
        etLN = findViewById(R.id.etLN);
        etHouseno = findViewById(R.id.etHouseno);
        etBarangay = findViewById(R.id.etBarangay);
        etCity = findViewById(R.id.etCity);
        etPurpose = findViewById(R.id.etPurpose);
        btnSubmit = findViewById(R.id.btnSubmit);

        certdb = FirebaseDatabase.getInstance().getReference().child("Certification");
        certs = new certs();

        certdb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists())
                    maxid=(snapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String firstname = etFN.getText().toString();
                String middleinitial = etMN.getText().toString();
                String lastname = etLN.getText().toString();
                String houseno = etHouseno.getText().toString();
                String barangay = etBarangay.getText().toString();
                String city = etCity.getText().toString();
                String purpose = etPurpose.getText().toString();


                certs.setFirstname(etFN.getText().toString().trim());
                certs.setMiddleinitial(etMN.getText().toString().trim());
                certs.setLastname(etLN.getText().toString().trim());
                certs.setHouseno(etHouseno.getText().toString().trim());
                certs.setBarangay(etBarangay.getText().toString().trim());
                certs.setCity(etCity.getText().toString().trim());
                certs.setPurpose(etPurpose.getText().toString().trim());
                certs.setStatus("Pending");
                certdb.child(String.valueOf("CB" + maxid)).setValue(certs);


                Toast.makeText(Request.this, "Registered Successfully", Toast.LENGTH_LONG).show();



            }
        });
    }
}