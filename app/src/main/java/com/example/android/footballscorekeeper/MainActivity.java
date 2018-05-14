package com.example.android.footballscorekeeper;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int resetButtonPressCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Score Reset button onClick handler
     * if first click, increment click count and invite a second click to confirm action.
     * if second click, reset click count and scores
     */
    public void resetScores_onClick(View view) {
        if (resetButtonPressCount == 0) {
            resetButtonPressCount++;
            Snackbar.make(view, R.string.reset_twice_prompt,
                    Snackbar.LENGTH_LONG).
                    setAction("Action", null).show();
        } else {
            scoreTeamA = 0;
            scoreTeamB = 0;
            // when a score is displayed, the Reset click count is set to 0 automatically
            displayForTeamA();
            displayForTeamB();
        }
    }

    /**
     * This method is called when the team A safety button is clicked.
     */
    public void teamASafety(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA();
    }

    /**
     * This method is called when the team A field goal button is clicked.
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
        scoreTeamA = scoreTeamA + 1;
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
     * This method is called when the team B field goal button is clicked.
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
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB();
    }

    /**
     * Displays the score for Team A.
     */
    public void displayForTeamA() {
        resetButtonPressCount = 0;
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the score for Team B.
     */
    public void displayForTeamB() {
        resetButtonPressCount = 0;
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
}
