package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Rectangle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Geometry2D extends AppCompatActivity {
    String[] values =new String[]{"Rectangle","Square","Parallelogram","Circle","Scalene Triangle","Isosceles Triangle","Equilateral Triangle","Right Angle Triangle","Rhombus","Trapezium"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry2_d);
        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1,values);
        listView.setAdapter(adapter1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent1 = new Intent(view.getContext(), Recta.class);
                    startActivityForResult(intent1,0);
                }
                if (position==1){
                    Intent intent1 = new Intent(view.getContext(), Square.class);
                    startActivityForResult(intent1,1);
                }
                if (position==2){
                    Intent intent1 = new Intent(view.getContext(),Parallel.class);
                    startActivityForResult(intent1,2);
                }
                if (position==3){
                    Intent intent1 = new Intent(view.getContext(),Circle.class);
                    startActivityForResult(intent1,3);
                }
                if (position==4){
                    Intent intent1 = new Intent(view.getContext(),Scalene.class);
                    startActivityForResult(intent1,4);
                }
                if (position==5){
                    Intent intent1 = new Intent(view.getContext(),Isosceles.class);
                    startActivityForResult(intent1,5);
                }
                if (position==6){
                    Intent intent1 = new Intent(view.getContext(),Equilateral.class);
                    startActivityForResult(intent1,6);
                }
                if (position==7){
                    Intent intent1 = new Intent(view.getContext(),Right.class);
                    startActivityForResult(intent1,7);
                }
                if (position==8){
                    Intent intent1 = new Intent(view.getContext(),Rhombuss.class);
                    startActivityForResult(intent1,8);
                }
                if (position==9){
                    Intent intent1 = new Intent(view.getContext(),Trapezium.class);
                    startActivityForResult(intent1,9);
                }


            }
        });
    }
}
