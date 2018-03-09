package com.example.behnia.tictacaiapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MultiplayerActivity extends AppCompatActivity implements View.OnClickListener {

    private final MultiplayerLogic mylogic = MultiplayerLogic.getInstance();

    private final Button[][] btnArray = new Button[3][3];

    int[][] btnIdArray = {{R.id.button_00, R.id.button_01, R.id.button_02}, {R.id.button_10, R.id.button_11, R.id.button_12}, {R.id.button_20, R.id.button_21, R.id.button_22}};
boolean p1Turn;
    public static int totalcounter;

    public static int getTotalcounter() {
        return totalcounter;
    }

    static int choisecounterP2;


    public static int getChoisecounterP2() {
        return choisecounterP2;
    }

    static int choisecounterP1;

    public static int getChoisecounterP1() {
        return choisecounterP1;
    }

    TextView p1Score, p2Score;

    //boolean p1turn = mylogic.getP1turn();
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
    }



    @Override
    public void onClick(View view) {

        if (view instanceof Button) {

            totalcounter++;
         // mylogic.cheackTurn();
            if (mylogic.cheackTurn()) {
              //  correctGuess(v);
                ((Button) view).setText("X");
                ((Button) view).setTextColor(Color.RED);
                p1Score.setText(String.valueOf(totalcounter));
            } else {
               // wrongGuess(v);
                ((Button) view).setText("O");
                ((Button) view).setTextColor(Color.GREEN);

            }
        view.setEnabled(false);
    }





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