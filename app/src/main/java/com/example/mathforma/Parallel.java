package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Parallel extends AppCompatActivity {

    private EditText etlength;
    private EditText etbreadth;
    private EditText etheight;
    private Button btnCalc;
    private TextView tvarea;
    private TextView tvperimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallel);

        etlength = (EditText) findViewById(R.id.etlength);
        etbreadth = (EditText) findViewById(R.id.etbreadth);
        etheight = (EditText) findViewById(R.id.etheight);
        btnCalc = (Button) findViewById(R.id.btnCalC);
        tvarea = (TextView) findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etlength.getText().toString());
                double number2 = Double.parseDouble(etbreadth.getText().toString());
                double number3 = Double.parseDouble(etheight.getText().toString());
                double area = number1*number3;
                double perimeter = 2*(number1 + number2);
                tvarea.setText("Area : " + String.valueOf(area));
                tvperimeter.setText("Perimeter : " + String.valueOf(perimeter));
            }
        });



    }
}
