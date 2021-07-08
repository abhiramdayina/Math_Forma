package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {
    private EditText etside;
    private Button btnCalc;
    private TextView tvvol;
    private TextView tvtsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        etside = (EditText) findViewById(R.id.etside);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvvol = (TextView) findViewById(R.id.tvvol);
        tvtsa = (TextView) findViewById(R.id.tvtsa);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num = Double.parseDouble(etside.getText().toString());
                double volume = num*num*num;
                double tsa = 6*num*num;
                tvvol.setText("Volume : " + String.valueOf(volume));
                tvtsa.setText("TSA : " + String.valueOf(tsa));
            }
        });
    }
}
