package com.example.avant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        Button move = findViewById(R.id.btnLogin);
//        move.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, Login.class);
//            startActivity(intent);
//        });
//    }
//}




//public class MainActivity extends AppCompatActivity {
//
////    EditText username;
////    EditText password;
////    Button loginButton;
//
//    EditText etEmail, etPassword;
//    Button btnLogin;
//    TextView tvSignup;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        etEmail = findViewById(R.id.etEmail);
//        etPassword = findViewById(R.id.etPassword);
//        btnLogin = findViewById(R.id.btnLogin);
//        tvSignup = findViewById(R.id.tvSignup);
//
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String email = etEmail.getText().toString();
//                String pass = etPassword.getText().toString();
//
//                if (email.isEmpty() || pass.isEmpty()) {
//                    Toast.makeText(MainActivity.this,
//                            "Please fill all fields",
//                            Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                if (etEmail.getText().toString().equals("user") && etPassword.getText().toString().equals("1234")) {
//                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
//
//                    // Go to Creation class
//                    startActivity(new Intent(MainActivity.this, Creation.class));
////                    finish();
//
//                } else {
//                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        tvSignup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Signup.class));
//            }
//        });
//    }
//}




import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnLogin;
    TextView tvSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);
        tvSignup = findViewById(R.id.tvSignup);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = etEmail.getText().toString();
                String pass = etPassword.getText().toString();

                if (email.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Please fill all fields",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                // Simple fixed login (replace with SQLite later)
                if (email.equals("admin@gmail.com") && pass.equals("12345")) {
                    Toast.makeText(MainActivity.this,
                            "Login Successful!",
                            Toast.LENGTH_SHORT).show();

                    // Go to MainActivity
                    startActivity(new Intent(MainActivity.this, Home.class));
//                    finish();

                } else {
                    Toast.makeText(MainActivity.this,
                            "Invalid Credentials",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Signup.class));
            }
        });
    }
}
