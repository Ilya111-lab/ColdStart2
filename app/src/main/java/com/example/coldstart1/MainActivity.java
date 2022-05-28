package com.example.coldstart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences prefs = null;
    private final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = getSharedPreferences("com.example.coldstart.MainActivity", MODE_PRIVATE);
        int i=prefs.getInt("thirdrun", 0);
        setContentView(R.layout.activity_main);
        i++;
        if (i==3) {
            Toast.makeText(this, "Started!", Toast.LENGTH_LONG).show();
        }
        prefs.edit().putInt("thirdrun", i).commit();
        Log.v(LOG_TAG, "Number of entry: " + i);
    }

}