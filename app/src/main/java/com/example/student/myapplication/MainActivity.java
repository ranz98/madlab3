package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //new object edit text
    EditText nametext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //get the id from xml
     nametext=findViewById(R.id.editText);
    }

    public void gotoActivity(View v) {
        //create intent object
        //source and destination for intent
        String value;

        //access nametext
        value = nametext.getText().toString();
        Intent abcIntent = new Intent(MainActivity.this,SecondActivity.class);

        abcIntent.putExtra("Name",value);

        //start activity
        startActivity(abcIntent);

    }


}
