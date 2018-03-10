package com.example.behnia.tictacaiapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FinitogameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finitogame);


    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Going back the game which is finito")
                .setMessage("The game restarted! Are you sure?")
                .setNegativeButton("No", null)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent i = new Intent(FinitogameActivity.this, MultiplayerActivity.class);
                        startActivity(i);
                    }
                }).create().show();
    }
}