package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Algebra extends AppCompatActivity {
    private CardView Apbs,Ambs,Apbc,Ambc,Aspbs,Asmbs,Acpbc,Acmbc,Apbpcs,Ambmcs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra);
        setupUIViews();

        Apbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Apbs.class);
                startActivity(i);
            }
        });
        Ambs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Ambs.class);
                startActivity(i);
            }
        });
        Apbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Apbc.class);
                startActivity(i);
            }
        });
        Ambc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Ambc.class);
                startActivity(i);
            }
        });
        Aspbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Aspbs.class);
                startActivity(i);
            }
        });
        Asmbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Asmbs.class);
                startActivity(i);
            }
        });
        Acpbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Acpbc.class);
                startActivity(i);
            }
        });
        Acmbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Acmbc.class);
                startActivity(i);
            }
        });
        Apbpcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Apbpcs.class);
                startActivity(i);
            }
        });
        Ambmcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Algebra.this,Ambmcs.class);
                startActivity(i);
            }
        });




    }
    private void setupUIViews(){

        Apbs = findViewById(R.id.Apbs);
        Ambs = findViewById(R.id.Ambs);
        Apbc = findViewById(R.id.Apbc);
        Ambc = findViewById(R.id.Ambc);
        Aspbs = findViewById(R.id.Aspbs);
        Asmbs = findViewById(R.id.Asmbs);
        Acpbc = findViewById(R.id.Acpbc);
        Acmbc = findViewById(R.id.Acmbc);
        Apbpcs = findViewById(R.id.Apbpcs);
        Ambmcs = findViewById(R.id.Ambmcs);
    }
}
