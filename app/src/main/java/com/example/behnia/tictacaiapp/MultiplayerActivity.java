package com.example.behnia.tictacaiapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class MultiplayerActivity extends AppCompatActivity implements View.OnClickListener {

    private final MultiplayerLogic mylogic = MultiplayerLogic.getInstance();

    private static final Button[][] btnArray = new Button[3][3];

    int[][] btnIdArray = {{R.id.button_00, R.id.button_01, R.id.button_02}, {R.id.button_10, R.id.button_11, R.id.button_12}, {R.id.button_20, R.id.button_21, R.id.button_22}};

    static int totalcounter;
    static int choisecounterP1;
    static int choisecounterP2;
    static ArrayList<Double> p1Locs = new ArrayList<Double>();
    static ArrayList<Double> p2Locs = new ArrayList<Double>();

    public static ArrayList<Double> getP1Locs() {
        return p1Locs;
    }

    public static ArrayList<Double> getP2Locs() {
        return p2Locs;
    }

    public static int getTotalcounter() {
        return totalcounter;
    }

    public static void setTotalcounter(int totalcounter) {
        MultiplayerActivity.totalcounter = totalcounter;
    }

    public static int getChoisecounterP2() {
        return choisecounterP2;
    }

    public static int getChoisecounterP1() {
        return choisecounterP1;
    }

    public static void setChoisecounterP1(int choisecounterP1) {
        MultiplayerActivity.choisecounterP1 = choisecounterP1;
    }

    public static void setChoisecounterP2(int choisecounterP2) {
        MultiplayerActivity.choisecounterP2 = choisecounterP2;
    }

    TextView p1Score, p2Score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);

        mylogic.reset();

        p1Score = (TextView) findViewById(R.id.textView2);
        p2Score = (TextView) findViewById(R.id.textview3);

        for (int i = 0; i < btnArray.length; i++) {
            for (int j = 0; j < btnArray[0].length; j++) {
                btnArray[i][j] = (Button) findViewById(btnIdArray[i][j]);
                btnArray[i][j].setOnClickListener(this);
            }
        }
        final Button buttonNewgame = (Button) findViewById(R.id.button_reset);
        buttonNewgame.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mylogic.reset();
                updateDisplay();
            }
        });
    }

    public static Button[][] getBtnArray() {
        return btnArray;
    }

    public void updateDisplay() {
        p1Score.setText(String.valueOf(choisecounterP1));
        p2Score.setText(String.valueOf(choisecounterP2));
        for (int i = 0; i < btnArray.length; i++) {
            for (int j = 0; j < btnArray[0].length; j++) {
                btnArray[i][j] = (Button) findViewById(btnIdArray[i][j]);
                btnArray[i][j].setEnabled(true);
                btnArray[i][j].setText("");
            }
        }

    }

    public void checkLocs() {

        for (int i = 0; i < btnArray.length; i++) {
            for (int j = 0; j < btnArray[0].length; j++) {
                btnArray[i][j] = (Button) findViewById(btnIdArray[i][j]);
                if (btnArray[i][j].getText().equals("X")) {
                    double xy = Double.parseDouble(i + "." + j);
                    if (p1Locs.contains(xy)){

                    }else{
                    p1Locs.add(xy);
                    }
                } else if (btnArray[i][j].equals("O")) {
                    double xy = Double.parseDouble(i + "." + j);
                    if (p2Locs.contains(xy)){

                    }else{
                        p2Locs.add(xy);
                    }
                }
            }
        }
    }


    public void p1Choice(View view) {
        choisecounterP1++;
        ((Button) view).setText("X");
        ((Button) view).setTextColor(Color.RED);
        p1Score.setText(String.valueOf(choisecounterP1));
    }

    public void p2Choice(View view) {
        choisecounterP2++;
        ((Button) view).setText("O");
        ((Button) view).setTextColor(Color.GREEN);
        p2Score.setText(String.valueOf(choisecounterP2));
    }

    @Override
    public void onClick(View view) {
        if (view instanceof Button) {
            totalcounter++;
            if (mylogic.cheackTurn()) {
                p1Choice(view);
            } else {
                p2Choice(view);
            }
            view.setEnabled(false);
            checkLocs();
            mylogic.cheackWin();
            if (mylogic.cheackWin()) {

                Intent i = new Intent(MultiplayerActivity.this, FinitogameActivity.class);
                startActivity(i);
            }
        }



        //public void wrongGuess(View view) {
        //  ((Button) view).setTextColor(Color.RED);
        //}


     /*   if (view instanceof Button) {
            totalcounter++;
        }
        if(true){
        p1Score.setText(String.valueOf(getChoisecounterP1()));
        }
        else {
            p2Score.setText(String.valueOf(getChoisecounterP2()));
        }*/
    }

}