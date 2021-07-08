package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.StrictMath.PI;

public class Sphere extends AppCompatActivity {
    private EditText etradius;
    private Button btnCalc;
    private TextView tvvol;
    private TextView tvcsa;
    private TextView tvtsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        etradius = (EditText) findViewById(R.id.etradius);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        tvvol = (TextView) findViewById(R.id.tvvol);
        tvcsa = (TextView) findViewById(R.id.tvcsa);
        tvtsa = (TextView) findViewById(R.id.tvtsa);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(etradius.getText().toString());
                double vol = 1.33333333*3.14159265*num*num*num;
                double csa = 4*3.14159265*num*num;
                tvvol.setText("Volume : " + String.valueOf(vol));
                tvcsa.setText("CSA :" + String.valueOf(csa));
                tvtsa.setText("TSA :" + String.valueOf(csa));

            }
        });
    }
}
