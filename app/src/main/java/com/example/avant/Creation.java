package com.example.avant;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Creation extends AppCompatActivity {

        String[] item1 = {"Ramesh", "Ashwin", "Salman", "Adithya", "Tushar"};
        String[] item2 = {"TSL Kalinga Nagar", "TSL Neelachal", "TSL Jamshedpur"};
        String[] item3 = {"Ware House", "Convey Area", "Blast Area"};
        String[] item4 = {"Akash dubey", "Rama Rao", "Murali vijay"};

        AutoCompleteTextView dropdown1, dropdown2, dropdown3, dropdown4;

     Button b;
     final Context context = this;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_creation);

            // Link XML
            dropdown1 = findViewById(R.id.dropdown1);
            dropdown2 = findViewById(R.id.dropdown2);
            dropdown3 = findViewById(R.id.dropdown3);
            dropdown4 = findViewById(R.id.dropdown4);

            // Adapters
            ArrayAdapter<String> adapter1 =
                    new ArrayAdapter<>(this, R.layout.list_item, item1);

            ArrayAdapter<String> adapter2 =
                    new ArrayAdapter<>(this, R.layout.list_item, item2);

            ArrayAdapter<String> adapter3 =
                    new ArrayAdapter<>(this, R.layout.list_item, item3);

            ArrayAdapter<String> adapter4 =
                    new ArrayAdapter<>(this, R.layout.list_item, item4);

            // Set Adapters
            dropdown1.setAdapter(adapter1);
            dropdown2.setAdapter(adapter2);
            dropdown3.setAdapter(adapter3);
            dropdown4.setAdapter(adapter4);

            // Click listeners
            dropdown1.setOnItemClickListener((parent, view, position, id) -> {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(this, "Selected: " + item, Toast.LENGTH_SHORT).show();
            });

            dropdown2.setOnItemClickListener((parent, view, position, id) -> {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(this, "Selected: " + item, Toast.LENGTH_SHORT).show();
            });

            dropdown3.setOnItemClickListener((parent, view, position, id) -> {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(this, "Selected: " + item, Toast.LENGTH_SHORT).show();
            });

            dropdown4.setOnItemClickListener((parent, view, position, id) -> {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(this, "Selected: " + item, Toast.LENGTH_SHORT).show();
            });


    //Check box

        CheckBox checkbox1, checkbox2, checkbox3, checkbox4;

        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);
        checkbox4 = findViewById(R.id.checkbox4);

