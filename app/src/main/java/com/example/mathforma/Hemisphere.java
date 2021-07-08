package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.print.PrinterId;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Hemisphere extends AppCompatActivity {
    private static final double PI = 3.14159265;
    private EditText etradius;
    private Button btnCalc;
    private TextView tvvol;
    private TextView tvcsa;
    private TextView tvtsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hemisphere);
        etradius = (EditText) findViewById(R.id.etradius);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvvol = (TextView) findViewById(R.id.tvvol);
        tvcsa = (TextView) findViewById(R.id.tvcsa);
        tvtsa = (TextView) findViewById(R.id.tvtsa);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double radius = Double.parseDouble(etradius.getText().toString());
                double volume = 0.666666667*PI*radius*radius*radius;
                double csa =  2*PI*radius*radius;
                double tsa = 3*PI*radius*radius;
                tvvol.setText("Volume : " + String.valueOf(volume));
                tvcsa.setText("CSA : " + String.valueOf(csa));
                tvtsa.setText("TSA : " + String.valueOf(tsa));
            }
        });
    }
}
