package com.example.behnia.tictacaiapp;

import android.view.View;
import android.widget.Button;

import static com.example.behnia.tictacaiapp.MultiplayerActivity.getTotalcounter;
import static com.example.behnia.tictacaiapp.MultiplayerActivity.setChoisecounterP1;
import static com.example.behnia.tictacaiapp.MultiplayerActivity.setChoisecounterP2;
import static com.example.behnia.tictacaiapp.MultiplayerActivity.setTotalcounter;
import static com.example.behnia.tictacaiapp.MultiplayerActivity.totalcounter;

/**
 * Created by Behnia on 06-03-18.
 */

public class MultiplayerLogic {
    private static MultiplayerLogic instance;
    private int p2Score, p1Score, thisIsnrTotChoise;
    private boolean thisGameIsWon;

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

    public void reset() {
        setChoisecounterP1(0);
        setChoisecounterP2(0);
        setTotalcounter(1);
        thisGameIsWon = false;
    }

    public Boolean cheackTurn() {
        thisIsnrTotChoise = getTotalcounter();
        //if (thisIsnrTotChoise == 1 || thisIsnrTotChoise == 3 || thisIsnrTotChoise == 5 || thisIsnrTotChoise == 7 || thisIsnrTotChoise == 9) {
        if ((thisIsnrTotChoise % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }








    /*public void choice (int p1Score, boolean p1Turn) {
       thisIsnrTotChoise++;
        if (thisIsnrTotChoise==1||thisIsnrTotChoise==3||thisIsnrTotChoise==5||thisIsnrTotChoise==7||thisIsnrTotChoise==9) {
            p1Score ++;
            p1Turn = true;

        } else {
            p2Score ++;
          p1Turn=false;

        }
    }




    MultiplayerActivity multi = new MultiplayerActivity();
    private static MultiplayerLogic instance;

    int counter = multi.getTotalcounter();

    public void cheackTurn() {
        if (counter==1||counter==3||counter==5||counter==7||counter==9){
          p1turn=true;
        }
        else {
            p2turn = true;
        }
    }


    String x = "X";
    String o = "O";


    private Boolean p1turn,p2turn;


    private int round;
    public boolean p1Turn;

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
       cheackTurn();
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


*/


}

