package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new Handler(Looper.getMainLooper()).postDelayed(() ->{
            Intent intent=new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
            finish();
        },3000);
    }
}