package com.example.behnia.tictacaiapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultiplayerActivity extends AppCompatActivity implements View.OnClickListener {

    private final MultiplayerLogic mylogic = MultiplayerLogic.getInstance();

    private final Button[][] btnArray = new Button[3][3];

    int[][] btnIdArray = {{R.id.button_00,R.id.button_01,R.id.button_02},{R.id.button_10,R.id.button_11,R.id.button_12},{R.id.button_20,R.id.button_21,R.id.button_22}};

    public String getBtnArray() {
        return btnArray.toString();
    }

boolean p1turn = true ;
    boolean p2turn = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);

        mylogic.roundStart();

        for (int i = 0; i < btnArray.length; i++) {
            for (int j = 0; j < btnArray[0].length; j++) {
            btnArray[i][j] = (Button) findViewById(btnIdArray[i][j]);
            btnArray[i][j].setOnClickListener(this);
        }
        }
    }
    @Override
    public void onClick(View view) {

        if(p1turn){
        if (view instanceof Button) {
            view.setEnabled(false);
            ((Button) view).setTextColor(Color.GREEN);
            ((Button) view).setText("O");
            p1turn=false;
            p2turn=true;
        }}

        else if(p2turn){
            if (view instanceof Button) {
                view.setEnabled(false);
                ((Button) view).setTextColor(Color.RED);
                ((Button) view).setText("X");
                p2turn=false;
                p1turn=true;
            }}
          
            //mylogic.cheackWin();
    }






    MultiplayerActivity(){

    }
}
