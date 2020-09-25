package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exponent extends AppCompatActivity {
    private TextView etx;
    private TextView ety;
    private Button btnCalc;
    private TextView tvans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exponent);
        etx = findViewById(R.id.etx);
        ety = findViewById(R.id.ety);
        btnCalc = findViewById(R.id.btnCalc);
        tvans = findViewById(R.id.tvans);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etx.getText().toString());
                double num2 = Double.parseDouble(ety.getText().toString());
                double ans = Math.pow(num1,num2);
                tvans.setText("x^y : " + String.valueOf(ans));
            }
        });
    }
}
