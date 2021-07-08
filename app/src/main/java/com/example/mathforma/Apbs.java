package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Apbs extends AppCompatActivity {
    private Button btnCalc;
    private EditText eta;
    private EditText etb;
    private TextView tvans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apbs);
        eta = (EditText) findViewById(R.id.eta);
        etb = (EditText) findViewById(R.id.etb);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvans = (TextView) findViewById(R.id.tvans);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(eta.getText().toString());
                double num2 = Double.parseDouble(etb.getText().toString());
                double ans = (num1*num1 + (2*num1*num2) + num2*num2);
                tvans.setText("(a+b)² : " +String.valueOf(ans));
            }
        });
    }
}
