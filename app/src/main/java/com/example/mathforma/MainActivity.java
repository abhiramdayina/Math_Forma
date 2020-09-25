package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] values =new String[]{"2D Shapes","3D Shapes","Algebra","Quadratic Equations","Exponents","Permutations","Combinations"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(view.getContext(),Geometry2D.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent = new Intent(view.getContext(),Geometry3D.class);
                    startActivityForResult(intent,1);
                }
                if (position==2){
                    Intent intent = new Intent(view.getContext(),Algebra.class);
                    startActivityForResult(intent,2);
                }
                if (position==3){
                    Intent intent = new Intent(view.getContext(),QuadraticEquation.class);
                    startActivityForResult(intent,3);
                }
                if (position==4){
                    Intent intent = new Intent(view.getContext(),Exponent.class);
                    startActivityForResult(intent,4);
                }
                if (position==5){
                    Intent intent = new Intent(view.getContext(),Permutations.class);
                    startActivityForResult(intent,5);
                }
                if (position==6){
                    Intent intent = new Intent(view.getContext(),Combinations.class);
                    startActivityForResult(intent,6);
                }

            }
        });
    }
}
