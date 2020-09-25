package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Equilateral extends AppCompatActivity {
    private TextView tvside;
    private EditText etside;
    private Button btnCalc;
    private TextView tvarea;
    private TextView tvperimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equilateral);

        tvside = (TextView) findViewById(R.id.tvside);
        etside = (EditText) findViewById(R.id.etside);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvarea = (TextView)findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 double number = Double.parseDouble(etside.getText().toString());
                 double area = (Math.sqrt(3)/4)*number*number;
                 double perimeter = 3*number;
                 tvarea.setText("Area : " + String.valueOf(area));
                 tvperimeter.setText("Perimeter : " + String.valueOf(perimeter));
            }
        });
    }
}
