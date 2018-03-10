package com.example.behnia.tictacaiapp;

import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.example.behnia.tictacaiapp.MultiplayerActivity.getBtnArray;
import static com.example.behnia.tictacaiapp.MultiplayerActivity.getChoisecounterP1;
import static com.example.behnia.tictacaiapp.MultiplayerActivity.getChoisecounterP2;
import static com.example.behnia.tictacaiapp.MultiplayerActivity.getP1Locs;
import static com.example.behnia.tictacaiapp.MultiplayerActivity.getP2Locs;
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
    private boolean p1WON;
    private boolean p2WON;
private boolean case1,case2,case3,case4,case5,case6;
    //static ArrayList<Double> case1 = new ArrayList<Double>();
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
        p1WON=false;
        p2WON=false;
getP1Locs().clear();
        getP2Locs().clear();

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

   /* public boolean isWin() {
        if (getP1Locs().contains(0.0) && getP1Locs().contains(0.1) && getP1Locs().contains(0.2)) {
    p1WON = true;
            return true;
        } else if (getP1Locs().contains(1.0) && getP1Locs().contains(1.1) && getP1Locs().contains(1.2)) {
            p1WON = true;
            return true;
        } else if (getP1Locs().contains(2.0) && getP1Locs().contains(2.1) && getP1Locs().contains(2.2)) {
            p1WON = true;
            return true;

        } else {
            return false;
        }
    }*/
    private boolean isWin() {
        String[][] field = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = getBtnArray()[i][j].getText().toString();
            }
        }

        for (int i = 0; i < 3; i++) {
            if (field[i][0].equals(field[i][1])
                    && field[i][0].equals(field[i][2])
                    && !field[i][0].equals("")) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (field[0][i].equals(field[1][i])
                    && field[0][i].equals(field[2][i])
                    && !field[0][i].equals("")) {
                return true;
            }
        }

        if (field[0][0].equals(field[1][1])
                && field[0][0].equals(field[2][2])
                && !field[0][0].equals("")) {
            return true;
        }

        if (field[0][2].equals(field[1][1])
                && field[0][2].equals(field[2][0])
                && !field[0][2].equals("")) {
            return true;
        }

        return false;
    }

    public void whichWayWho() {

       /* for (int i = 0; i < 3; i++) {
            double xy = Double.parseDouble(0 + "." + i);

            for (int j = 0; j < 3; j++) {

            }
        }


       if (getP1Locs().contains(0.0) && getP1Locs().contains(0.1) && getP1Locs().contains(0.2)) {
            p1WON = true;
            case1 = true;
        } else if (getP1Locs().contains(1.0) && getP1Locs().contains(1.1) && getP1Locs().contains(1.2)) {
            p1WON = true;
            case1 = true;
        } else if (getP1Locs().contains(2.0) && getP1Locs().contains(2.1) && getP1Locs().contains(2.2)) {
            p1WON = true;
            case1 = true;

        }else if (getP1Locs().contains(0.0) && getP1Locs().contains(1.0) && getP1Locs().contains(2.0)) {
            p1WON = true;
            case1 = true;

        }else if (getP1Locs().contains(0.1) && getP1Locs().contains(1.1) && getP1Locs().contains(2.1)) {
            p1WON = true;
            case1 = true;

        }else if (getP1Locs().contains(0.2) && getP1Locs().contains(1.2) && getP1Locs().contains(2.2)) {
            p1WON = true;
            case1 = true;

        }*/


    }

    public Boolean cheackWin() {
        if (isWin()) {
            //if (){
            return true;
            //}
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

