package com.himadri_parikh.lab3_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("lcTag", "called from onCreate");
        Toast.makeText(MainActivity.this,
                "called from onCreate", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lcTag", "called from onStop");
        Toast.makeText(MainActivity.this,
                "called from onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lcTag", "called from onStart");
        Toast.makeText(MainActivity.this,
                "called from onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lcTag", "called from onDestroy");
        Toast.makeText(MainActivity.this,
                "called from onDestroy", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lcTag", "called from onPause");
        Toast.makeText(MainActivity.this,
                "called from onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lcTag", "called from onResume");
        Toast.makeText(MainActivity.this,
                "called from onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lcTag", "called from onRestart");
        Toast.makeText(MainActivity.this,
                "called from onRestart", Toast.LENGTH_SHORT).show();
    }
}