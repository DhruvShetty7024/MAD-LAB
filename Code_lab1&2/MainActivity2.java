package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        Intent intent2 = new Intent(MainActivity2.this, colour.class);
        Intent intent3 = new Intent(MainActivity2.this, colour2.class);

        Button loginButton = findViewById(R.id.button2);
        loginButton.setOnClickListener(view -> startActivity(intent));
        Button linearlayout = findViewById(R.id.button4);
        linearlayout.setOnClickListener(view -> startActivity(intent2));
        Button relativelayout = findViewById(R.id.button6);
        relativelayout.setOnClickListener(view -> startActivity(intent3));
    }
}