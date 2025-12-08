package com.example.avant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnWorkflow = findViewById(R.id.btnWorkflow);
        btnWorkflow.setOnClickListener(v -> {
            startActivity(new Intent(Home.this, Creation.class));
        });

        Button btnAttendence = findViewById(R.id.btnAttendence);
        btnAttendence.setOnClickListener(view -> {
            startActivity(new Intent(Home.this, Home.class));
        });
    }
}
