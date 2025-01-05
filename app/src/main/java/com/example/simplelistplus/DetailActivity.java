package com.example.simplelistplus;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView selectedItemText = findViewById(R.id.selectedItemText);
        TextView positionNumberText = findViewById(R.id.positionNumberText);
        Button backButton = findViewById(R.id.backButton);

        int positionNumber = getIntent().getIntExtra("position_number", -1);
        selectedItemText.setText("Kliknąłeś w pozycję numer:");
        positionNumberText.setText(String.valueOf(positionNumber));

        backButton.setOnClickListener(v -> finish());
    }
}
