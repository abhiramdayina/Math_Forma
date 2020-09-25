package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Algebra extends AppCompatActivity {
    String[] values =new String[]{"(a+b)²","(a-b)²","(a+b)³","(a-b)³","a²+b²","a²-b²","a³+b³","a³-b³","(a+b+c)²","(a-b-c)²"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra);
        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(view.getContext(),Apbs.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent = new Intent(view.getContext(),Ambs.class);
                    startActivityForResult(intent,1);
                }
                if (position==2){
                    Intent intent = new Intent(view.getContext(),Apbc.class);
                    startActivityForResult(intent,2);
                }
                if (position==3){
                    Intent intent = new Intent(view.getContext(),Ambc.class);
                    startActivityForResult(intent,3);
                }
                if (position==4){
                    Intent intent = new Intent(view.getContext(),Aspbs.class);
                    startActivityForResult(intent,4);
                }
                if (position==5){
                    Intent intent = new Intent(view.getContext(),Asmbs.class);
                    startActivityForResult(intent,5);
                }
                if (position==6){
                    Intent intent = new Intent(view.getContext(),Acpbc.class);
                    startActivityForResult(intent,6);
                }
                if (position==7){
                    Intent intent = new Intent(view.getContext(),Acmbc.class);
                    startActivityForResult(intent,7);
                }
                if (position==8){
                    Intent intent = new Intent(view.getContext(),Apbpcs.class);
                    startActivityForResult(intent,8);
                }
                if (position==9){
                    Intent intent = new Intent(view.getContext(),Ambmcs.class);
                    startActivityForResult(intent,9);
                }

            }
        });
    }
}
