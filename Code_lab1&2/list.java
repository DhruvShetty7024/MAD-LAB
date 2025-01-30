package com.example.lab2_q1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listView);

        // Sample data for the ListView
        String[] countries = {
                "American Samoa", "El Salvador", "Saint Helena", "Saint Kitts and Nevis",
                "Saint Lucia", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines",
                "Samoa", "San Marino", "Saudi Arabia"
        };

        // Custom adapter to bind data to ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries) {
            @Override
            public View getView(int position, View convertView, android.view.ViewGroup parent) {
                // Inflate the default list item layout
                View view = super.getView(position, convertView, parent);
                // Set the custom selector for background
                view.setBackgroundResource(R.drawable.list_item_selector);
                return view;
            }
        };

        // Set the adapter to the ListView
        listView.setAdapter(adapter);

        // Handle item click event
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String country = (String) parent.getItemAtPosition(position);
                Toast.makeText(list.this, "Selected: " + country, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
