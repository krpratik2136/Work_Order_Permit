//package com.example.avant;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.Button;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
////public class Login extends AppCompatActivity {
//
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_login);
//
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_login);
////
////        Button loginBtn = findViewById(R.id.btnLogin);
////
////        loginBtn.setOnClickListener(v -> {
////            Intent intent = new Intent(Login.this, MainActivity.class);
////            startActivity(intent);
////            finish(); // prevents going back to login
////        });
////    }
////}
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class Login extends AppCompatActivity {
//
//    EditText etEmail, etPassword;
//    Button btnLogin;
//    TextView tvSignup;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        etEmail = findViewById(R.id.etEmail);
//        etPassword = findViewById(R.id.etPassword);
//        btnLogin = findViewById(R.id.btnLogin);
//        tvSignup = findViewById(R.id.tvSignup);
//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String email = etEmail.getText().toString();
//                String pass = etPassword.getText().toString();
//
//                if (email.isEmpty() || pass.isEmpty()) {
//                    Toast.makeText(Login.this,
//                            "Please fill all fields",
//                            Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                // Simple fixed login (replace with SQLite later)
//                if (email.equals("admin@gmail.com") && pass.equals("12345")) {
//                    Toast.makeText(Login.this,
//                            "Login Successful!",
//                            Toast.LENGTH_SHORT).show();
//
//                    // Go to MainActivity
//                    startActivity(new Intent(Login.this, MainActivity.class));
//                    finish();
//
//                } else {
//                    Toast.makeText(Login.this,
//                            "Invalid Credentials",
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        tvSignup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Login.this, Signup.class));
//            }
//        });
//    }
//}
