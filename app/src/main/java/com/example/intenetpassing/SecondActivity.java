package com.example.intenetpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.net.IDN;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent formActivity = getIntent();
        String title = formActivity.getStringExtra("title");
        String studentName = formActivity.getStringExtra("studentName");
        int id = formActivity.getIntExtra("Id", 0);

        TextView studentInfo;
        studentInfo = findViewById(R.id.studentInfo);
        studentInfo.setText("Name: "+studentName+"\n"+"ID:" + id);
        getSupportActionBar().setTitle(title);


    }
}