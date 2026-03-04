package com.apale.mobileexercise01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.apale.mobileexercise01.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("ID: 24103140");
        }

        Button myButton = findViewById(R.id.btnChangeName);
        final TextView myText = findViewById(R.id.tvDepartment);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myText.setText("Dr. Angie M. Ceniza-Canillo");
            }
        });
    }
}