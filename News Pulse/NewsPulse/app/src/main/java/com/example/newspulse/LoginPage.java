package com.example.newspulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


public class LoginPage extends AppCompatActivity {
    private TextView registerButton; // Define the Register TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page); // Set your layout XML file

        // Find the Register TextView by its ID
        registerButton = findViewById(R.id.btn_register);

        // Set an OnClickListener for the Register TextView
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the RegisterPage (replace RegisterPage.class with your actual register activity)
                Intent intent = new Intent(LoginPage.this, RegisterPage.class);
                startActivity(intent); // Start the RegisterPage
            }
        });
    }
}