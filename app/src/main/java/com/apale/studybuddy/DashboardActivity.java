package com.apale.studybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button btnSubjects = findViewById(R.id.btn_subjects);
        Button btnProfile = findViewById(R.id.btn_profile);
        Button btnAbout = findViewById(R.id.btn_about);

        btnSubjects.setOnClickListener(v -> {
            startActivity(new Intent(DashboardActivity.this, SubjectsActivity.class));
        });

        btnProfile.setOnClickListener(v -> {
            startActivity(new Intent(DashboardActivity.this, ProfileActivity.class));
        });

        btnAbout.setOnClickListener(v -> {
            startActivity(new Intent(DashboardActivity.this, AboutActivity.class));
        });
    }
}
