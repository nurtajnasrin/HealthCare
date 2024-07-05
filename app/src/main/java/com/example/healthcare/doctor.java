package com.example.healthcare;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class doctor extends AppCompatActivity {

    private String[] doctorNames = {
            "Dr. Smith",
            "Dr. Johnson",
            "Dr. Williams",
            "Dr. Brown",
            "Dr. Davis",
            "Dr. Miller",
            "Dr. Wilson",
            "Dr. Moore",
            "Dr. Taylor",
            "Dr. Anderson",
            "Dr. Thomas",
            "Dr. Jackson",
            "Dr. White",
            "Dr. Harris",
            "Dr. Martin",
            "Dr. Thompson",
            "Dr. Garcia",
            "Dr. Martinez",
            "Dr. Robinson",
            "Dr. Clark",
            "Dr. Rodriguez",
            "Dr. Lewis",
            "Dr. Lee",
            "Dr. Walker",
            "Dr. Hall",
            "Dr. Allen",
            "Dr. Young",
            "Dr. Hernandez",
            "Dr. King",
            "Dr. Wright"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doctor);

        ListView listView = findViewById(R.id.doctorList);

        // Create an ArrayAdapter to populate the ListView with doctor names
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, doctorNames);

        // Set the ArrayAdapter to the ListView
        listView.setAdapter(adapter);
    }
}