package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Geometry3D extends AppCompatActivity {
    String[] values =new String[]{"Cube","Cuboid","Sphere","Hemisphere","Cylinder","Cone"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry3_d);
        ListView listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1,values);
        listView.setAdapter(adapter1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent1 = new Intent(view.getContext(), Cube.class);
                    startActivityForResult(intent1,0);
                }
                if (position==1){
                    Intent intent1 = new Intent(view.getContext(), Cuboid.class);
                    startActivityForResult(intent1,1);
                }
                if (position==2){
                    Intent intent1 = new Intent(view.getContext(), Sphere.class);
                    startActivityForResult(intent1,2);
                }
                if (position==3){
                    Intent intent1 = new Intent(view.getContext(), Hemisphere.class);
                    startActivityForResult(intent1,3);
                }
                if (position==4){
                    Intent intent1 = new Intent(view.getContext(), Cylinder.class);
                    startActivityForResult(intent1,4);
                }
                if (position==5){
                    Intent intent1 = new Intent(view.getContext(), Cone.class);
                    startActivityForResult(intent1,5);
                }



            }
        });
    }
}

