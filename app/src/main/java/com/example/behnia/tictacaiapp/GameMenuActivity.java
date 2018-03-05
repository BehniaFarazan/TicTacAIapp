package com.example.behnia.tictacaiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);


        Button buttonSingleplayer = (Button) findViewById(R.id.Singleplayer);
        buttonSingleplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GameMenuActivity.this,SingleplyerActivity.class);
                startActivity(i);
            }
        });

        Button buttonMultiplayer = (Button) findViewById(R.id.Multiplayer);
        buttonMultiplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GameMenuActivity.this,MultiplayerActivity.class);
                startActivity(i);
            }
        });
    }
}
