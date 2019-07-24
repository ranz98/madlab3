package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView lblName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        lblName= findViewById(R.id.textView);

        Intent abc = getIntent();

        String valFromMAinActi = abc.getStringExtra("Name");

        lblName.setText(valFromMAinActi);

    }

}
