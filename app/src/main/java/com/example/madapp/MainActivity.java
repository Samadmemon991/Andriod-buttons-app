package com.example.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button OcBtn, LcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        OcBtn = (Button) findViewById(R.id.oc_btn);
        OcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "The Button is clicked ", Toast.LENGTH_LONG).show();
                OcBtn.setText("The Button is Clicked ");
            }
        });

        LcBtn = (Button) findViewById(R.id.lc_btn);
        LcBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "The Button is long clicked ", Toast.LENGTH_LONG).show();
                LcBtn.setText("The Button is Clicked ");
                return false;
            }
        });
    }
}

