package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class url extends AppCompatActivity {

    private EditText urlEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        // Initialize the EditText and Button
        urlEditText = findViewById(R.id.urlEditText);
        Button openUrlButton = findViewById(R.id.openUrlButton);

        // Set an OnClickListener for the button
        openUrlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl();
            }
        });
    }

    // Method to open the URL
    public void openUrl() {
        String url = urlEditText.getText().toString(); // Get the URL from EditText

        if (!url.isEmpty()) {
            // Check if the URL starts with "http://", if not, add it
            if (!url.startsWith("http://") && !url.startsWith("https://")) {
                url = "http://" + url;
            }

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent); // This opens the URL in the default browser
        } else {
            urlEditText.setError("Please enter a valid URL.");
        }
    }
}
