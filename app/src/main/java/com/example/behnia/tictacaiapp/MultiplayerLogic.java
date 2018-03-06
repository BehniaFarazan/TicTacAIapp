package com.example.behnia.tictacaiapp;

/**
 * Created by Behnia on 06-03-18.
 */

public class MultiplayerLogic {
    private static MultiplayerLogic instance;
private Boolean p1turn,p2turn;
    private int round;
    MultiplayerLogic(){
        start();
        roundStart();

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
        p2turn=false;
    }
    private void roundStart() {
        roundReset();
    }

}
