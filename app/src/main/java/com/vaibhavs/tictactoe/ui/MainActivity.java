package com.vaibhavs.tictactoe.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vaibhavs.tictactoe.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setbtns();
    }

    private void setbtns(){
        Button play = findViewById(R.id.btn_play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, playgame.class);
                startActivity(i);
            }
        });
        Button settingbtn = findViewById(R.id.btn_settings);
        settingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, settings.class);
                startActivity(i);
            }
        });
        Button helpme = findViewById(R.id.btn_help);
        helpme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, help.class);
                startActivity(i);
            }
        });
    }
}