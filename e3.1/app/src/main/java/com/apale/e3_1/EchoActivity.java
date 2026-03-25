package com.apale.e3_1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class EchoActivity extends AppCompatActivity {

    private static final String TAG = "EchoActivityLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echo);

        Log.d(TAG, "onCreate method has successfully started.");

        Intent receivedIntent = getIntent();
        String message = receivedIntent.getStringExtra("USER_MESSAGE");

        if (message != null) {
            TextView txtEcho = findViewById(R.id.txtEcho);
            txtEcho.setText(message);
            Log.d(TAG, "Received message: " + message);
        }
    }
}