package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Geometry3D extends AppCompatActivity {
    private CardView cube,cuboid,sphere,hemisphere,cylinder,cone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry3_d);
        setupUIViews();

        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry3D.this,Cube.class);
                startActivity(i);
            }
        });

        cuboid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry3D.this,Cuboid.class);
                startActivity(i);
            }
        });

        sphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry3D.this,Sphere.class);
                startActivity(i);
            }
        });

        hemisphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry3D.this,Hemisphere.class);
                startActivity(i);
            }
        });

        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry3D.this,Cylinder.class);
                startActivity(i);
            }
        });

        cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Geometry3D.this,Cone.class);
                startActivity(i);
            }
        });


    }
    private void setupUIViews(){
        cube = findViewById(R.id.cube);
        cuboid = findViewById(R.id.cuboid);
        sphere = findViewById(R.id.sphere);
        hemisphere = findViewById(R.id.hemisphere);
        cylinder = findViewById(R.id.cylinder);
        cone = findViewById(R.id.cone);

    }
}

