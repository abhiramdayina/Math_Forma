package com.example.mathforma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Combinations extends AppCompatActivity {
    private EditText etn;
    private EditText etr;
    private Button btnCalc;
    private TextView tvans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combinations);
        setupUIViews();
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etn.getText().toString());
                double num2 = Double.parseDouble(etr.getText().toString());
                int n=1;
                for(int i=1;i<=num1;i++){
                    n = n *i;
                }
                int c=1;
                for(int k=1;k<=num2;k++){
                    c = c * k;
                }
                double num3 = num1-num2;
                int r=1;
                for(int j=1;j<=num3;j++){
                    r = r *j;
                }
                double ans = n/(r*c);
                tvans.setText("nCr : " + String.valueOf(ans));

            }
        });
    }
    public void setupUIViews(){
        etn = findViewById(R.id.etn);
        etr = findViewById(R.id.etr);
        btnCalc = findViewById(R.id.btnCalc);
        tvans = findViewById(R.id.tvans);
    }
}
