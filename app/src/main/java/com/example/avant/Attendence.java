package com.example.avant;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Attendence extends AppCompatActivity {


    CheckBox checkbox1, checkbox2, checkbox3;
    Button btnSubmit;
    TextView Attend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_attendence);

        // Initialize all views

        Attend = findViewById(R.id.submit_attandance);

        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);
        btnSubmit = findViewById(R.id.submit_attandance);

        // Checkbox listeners
        checkbox1.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, isChecked ? "Option 1 Selected" : "Option 1 Unselected", Toast.LENGTH_SHORT).show()
        );

        checkbox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked)
                Toast.makeText(this, "Option 2 Selected", Toast.LENGTH_SHORT).show();
        });

        checkbox3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked)
                Toast.makeText(this, "Option 3 Selected", Toast.LENGTH_SHORT).show();
        });

        // Main button click
        Button btnSubmit = findViewById(R.id.submit_attandance);
        btnSubmit.setOnClickListener(v -> {



            // Collect Checkboxes (true/false)
            boolean c1 = getIntent().getBooleanExtra("c1", false);
            boolean c2 = getIntent().getBooleanExtra("c2", false);
            boolean c3 = getIntent().getBooleanExtra("c3", false);
            boolean c4 = getIntent().getBooleanExtra("c4", false);





            // Popup Dialog
            AlertDialog.Builder builder_new = new AlertDialog.Builder(Attendence.this);
            builder_new.setTitle("Submission Successful");
            builder_new.setMessage("Attendence Submitted Successfully");

            builder_new.setPositiveButton("OK", (dialog, which) -> {

                Intent intent = new Intent(Attendence.this, MainActivity.class);

                startActivity(intent);
            });

            builder_new.setCancelable(false);
            builder_new.show();
        });

//        Attend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Attendence.this, Home.class));
//            }
//        });
    }
}
