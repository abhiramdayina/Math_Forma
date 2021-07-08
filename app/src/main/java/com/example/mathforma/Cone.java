package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.PI;

public class Cone extends AppCompatActivity {
    private EditText etradius;
    private EditText etheight;
    private EditText etlength;
    private Button btnCalc;
    private TextView tvvol;
    private TextView tvlsa;
    private TextView tvtsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);
        etradius = (EditText) findViewById(R.id.etradius);
        etheight = (EditText) findViewById(R.id.etheight);
        etlength = (EditText) findViewById(R.id.etlength);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvvol = (TextView) findViewById(R.id.tvvol);
        tvlsa = (TextView) findViewById(R.id.tvlsa);
        tvtsa = (TextView) findViewById(R.id.tvtsa);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double radius = Double.parseDouble(etradius.getText().toString());
                double height = Double.parseDouble(etheight.getText().toString());
                double length = Double.parseDouble(etlength.getText().toString());
                double volume = 0.333333333*PI*radius*radius*height;
                double lsa = PI*radius*length;
                double tsa = PI*radius*(radius + length);
                tvvol.setText("Volume : " + String.valueOf(volume));
                tvlsa.setText("LSA : " + String.valueOf(lsa));
                tvtsa.setText("TSA : " + String.valueOf(tsa));
            }
        });
    }
}
