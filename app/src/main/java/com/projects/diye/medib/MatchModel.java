package com.projects.diye.medib;

import android.graphics.drawable.Drawable;

public class MatchModel {
    String league;
    String timeandDay;
    String homeTeam;
    String awayTeam;
    Drawable homeTeamEmblem;
    Drawable awayTeamEmblem;
    double homeTeamOdd;
    double drawOdd;
    double awayTeamOdd;

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getTimeandDay() {
        return timeandDay;
    }

    public void setTimeandDay(String timeandDay) {
        this.timeandDay = timeandDay;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Drawable getHomeTeamEmblem() {
        return homeTeamEmblem;
    }

    public void setHomeTeamEmblem(Drawable homeTeamEmblem) {
        this.homeTeamEmblem = homeTeamEmblem;
    }

    public double getDrawOdd() { return drawOdd;}

    public void setDrawOdd(double drawOdd) { this.drawOdd = drawOdd;}

    public Drawable getAwayTeamEmblem() {
        return awayTeamEmblem;
    }

    public void setAwayTeamEmblem(Drawable awayTeamEmblem) {
        this.awayTeamEmblem = awayTeamEmblem;
    }

    public double getHomeTeamOdd() {
        return homeTeamOdd;
    }

    public void setHomeTeamOdd(double homeTeamOdd) {
        this.homeTeamOdd = homeTeamOdd;
    }

    public double getAwayTeamOdd() {
        return awayTeamOdd;
    }

    public void setAwayTeamOdd(double awayTeamOdd) {
        this.awayTeamOdd = awayTeamOdd;
    }
}

