package com.bignerdranch.android.calculatorlauncher;

import static android.content.Intent.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.launcher).setOnClickListener(view -> {
            Intent calculatorIntent = new Intent(ACTION_VIEW, Uri.parse("calc://launch"));
            calculatorIntent.putExtra("message", "Hey there!");
            startActivity(createChooser(calculatorIntent, null));
        });
    }
}