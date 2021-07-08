package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trapezium extends AppCompatActivity {
    private EditText etbase1;
    private EditText etbase2;
    private EditText etside1;
    private EditText etside2;
    private EditText etheight;
    private Button btnCalc;
    private TextView tvarea;
    private TextView tvperimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezium);
        etbase1 = (EditText) findViewById(R.id.etbase1);
        etbase2 = (EditText) findViewById(R.id.etbase2);
        etside1 = (EditText) findViewById(R.id.etside1);
        etside2 = (EditText) findViewById(R.id.etside2);
        etheight = (EditText) findViewById(R.id.etheight);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvarea = (TextView) findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etbase1.getText().toString());
                double num2 = Double.parseDouble(etbase2.getText().toString());
                double num3 = Double.parseDouble(etside1.getText().toString());
                double num4 = Double.parseDouble(etside2.getText().toString());
                double num5 = Double.parseDouble(etheight.getText().toString());
                double area = ((num1+num2)*num5)/2;
                double perimeter =  num1+num2+num3+num4;
                tvarea.setText("Area : " + String.valueOf(area));
                tvperimeter.setText("Perimeter : " + String.valueOf(perimeter));
            }
        });
    }
}
