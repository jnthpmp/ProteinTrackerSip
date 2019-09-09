package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        TextView myTextView = findViewById(R.id.textView);
        myTextView.setText("Some Help Text");



        Bundle b = getIntent().getExtras();

        String helpText = b.getString("helpString");
        myTextView.setText("HelpText");
        

    }
}
