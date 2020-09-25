package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cuboid extends AppCompatActivity {
    private TextView tvlength;
    private TextView tvbreadth;
    private TextView tvwidth;
    private EditText etlength;
    private EditText etbreadth;
    private EditText etwidth;
    private Button btnCalc;
    private TextView tvvol;
    private TextView tvtsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);
        tvlength = (TextView)findViewById(R.id.tvlength);
        tvbreadth = (TextView) findViewById(R.id.tvbreadth);
        tvwidth = (TextView) findViewById(R.id.tvwidth);
        etlength = (EditText) findViewById(R.id.etlength);
        etbreadth = (EditText) findViewById(R.id.etbreadth);
        etwidth = (EditText) findViewById(R.id.etwidth);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvvol = (TextView) findViewById(R.id.tvvol);
        tvtsa = (TextView) findViewById(R.id.tvtsa);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etlength.getText().toString());
                double num2 = Double.parseDouble(etbreadth.getText().toString());
                double num3 = Double.parseDouble(etwidth.getText().toString());
                double volume = num1*num2*num3;
                double tsa = 2*(num1*num2 + num2*num3 + num3*num1);
                tvvol.setText("Volume : " + String.valueOf(volume));
                tvtsa.setText("TSA : " + String.valueOf(tsa));
            }
        });
     }
}
