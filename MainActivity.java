package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    Button btnPlus, btnMinus, btnMul, btnDiv;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        tvResult = findViewById(R.id.tvResult);
    }

    public void add(View view) {

        double n1 = Double.parseDouble(etNum1.getText().toString());
        double n2 = Double.parseDouble(etNum2.getText().toString());
        double result = n1 + n2;
        tvResult.setText("Addition is: " + result);
    }

    public void subtract(View view) {

        double n1 = Double.parseDouble(etNum1.getText().toString());
        double n2 = Double.parseDouble(etNum2.getText().toString());
        double result = n1 - n2;
        tvResult.setText("Subtraction is: " + result);
    }

    public void multiply(View view) {

        double n1 = Double.parseDouble(etNum1.getText().toString());
        double n2 = Double.parseDouble(etNum2.getText().toString());
        double result = n1 * n2;
        tvResult.setText("Multiplication is: " + result);
    }

    public void divide(View view) {

        double n1 = Double.parseDouble(etNum1.getText().toString());
        double n2 = Double.parseDouble(etNum2.getText().toString());
        double result = n1 / n2;
        tvResult.setText("Division is: " + result);
    }
}