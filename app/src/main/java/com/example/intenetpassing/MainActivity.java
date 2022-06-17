package com.example.intenetpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextBtn;
        nextBtn = findViewById(R.id.nextBtn);
        Intent iNext;
        iNext = new Intent(MainActivity.this, SecondActivity.class);
        iNext.putExtra("title", "Home");
        iNext.putExtra("studentName", "Sajjad");
        iNext.putExtra("Id", 207);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iNext);
            }
        });
    }
}