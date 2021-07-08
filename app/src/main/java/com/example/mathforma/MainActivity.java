package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private CardView shape2d,shape3d,algebra,quadraticequ,exponents,permutation,combination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        shape2d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Geometry2D.class);
                startActivity(i);
            }
        });
        shape3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Geometry3D.class);
                startActivity(i);
            }
        });
        algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Algebra.class);
                startActivity(i);
            }
        });
        quadraticequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,QuadraticEquation.class);
                startActivity(i);
            }
        });
        exponents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Exponent.class);
                startActivity(i);
            }
        });
        permutation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Permutations.class);
                startActivity(i);
            }
        });
        combination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Combinations.class);
                startActivity(i);
            }
        });

    }
    private void setupUIViews() {
        shape2d = findViewById(R.id.shape2d);
        shape3d = findViewById(R.id.shape3d);
        algebra = findViewById(R.id.algebra);
        quadraticequ = findViewById(R.id.quadraticequ);
        exponents = findViewById(R.id.exponents);
        permutation = findViewById(R.id.permutation);
        combination = findViewById(R.id.combination);
    }
}
