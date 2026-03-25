package com.apale.e3_1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "InputActivityLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate method has successfully started.");

        EditText etMessage = findViewById(R.id.etMessage);
        Button btnSend = findViewById(R.id.btnSend);
        Button btnShare = findViewById(R.id.btnShare);

        // Explicit Intent — go to EchoActivity
        btnSend.setOnClickListener(v -> {
            Log.i(TAG, "The user clicked the Send button!");

            String message = etMessage.getText().toString().trim();

            if (message.isEmpty()) {
                Toast.makeText(this, "Please type a message first.", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(MainActivity.this, EchoActivity.class);
            intent.putExtra("USER_MESSAGE", message);
            startActivity(intent);
        });

        // BONUS: Implicit Intent — share via SMS/email
        btnShare.setOnClickListener(v -> {
            Log.i(TAG, "The user clicked the Share button!");

            String message = etMessage.getText().toString().trim();

            if (message.isEmpty()) {
                Toast.makeText(this, "Please type a message first.", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, message);
            startActivity(Intent.createChooser(shareIntent, "Share via"));
        });
    }
}