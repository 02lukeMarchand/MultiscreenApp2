package com.example.android.miwoklanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberClickListener clickListener = new NumberClickListener();
        TextView numbers = (TextView)findViewById(R.id.numbers);

        numbers.setOnClickListener(clickListener);
    }

    public void openNumbersList(View view){
        Intent numbers = new Intent(this, NumbersActivity.class);
        startActivity(numbers);
    }
}