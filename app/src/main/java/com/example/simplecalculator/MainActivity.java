package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        resultTV = findViewById(R.id.resultTV);
    }

    public void add(View view) {

        String number1 = editText1.getText().toString();
        String numer2 = editText2.getText().toString();

        if(number1.isEmpty()){
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show();
        }
        else if (numer2.isEmpty()){
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show();
        }
        else {
            double result = Double.parseDouble(number1) + Double.parseDouble(numer2);
            resultTV.setText(String.valueOf(result));
        }

    }

    public void sub(View view) {
        String number1 = editText1.getText().toString();
        String numer2 = editText2.getText().toString();

        if(number1.isEmpty()){
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show();
        }
        else if (numer2.isEmpty()){
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show();
        }
        else {
            double result = Double.parseDouble(number1) - Double.parseDouble(numer2);
            resultTV.setText(String.valueOf(result));
        }
    }

    public void mul(View view) {
        String number1 = editText1.getText().toString();
        String numer2 = editText2.getText().toString();

        if(number1.isEmpty()){
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show();
        }
        else if (numer2.isEmpty()){
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show();
        }
        else {
            double result = Double.parseDouble(number1) * Double.parseDouble(numer2);
            resultTV.setText(String.valueOf(result));
        }
    }

    public void div(View view) {
        String number1 = editText1.getText().toString();
        String numer2 = editText2.getText().toString();

        if(number1.isEmpty()){
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show();
        }
        else if (numer2.isEmpty()){
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show();
        }
        else {
            double result = Double.parseDouble(number1) / Double.parseDouble(numer2);
            resultTV.setText(String.valueOf(result));
        }
    }
}