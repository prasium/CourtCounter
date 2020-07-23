package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    //+3 point method
    public void plusThreeA(View view)
    {
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    //+2 point method
    public void plusTwoA(View view)
    {
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    //+1 point method
    public void freeA(View view)
    {
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }



    //+3 point method
    public void plusThreeB(View view)
    {
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    //+2 point method
    public void plusTwoB(View view)
    {
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    //+1 point method
    public void freeB(View view)
    {
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
//reset scores
    public void resetvalues(View view)
    {
        scoreA=0;
        scoreB=0;
       displayForTeamA(scoreA);
       displayForTeamB(scoreB);
    }
}
