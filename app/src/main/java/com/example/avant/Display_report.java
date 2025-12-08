package com.example.avant;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;

public class Display_report extends AppCompatActivity {

    TableLayout tableLayout;
    Button btnPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_report);

        tableLayout = findViewById(R.id.tableLayout);
        btnPdf = findViewById(R.id.btnDownloadPdf);

        // Receive data
        String d1 = getIntent().getStringExtra("dropdown1");
        String d2 = getIntent().getStringExtra("dropdown2");
        String d3 = getIntent().getStringExtra("dropdown3");
        String d4 = getIntent().getStringExtra("dropdown4");

        String r1 = getIntent().getStringExtra("Radio");

        String fromDate = getIntent().getStringExtra("fromDate");
        String toDate = getIntent().getStringExtra("toDate");
        String commencement = getIntent().getStringExtra("commencement");
        String permitUpto = getIntent().getStringExtra("permitUpto");

        // Receive Checkbox TEXT instead of boolean
        String c1 = getIntent().getStringExtra("c1");
        String c2 = getIntent().getStringExtra("c2");
        String c3 = getIntent().getStringExtra("c3");
        String c4 = getIntent().getStringExtra("c4");

        String c5 = getIntent().getStringExtra("c5");
        String c6 = getIntent().getStringExtra("c6");
        String c7 = getIntent().getStringExtra("c7");

        String txt1 = getIntent().getStringExtra("txt1");
        String txt2 = getIntent().getStringExtra("txt2");


        String count = getIntent().getStringExtra("count");
        int refNumber = getIntent().getIntExtra("refNumber", 0);

        // Add table rows
        addRow("Reference Number", String.valueOf(refNumber));

        addRow("CONTRACTOR NAME: ", d1);
        addRow("LOCATION OF WORK: ", d2);
        addRow("SUB LOCATION: ", d3);
        addRow("PLANT PROJECT MANAGER: ", d4);

        addRow("TYPE OF WORK: ",r1);

        addRow("From Date: ", fromDate);
        addRow("To Date: ", toDate);
        addRow("Commencement: ", commencement);
        addRow("Permit Upto: ", permitUpto);

        addRow("Personal Involvement: ", txt1);
        addRow("SUPERVISOR : ", c1);
        addRow("TECHNICIAN: ", c2);
        addRow("ENGINEER: ", c3);
        addRow("LABOUR: ", c4);

        addRow("EHS: ", c5);
        addRow("SECURITY: ", c6);
        addRow("SAFETY: ", c7);

        addRow("Person Count", count);

        // Generate PDF on click
        btnPdf.setOnClickListener(v -> {
            String pdfContent = generateTableText();
            generatePDF(pdfContent);
        });

        Button btnWorkflow = findViewById(R.id.submit_report);
        btnWorkflow.setOnClickListener(v -> {
            startActivity(new Intent(Display_report.this, Home.class));
        });
    }

    // Helper method to add rows
    private void addRow(String label, String value) {
        TableRow row = new TableRow(this);

        TextView tvLabel = new TextView(this);
        tvLabel.setText(label);
        tvLabel.setPadding(10, 10, 10, 10);
        tvLabel.setTextSize(16);

        TextView tvValue = new TextView(this);
        tvValue.setText(value);
        tvValue.setPadding(10, 10, 10, 10);
        tvValue.setTextSize(16);

        row.addView(tvLabel);
        row.addView(tvValue);

        tableLayout.addView(row);
    }

    // Convert table into text
    private String generateTableText() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < tableLayout.getChildCount(); i++) {
            TableRow row = (TableRow) tableLayout.getChildAt(i);

            TextView label = (TextView) row.getChildAt(0);
            TextView value = (TextView) row.getChildAt(1);

            builder.append(label.getText().toString()).append(": ")
                    .append(value.getText().toString()).append("\n");
        }

        return builder.toString();
    }

    // Generate PDF
    private void generatePDF(String content) {
        PdfDocument pdfDocument = new PdfDocument();
        Paint paint = new Paint();

        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(595, 842, 1).create();
        PdfDocument.Page page = pdfDocument.startPage(pageInfo);

        Canvas canvas = page.getCanvas();
        paint.setTextSize(12);
        int x = 20, y = 40;

        for (String line : content.split("\n")) {
            canvas.drawText(line, x, y, paint);
            y += 20;
        }

        pdfDocument.finishPage(page);

        String filename = "Report_" + System.currentTimeMillis() + ".pdf";
        File file = new File(getExternalFilesDir(null), filename);

        try {
            pdfDocument.writeTo(new FileOutputStream(file));
            Toast.makeText(this, "PDF saved: " + file.getAbsolutePath(), Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();
        }

        pdfDocument.close();
    }
}
