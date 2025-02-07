package com.pucit.myandroidapp.View.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.pucit.myandroidapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // this function will execute after 3000 milliseconds (3 seconds)
//                Intent intent = new Intent(SplashScreen.this, Signup.class);
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                //The startActivity method is called with the Intent, indicating that the MainActivity is going to be started.
                startActivity(intent);
                //SplashScreen activity is being closed and removed from the activity stack.
                finish();
            }
        }, 3000);
    }
}