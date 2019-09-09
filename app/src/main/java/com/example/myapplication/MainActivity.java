package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener btnTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.Test_Untuk_update_view);

        Button myBtn = findViewById(R.id.button1);

        Button helpBtn = (Button)findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);

        Button btnPlg = findViewById(R.id.Pelangi);
        btnPlg.setOnClickListener(btnPelangi);

        Button btnTrck = (Button)findViewById(R.id.Tracker);
        btnTrck.setOnClickListener(btnTracker);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = findViewById(R.id.editText);
                Log.d("Proteintracker",myEditText.getText().toString());
            }

        });

    }

    private View.OnClickListener myBtnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText myEditText = findViewById(R.id.editText);
            Log.d("Proteintracker",myEditText.getText().toString());

        }

    };
    /*private View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);
            startActivity(intent);
        }
    };*/

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc","test");
        super.onSaveInstanceState(outState);

    }
    private View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);

            Bundle b = new Bundle();

            EditText myEditText = (EditText)findViewById(R.id.editText);

            b.putString("helpString",myEditText.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
        }
    };

    private View.OnClickListener btnPelangi = new View.OnClickListener(){
        @Override
        public  void onClick(View view){
            Intent intent = new Intent(MainActivity.this,Pelangi.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener getBtnTracker = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,ProteinTrackerApp.class);

            startActivity(intent);
        }
        };

}


