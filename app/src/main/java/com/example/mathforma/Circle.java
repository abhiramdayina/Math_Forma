package com.example.mathforma;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Circle extends AppCompatActivity {

    private TextView tvradius;
    private EditText etradius;
    private Button btnCalC;
    private TextView tvarea;
    private TextView tvperimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        tvradius = (TextView) findViewById(R.id.tvradius);
        etradius = (EditText) findViewById(R.id.etradius);
        btnCalC = (Button) findViewById(R.id.btnCalC);
        tvarea = (TextView) findViewById(R.id.tvarea);
        tvperimeter = (TextView) findViewById(R.id.tvperimeter);

        btnCalC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number = Double.parseDouble(etradius.getText().toString());
                double area = 3.14159265*number*number;
                double perimeter = 2*3.14159265*number;
                tvarea.setText("Area : "+ String.valueOf(area));
                tvperimeter.setText("Perimeter " + String.valueOf(perimeter));
            }
        });
    }
}
