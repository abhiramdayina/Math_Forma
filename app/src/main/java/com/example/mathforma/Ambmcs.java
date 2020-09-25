package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ambmcs extends AppCompatActivity {
    private TextView tva;
    private TextView tvb;
    private TextView tvc;
    private Button btnCalc;
    private EditText eta;
    private EditText etb;
    private EditText etc;
    private TextView tvans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambmcs);
        tva = (TextView) findViewById(R.id.tva);
        tvb = (TextView) findViewById(R.id.tvb);
        tvc = (TextView) findViewById(R.id.tvc);
        eta = (EditText) findViewById(R.id.eta);
        etb = (EditText) findViewById(R.id.etb);
        etc = (EditText) findViewById(R.id.etc);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvans = (TextView) findViewById(R.id.tvans);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(eta.getText().toString());
                double num2 = Double.parseDouble(etb.getText().toString());
                double num3 = Double.parseDouble(etc.getText().toString());
                double ans = num1*num1 + num2*num2 + num3*num3 - 2* num1*num2 - 2*num1*num3 + 2*num2*num3;
                tvans.setText("(a-b-c)² : " +String.valueOf(ans));
            }
        });
    }
}
