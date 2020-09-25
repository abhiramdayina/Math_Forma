package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Square extends AppCompatActivity {
    private TextView tvlength;
    private EditText etlength;
    private Button btncalc;
    private TextView tvarea;
    private TextView tvperimeter;
    private TextView tvdiagonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        tvlength = (TextView) findViewById(R.id.tvlength);
        tvarea = (TextView) findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);
        tvdiagonal = (TextView) findViewById(R.id.tvdiagonal);
        etlength = (EditText) findViewById(R.id.etlength);
        btncalc = (Button) findViewById(R.id.btncalc);

        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etlength.getText().toString());
                double area = number1*number1;
                double perimeter = 4*number1;
                double diagnoal = Math.sqrt(2)* number1;
                tvarea.setText("Area :" + String.valueOf(area));
                tvperimeter.setText("Perimeter :" + String.valueOf(perimeter));
                tvdiagonal.setText("Diagonal :" + String.valueOf(diagnoal));
            }
        });

    }
}
