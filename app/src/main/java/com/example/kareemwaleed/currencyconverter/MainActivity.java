package com.example.kareemwaleed.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view)
    {
        EditText moneyField = (EditText) findViewById(R.id.moneyField);
        Double amount = Double.parseDouble(moneyField.getText().toString());
        amount /= 18.45;
        Toast.makeText(getApplicationContext(), amount.toString() + " USDs", Toast.LENGTH_LONG).show();
    }
}
