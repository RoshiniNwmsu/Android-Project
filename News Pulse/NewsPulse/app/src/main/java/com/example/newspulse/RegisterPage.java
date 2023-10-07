package com.example.newspulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterPage extends AppCompatActivity {
    private TextView loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);


        // Find the Login TextView by its ID
        loginButton = findViewById(R.id.tv_loginButton);

        // Set an OnClickListener for the Login TextView
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the LoginPage (replace LoginPage.class with your actual login activity)
                Intent intent = new Intent(RegisterPage.this, LoginPage.class);
                startActivity(intent); // Start the LoginPage
            }

    });
}}