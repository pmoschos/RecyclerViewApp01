package gr.aueb.cf.recyclerviewapp01.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import gr.aueb.cf.recyclerviewapp01.R;

public class SecondActivity extends AppCompatActivity {

    private TextView titleTV;
    private TextView genreTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        titleTV = findViewById(R.id.titleTextView);
        genreTV = findViewById(R.id.genreTextView);

        Intent intent = getIntent();
        titleTV.setText(intent.getStringExtra("title"));
        genreTV.setText(intent.getStringExtra("genre"));

    }
}