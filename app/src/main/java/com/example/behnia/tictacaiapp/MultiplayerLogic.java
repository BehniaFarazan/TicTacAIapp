package com.example.behnia.tictacaiapp;

import android.view.View;
import android.widget.Button;

/**
 * Created by Behnia on 06-03-18.
 */

public class MultiplayerLogic {
    private static MultiplayerLogic instance;
    MultiplayerActivity ma = new MultiplayerActivity();
    String x = "X";
    String o = "O";
private Boolean p1turn,p2turn;
    private int round;
    MultiplayerLogic(){
        start();
        roundStart();
    }

    public Boolean getP1turn() {
        return p1turn;
    }
    public Boolean getP2turn() {
        return p2turn;
    }

    static {
        try {
            instance = new MultiplayerLogic();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized MultiplayerLogic getInstance() {
        return instance;
    }

    public void roundReset() {
        round = 0;
    }

    private void start() {
        p1turn=true;
        p2turn=true;
    }
    void pOneTurn()
    {
pOneChoose();
    }
    void pTwoTurn()
    {
pTwoChoose();
    }
   void pOneChoose(){

   }
    void pTwoChoose(){

    }
    public void roundStart() {
        roundReset();
        do {
            round++;
            //pOneTurn();
            //pTwoTurn();
        }while (round==3);
    }

    public void cheackWin(View view) {
       // if(ma.btnIdArray[0][0]=x&& ma.btnIdArray[0][1]= x){

        }
    }

