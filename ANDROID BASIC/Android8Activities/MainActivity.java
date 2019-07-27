package com.example.android8activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String msg="Android : ";
    // Called when the activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event1111111111111");
    }
    // Called when the activity is about to become visible
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg, "The onStart() event2222222222222");
    }
    // Called when another activity is taking focus
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg, "The onPause() event33333333333333333");
    }
    // Called when the activity is no longer visible
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg, "The onStop() event44444444444444");
    }
    // Called just before the activity is destroyed.
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(msg, "The onDestroy() event55555555555555");
    }
}
