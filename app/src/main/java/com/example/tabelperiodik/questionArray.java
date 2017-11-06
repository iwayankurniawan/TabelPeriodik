package com.example.tabelperiodik;

/**
 * Created by kurni on 04/11/2017.
 */

public class questionArray {

    private int gol1A [][] = {
            {R.id.quiz_h,R.id.position_1},
            {R.id.quiz_li,R.id.position_2},
            {R.id.quiz_na,R.id.position_3},
            {R.id.quiz_k,R.id.position_4},
            {R.id.quiz_rb,R.id.position_5},
            {R.id.quiz_cs,R.id.position_6},
            {R.id.quiz_fr,R.id.position_7}
    };


    public int getChoices (int a, int b){
        int theChoices = gol1A[a][b];
        return theChoices;
    }


}
