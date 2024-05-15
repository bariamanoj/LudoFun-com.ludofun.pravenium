package com.ludofun.pravenium;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;


public class SplashpraveniumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        setContentView(R.layout.activity_splashpravenium);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the WebpraveniumActivity
                startActivity(new Intent(SplashpraveniumActivity.this, WebpraveniumActivity.class));
                finish(); // Finish the current activity to prevent the user from coming back to it with the back button
            }
        }, 2000);
    }

}