package com.example.androidapp_practice13;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {

    private EditText etNewUsername, etNewPassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etNewUsername = findViewById(R.id.etNewUsername);
        etNewPassword = findViewById(R.id.etNewPassword);
        btnRegister = findViewById(R.id.btnRegister);

        // Обработка регистрации
        btnRegister.setOnClickListener(v -> {
            String newUsername = etNewUsername.getText().toString();
            String newPassword = etNewPassword.getText().toString();

            if (newUsername.isEmpty() || newPassword.isEmpty()) {
                Toast.makeText(SignUp.this, "Fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                // Здесь будет запрос на сервер для регистрации
                // ...
            }
        });
    }
}