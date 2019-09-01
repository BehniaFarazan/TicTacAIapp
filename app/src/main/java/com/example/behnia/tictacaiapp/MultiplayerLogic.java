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
    private boolean case1, case2, case3, case4, case5, case6;

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
        setTotalcounter((int) (Math.random() * Math.pow(3, 10)));
        p1WON = false;
        p2WON = false;
        getP1Locs().clear();
        getP2Locs().clear();

    }

    protected Boolean cheackTurn() {
        thisIsnrTotChoise = getTotalcounter();
        //if (thisIsnrTotChoise == 1 || thisIsnrTotChoise == 3 || thisIsnrTotChoise == 5 || thisIsnrTotChoise == 7 || thisIsnrTotChoise == 9) {
        if ((thisIsnrTotChoise % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    int randNum = (int) (Math.random() * Math.pow(3, 10));
    int num = randNum;



    private boolean isDraw() {
        if (getChoisecounterP1()+getChoisecounterP2() == 16) {
            return true;
        }
        return false;
    }

    private boolean isWin() {
        String[][] field = new String[4][4];


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                field[i][j] = getBtnArray()[i][j].getText().toString();
            }
        }

        for (int i = 0; i < 4; i++) {
            if (field[i][0].equals(field[i][1])
                    && field[i][0].equals(field[i][2])
                    && field[i][0].equals(field[i][3])
                    && !field[i][0].equals("")) {
                return true;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (field[0][i].equals(field[1][i])
                    && field[0][i].equals(field[2][i])
                    && field[0][i].equals(field[3][i])
                    && !field[0][i].equals("")) {
                return true;
            }
        }

        if (field[0][0].equals(field[1][1])
                && field[0][0].equals(field[2][2])
                && field[0][0].equals(field[3][3])
                && !field[0][0].equals("")) {
            return true;
        }

        if (field[0][3].equals(field[1][2])
                && field[0][3].equals(field[2][1])
                && field[0][3].equals(field[3][0])
                && !field[0][3].equals("")) {
            return true;
        }

        return false;
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

    public boolean cheackDraw() {
        if (isDraw() & !isWin()) {
            return true;
        } else {
            return false;
        }
    }

}

