package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Cylinder extends AppCompatActivity {
    private static final double PI = 3.14159265;
    private EditText etradius;
    private EditText etheight;
    private Button btnCalc;
    private TextView tvvol;
    private TextView tvlsa;
    private TextView tvtsa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        etradius = (EditText) findViewById(R.id.etradius);
        etheight = (EditText) findViewById(R.id.etheight);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvvol = (TextView) findViewById(R.id.tvvol);
        tvlsa = (TextView) findViewById(R.id.tvlsa);
        tvtsa = (TextView) findViewById(R.id.tvtsa);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double radius = Double.parseDouble(etradius.getText().toString());
                double height = Double.parseDouble(etheight.getText().toString());
                    double volume = PI * radius * radius * height;
                    double lsa = 2 * PI * radius * height;
                    double tsa = lsa + 2 * PI * radius * radius;
                    tvvol.setText("Volume : " + String.valueOf(volume));
                    tvlsa.setText("LSA : " + String.valueOf(lsa));
                    tvtsa.setText("TSA : " + String.valueOf(tsa));

            }
        });
    }
}
