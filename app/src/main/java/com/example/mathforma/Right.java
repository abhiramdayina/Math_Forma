package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Right extends AppCompatActivity {
    private TextView tvside;
    private TextView tvbase;
    private EditText etside;
    private EditText etbase;
    private Button btnCalc;
    private TextView tvarea;
    private TextView tvperimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);

        tvside = (TextView) findViewById(R.id.tvside);
        tvbase = (TextView) findViewById(R.id.tvbase);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        etside = (EditText) findViewById(R.id.etside);
        etbase = (EditText) findViewById(R.id.etbase);
        tvarea = (TextView) findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etside.getText().toString());
                double number2 = Double.parseDouble(etbase.getText().toString());
                double area = (number1*number2)/2;
                double perimeter =  number1 + number2 + Math.sqrt(number1*number1 + number2*number2);
                tvarea.setText("Area : " + String.valueOf(area));
                tvperimeter.setText("Perimeter " + String.valueOf(perimeter));
            }
        });
    }
}
