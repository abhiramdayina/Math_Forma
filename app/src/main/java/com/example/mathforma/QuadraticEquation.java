package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class QuadraticEquation extends AppCompatActivity {

    private EditText eta;
    private EditText etb;
    private EditText etc;
    private Button btnCalc;
    private TextView tv1;
    private TextView tv2;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic_equation);

        eta = findViewById(R.id.eta);
        etb = findViewById(R.id.etb);
        etc = findViewById(R.id.etc);
        btnCalc = findViewById(R.id.btnCalc);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        error = findViewById(R.id.error);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(eta.getText().toString());
                double num2 = Double.parseDouble(etb.getText().toString());
                double num3 = Double.parseDouble(etc.getText().toString());
                if(num1!=0){
                    double root1 = -num2 + Math.sqrt(num2*num2-4*num1*num3);
                    double root2 = -num2 - Math.sqrt(num2*num2-4*num1*num3);
                    double root11 = root1/(2*num1);
                    double root22 = root2/(2*num1);
                    tv1.setText("x = " + String.valueOf(root11));
                    tv2.setText("x = " + String.valueOf(root22));
                }else{
                    error.setText("'a' value should not be '0'");
                }
            }
        });
    }
}
