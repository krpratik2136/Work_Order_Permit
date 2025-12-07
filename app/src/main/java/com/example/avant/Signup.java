package com.example.avant;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    EditText etName, etEmail, etPassword, etConfirmPassword;
    Button btnSignup;
    TextView tvGoToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnSignup = findViewById(R.id.btnSignup);
        tvGoToLogin = findViewById(R.id.tvGoToLogin);

        btnSignup.setOnClickListener(v -> registerUser());
        tvGoToLogin.setOnClickListener(v ->
                startActivity(new Intent(Signup.this, MainActivity.class))
        );
    }

    private void registerUser() {

        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String pass = etPassword.getText().toString();
        String confirmPass = etConfirmPassword.getText().toString();

        if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirmPass.isEmpty()) {
            Toast.makeText(this, "All fields are required!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!pass.equals(confirmPass)) {
            Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO: Save to ROOM Database or Firebase
        Toast.makeText(this, "Account created successfully!", Toast.LENGTH_SHORT).show();

        // Redirect to Login
        startActivity(new Intent(Signup.this, MainActivity.class));
        finish();
    }
}
