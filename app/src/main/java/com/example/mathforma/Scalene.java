package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Scalene extends AppCompatActivity {
    private TextView tvside1;
    private TextView tvside2;
    private TextView tvside3;
    private EditText etside1;
    private EditText etside2;
    private EditText etside3;
    private Button btnCalc;
    private TextView tvarea;
    private TextView tvperimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scalene);

        tvside1 = (TextView) findViewById(R.id.tvside1);
        tvside2 = (TextView) findViewById(R.id.tvside2);
        tvside3 = (TextView) findViewById(R.id.tvside3);
        etside1 = (EditText) findViewById(R.id.etside1);
        etside2 = (EditText) findViewById(R.id.etside2);
        etside3 = (EditText) findViewById(R.id.etside3);
        btnCalc = (Button) findViewById(R.id.btncalc);
        tvarea = (TextView) findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etside1.getText().toString());
                double number2 = Double.parseDouble(etside2.getText().toString());
                double number3 = Double.parseDouble(etside3.getText().toString());
                double side = (number1+number2+number3)/2;
                double area =  Math.sqrt(side*(side-number1)*(side-number2)*(side-number3));
                double perimeter = number1+number2+number3;
                tvarea.setText("Area : " + String.valueOf(area));
                tvperimeter.setText("Perimeter : " + String.valueOf(perimeter));
            }
        });
    }
}
