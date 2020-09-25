package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rhombuss extends AppCompatActivity {
    private TextView tvside;
    private TextView tvdiagonal1;
    private TextView tvdiagonal2;
    private EditText etside;
    private EditText etdiagonal1;
    private EditText etdiagonal2;
    private Button btnCalc;
    private TextView tvarea;
    private TextView tvperimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombuss);

        tvside = (TextView) findViewById(R.id.tvside);
        tvdiagonal1 = (TextView) findViewById(R.id.tvdiagonal1);
        tvdiagonal2 = (TextView) findViewById(R.id.tvdiagonal2);
        etside= (EditText) findViewById(R.id.etside);
        etdiagonal1 = (EditText) findViewById(R.id.etdiagonal1);
        etdiagonal2 = (EditText) findViewById(R.id.etdiagonal2);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvarea = (TextView) findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etside.getText().toString());
                double number2 = Double.parseDouble(etdiagonal1.getText().toString());
                double number3 = Double.parseDouble(etdiagonal2.getText().toString());
                double area = (number2*number3)/2;
                double perimeter = 4*number1;
                tvarea.setText("Area :" + String.valueOf(area));
                tvperimeter.setText("Perimeter : " + String.valueOf(perimeter));

            }
        });
    }
}
