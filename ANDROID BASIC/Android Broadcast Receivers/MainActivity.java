package com.example.androidbroadcastreceivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Called when the activity is first created

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // broadcast a custom intent.
    public void broadcastIntent(View view){
        Intent intent=new Intent();
        intent.setAction("com.example.androidbroadcastreceivers.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
