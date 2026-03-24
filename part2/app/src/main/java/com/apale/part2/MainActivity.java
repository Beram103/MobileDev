package com.apale.part2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.apale.part2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSubmit.setOnClickListener(v -> validateLogin());
    }

    private void validateLogin() {
        String studentId = binding.etStudentId.getText().toString().trim();
        String password  = binding.etPassword.getText().toString().trim();

        // Get last two digits of Student ID
        if (studentId.length() < 2) {
            binding.tvResult.setText("Invalid Student ID.");
            return;
        }

        String lastTwo = studentId.substring(studentId.length() - 2);


        String wallColor  = "yellow";
        String correctPassword = wallColor + lastTwo;

        if (password.equals(correctPassword)) {
            binding.tvResult.setText("Access Granted! Welcome.");
        } else {
            binding.tvResult.setText("Access Denied. Wrong password.");
        }
    }
}
