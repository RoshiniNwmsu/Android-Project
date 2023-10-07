package com.example.newspulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView registerButton;
    private TextView loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the TextViews by their IDs
        registerButton = findViewById(R.id.btn_register);
        loginButton = findViewById(R.id.tv_loginButton);

        // Set an OnClickListener for the Register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the RegisterActivity
                Intent intent = new Intent(MainActivity.this, RegisterPage.class);
                startActivity(intent); // Start the RegisterActivity
            }
        });

        // Set an OnClickListener for the Login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the LoginActivity
                Intent intent = new Intent(MainActivity.this, LoginPage.class);
                startActivity(intent); // Start the LoginActivity
            }
        });
    }
}



