package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.EthiopicCalendar;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Recta extends AppCompatActivity {
    private TextView tvlength;
    private TextView tvbreadth;
    private EditText etlength;
    private EditText etbreadth;
    private Button btnclac;
    private TextView tvarea;
    private TextView tvperimeter;
    private TextView tvdiagonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recta);
        etlength = (EditText) findViewById(R.id.etlength);
        etbreadth = (EditText) findViewById(R.id.etbreadth);
        btnclac = (Button) findViewById(R.id.btncalc);
        tvarea = (TextView) findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);
        tvdiagonal = (TextView) findViewById(R.id.tvdiagonal);

        btnclac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double number1 = Double.parseDouble(etlength.getText().toString());
                double number2 = Double.parseDouble(etbreadth.getText().toString());
                double area = number1 * number2;
                double perimeter = 2*(number1+number2);
                double diagonal =  Math.sqrt(2*number1 + 2*number2);
                tvarea.setText("Area : " + String.valueOf(area));
                tvperimeter.setText("Perimeter : " + String.valueOf(perimeter));
                tvdiagonal.setText("Diagonal : " + String.valueOf(diagonal));
            }
        });
    }
}
