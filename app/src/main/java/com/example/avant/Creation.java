package com.example.avant;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
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
        btnSubmit.setOnClickListener(v -> startActivity(new Intent(Creation.this, Home.class)));
    }
}