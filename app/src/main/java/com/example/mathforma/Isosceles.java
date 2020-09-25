package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Isosceles extends AppCompatActivity {
    private TextView tvside;
    private TextView tvbase;
    private TextView tvheight;
    private EditText etside;
    private EditText etbase;
    private EditText etheight;
    private Button btnCalc;
    private TextView tvarea;
    private TextView tvperimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isosceles);
        tvside = (TextView) findViewById(R.id.tvside);
        tvbase = (TextView) findViewById(R.id.tvbase);
        tvheight = (TextView) findViewById(R.id.tvheight);
        etside = (EditText) findViewById(R.id.etside);
        etbase= (EditText) findViewById(R.id.etbase);
        etheight = (EditText) findViewById(R.id.etheight);
        btnCalc = (Button) findViewById(R.id.btnClac);
        tvarea = (TextView) findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etside.getText().toString());
                double number2 = Double.parseDouble(etbase.getText().toString());
                double number3 = Double.parseDouble(etheight.getText().toString());
                double area = (number2 * number3)/2;
                double perimeter = 2*number1 + number2;
                tvarea.setText("Area : " + String.valueOf(area));
                tvperimeter.setText("Perimeter " + String.valueOf(perimeter));

            }
        });
    }
}
