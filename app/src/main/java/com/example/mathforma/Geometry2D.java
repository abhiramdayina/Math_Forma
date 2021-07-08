package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.solver.widgets.Rectangle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Geometry2D extends AppCompatActivity {
    private CardView Recta,Square,Parallel,Circle,Scalene,Isosceles,Equilateral,Right,Rhombuss,Trapezium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry2_d);
        setupUIViews();

        Recta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Recta.class);
                startActivity(i);
            }
        });
        Square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Square.class);
                startActivity(i);
            }
        });
        Parallel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Parallel.class);
                startActivity(i);
            }
        });
        Circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Circle.class);
                startActivity(i);
            }
        });
        Scalene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Scalene.class);
                startActivity(i);
            }
        });
        Isosceles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Isosceles.class);
                startActivity(i);
            }
        });
        Equilateral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Equilateral.class);
                startActivity(i);
            }
        });
        Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Right.class);
                startActivity(i);
            }
        });
        Rhombuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Rhombuss.class);
                startActivity(i);
            }
        });
        Trapezium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry2D.this,Trapezium.class);
                startActivity(i);
            }
        });


    }
    private void setupUIViews() {
       Recta = findViewById(R.id.Recta);
       Square = findViewById(R.id.Square);
       Parallel = findViewById(R.id.Parallel);
       Circle = findViewById(R.id.Circle);
       Scalene = findViewById(R.id.Scalene);
       Isosceles = findViewById(R.id.Isosceles);
       Equilateral = findViewById(R.id.Equilateral);
       Right = findViewById(R.id.Right);
       Rhombuss = findViewById(R.id.Rhombuss);
       Trapezium = findViewById(R.id.Trapezium);
    }
}
