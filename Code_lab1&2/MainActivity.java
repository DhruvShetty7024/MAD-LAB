package com.example.lab2_q1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent1 = new Intent(MainActivity.this, list.class);
        Intent intent2 = new Intent(MainActivity.this, grid.class);
        Intent intent3 = new Intent(MainActivity.this, tab.class);
        Intent intent4 = new Intent(MainActivity.this, table.class);


        Button listButton = findViewById(R.id.button);
        listButton.setOnClickListener(view -> startActivity(intent1));
        Button gridButton = findViewById(R.id.button2);
        gridButton.setOnClickListener(view -> startActivity(intent2));
        Button tabButton = findViewById(R.id.button3);
        tabButton.setOnClickListener(view -> startActivity(intent3));
        Button tableButton = findViewById(R.id.button4);
        tableButton.setOnClickListener(view -> startActivity(intent4));

    }}