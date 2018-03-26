package com.example.android.footballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * This method is called when the team A safety button is clicked.
     */
    public void teamASafety(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA();
    }

    /**
     * This method is called when the team A fieldgoal button is clicked.
     */
    public void teamAFieldGoal(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA();
    }

    /**
     * This method is called when the team A touchdown button is clicked.
     */
    public void teamATouchdown(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA();
    }

    /**
     * This method is called when the team A extra point button is clicked.
     */
    public void teamAExtraPoint(View view) {
        scoreTeamA = scoreTeamA+ 1;
        displayForTeamA();
    }

    /**
     * This method is called when the team B safety button is clicked.
     */
    public void teamBSafety(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB();
    }

    /**
     * This method is called when the team B fieldgoal button is clicked.
     */
    public void teamBFieldGoal(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB();
    }

    /**
     * This method is called when the team B touchdown button is clicked.
     */
    public void teamBTouchdown(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB();
    }

    /**
     * This method is called when the team B extra point button is clicked.
     */
    public void teamBExtraPoint(View view) {
        scoreTeamB = scoreTeamB+ 1;
        displayForTeamB();
    }


    /**
     * This method is called when the RFSET button is clicked.
     */
    public void resetScores(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Displays the score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
}
