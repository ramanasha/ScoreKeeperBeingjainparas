package com.beingjainparas.beingjainparasscorekeeper;

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
    }
    /**
     ** Increase the score for Team A And B by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team A And B by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team A And B by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team A And B by 3 points.
     */
    public void addFourForTeamA(View v) {
        scoreTeamA += 4;
        displayForTeamA(scoreTeamA);
    }
    public void addFourForTeamB(View v) {
        scoreTeamB += 4;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team A And B by 3 points.
     */
    public void addSixForTeamA(View v) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }
    public void addSixForTeamB(View v) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Reset the score for Team A And B.
     */
    public void resetBothTeam(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A And B.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}