// Listener for each checkbox
        checkbox1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Option 1 Selected", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Option 1 Unselected", Toast.LENGTH_SHORT).show();
            }
        });

        checkbox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Option 2 Selected", Toast.LENGTH_SHORT).show();
            }
        });

        checkbox3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Option 3 Selected", Toast.LENGTH_SHORT).show();
            }
        });

        checkbox4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Option 4 Selected", Toast.LENGTH_SHORT).show();
            }
        });

        // Check box for  Clearance Avaiable

            CheckBox checkbox5, checkbox6, checkbox7;

            checkbox5 = findViewById(R.id.checkbox5);
            checkbox6 = findViewById(R.id.checkbox6);
            checkbox7 = findViewById(R.id.checkbox7);

            // Listener for each checkbox

            checkbox5.setOnCheckedChangeListener((buttonView, isChecked) -> {
                if (isChecked) {
                    Toast.makeText(this, "Option 1 Selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Option 1 Unselected", Toast.LENGTH_SHORT).show();
                }
            });

            checkbox6.setOnCheckedChangeListener((buttonView, isChecked) -> {
                if (isChecked) {
                    Toast.makeText(this, "Option 1 Selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Option 1 Unselected", Toast.LENGTH_SHORT).show();
                }
            });

            checkbox7.setOnCheckedChangeListener((buttonView, isChecked) -> {
                if (isChecked) {
                    Toast.makeText(this, "Option 1 Selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Option 1 Unselected", Toast.LENGTH_SHORT).show();
                }
            });




        //Date

        EditText FromDate = findViewById(R.id.etFromDate);

        FromDate.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(Creation.this,
                    (view, year1, month1, dayOfMonth) -> FromDate.setText(dayOfMonth + "/" + (month1 + 1) + "/" + year1), year, month, day);

            datePickerDialog.show();
        });

        EditText ToDate = findViewById(R.id.etToDate);

        ToDate.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(Creation.this,
                    (view, year1, month1, dayOfMonth) -> ToDate.setText(dayOfMonth + "/" + (month1 + 1) + "/" + year1), year, month, day);

            datePickerDialog.show();
        });

        EditText CommencementDate = findViewById(R.id.etWorkCommencementDate);

        CommencementDate.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(Creation.this,
                    (view, year1, month1, dayOfMonth) -> CommencementDate.setText(dayOfMonth + "/" + (month1 + 1) + "/" + year1), year, month, day);

            datePickerDialog.show();
        });

        EditText PermittedDate = findViewById(R.id.etPermitRequiredUpto);

        PermittedDate.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(Creation.this,
                    (view, year1, month1, dayOfMonth) -> PermittedDate.setText(dayOfMonth + "/" + (month1 + 1) + "/" + year1), year, month, day);

            datePickerDialog.show();
        });

        //Count the number of person

        Button btnPlus, btnMinus;
        TextView txtCount;

        final int[] count = {0};


        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        txtCount = findViewById(R.id.txtCount);

        btnPlus.setOnClickListener(v -> {
            count[0]++;
            txtCount.setText(String.valueOf(count[0]));
        });

        btnMinus.setOnClickListener(v -> {
            if (count[0] > 0) {
                count[0]--;
            }
            txtCount.setText(String.valueOf(count[0]));
        });

            Button btnSubmit = findViewById(R.id.btnSubmit);
            btnSubmit.setOnClickListener(v -> {

                // Generate random 6-digit number
                int randomNum = (int)(Math.random() * 900000) + 100000;

                // Collect Dropdown values
                String d1 = dropdown1.getText().toString();
                String d2 = dropdown2.getText().toString();
                String d3 = dropdown3.getText().toString();
                String d4 = dropdown4.getText().toString();

                // Collect Date values
                String fromDate = FromDate.getText().toString();
                String toDate = ToDate.getText().toString();
                String commencement = CommencementDate.getText().toString();
                String permitUpto = PermittedDate.getText().toString();

                // Collect Checkboxes (true/false)
                boolean c1 = getIntent().getBooleanExtra("c1", false);
                boolean c2 = getIntent().getBooleanExtra("c2", false);
                boolean c3 = getIntent().getBooleanExtra("c3", false);
                boolean c4 = getIntent().getBooleanExtra("c4", false);

                boolean c5 = getIntent().getBooleanExtra("ca1", false);
                boolean c6 = getIntent().getBooleanExtra("ca2", false);
                boolean c7 = getIntent().getBooleanExtra("ca3", false);


                // Count
                String personCount = txtCount.getText().toString();

                // Popup Dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(Creation.this);
                builder.setTitle("Submission Successful");
                builder.setMessage("Your Reference Number: " + randomNum);

                builder.setPositiveButton("OK", (dialog, which) -> {

                    Intent intent = new Intent(Creation.this, Display_report.class);

                    // Sending values
                    intent.putExtra("dropdown1", d1);
                    intent.putExtra("dropdown2", d2);
                    intent.putExtra("dropdown3", d3);
                    intent.putExtra("dropdown4", d4);

                    intent.putExtra("fromDate", fromDate);
                    intent.putExtra("toDate", toDate);
                    intent.putExtra("commencement", commencement);
                    intent.putExtra("permitUpto", permitUpto);

//                    intent.putExtra("c1", c1);
//                    intent.putExtra("c2", c2);
//                    intent.putExtra("c3", c3);
//                    intent.putExtra("c4", c4);

                    intent.putExtra("c1", checkbox1.isChecked() ? "Selected" : "Not Selected");
                    intent.putExtra("c2", checkbox2.isChecked() ? "Selected" : "Not Selected");
                    intent.putExtra("c3", checkbox3.isChecked() ? "Selected" : "Not Selected");
                    intent.putExtra("c4", checkbox4.isChecked() ? "Selected" : "Not Selected");

                    intent.putExtra("c5", checkbox5.isChecked() ? "Yes" : "No");
                    intent.putExtra("c6", checkbox6.isChecked() ? "Yes" : "No");
                    intent.putExtra("c7", checkbox7.isChecked() ? "Yes" : "No");

//                    addRow("Checkbox 1", String.valueOf(c1));
//                    addRow("Checkbox 2", String.valueOf(c2));
//                    addRow("Checkbox 3", String.valueOf(c3));
//                    addRow("Checkbox 4", String.valueOf(c4));
//
//                    addRow("Clearance 1", String.valueOf(ca1));
//                    addRow("Clearance 2", String.valueOf(ca2));
//                    addRow("Clearance 3", String.valueOf(ca3));

                    intent.putExtra("count", personCount);
                    intent.putExtra("refNumber", randomNum);


                    startActivity(intent);
                });

                builder.setCancelable(false);
                builder.show();
            });


        }
}



