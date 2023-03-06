package com.example.hycu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected Button toastBtl;
    protected Toast toast;
    @SuppressLint({"MissingInflatedId", "RestrictedApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("HYCU");
        getSupportActionBar().setIcon(R.drawable.img_managemodify);

        toastBtl = findViewById(R.id.toastBt);
        toastBtl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MainActivity.this, getString(R.string.strBtn), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}