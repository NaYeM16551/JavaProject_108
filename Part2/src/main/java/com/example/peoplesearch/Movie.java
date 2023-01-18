package com.example.peoplesearch;

import Server.sMovie;

import java.io.Serializable;

public class Movie implements Serializable {//movie class which will determine store the attributes of movies

    //Name,ReleaseYear,Genre1,Genre2,Genre3,RunningTime,ProductionCompany,Budget,Revenue
     String name,Genre1,Genre2,Genre3,ProductionCompany;
    int ReleaseYear,RunningTime,Budget,Revenue;

    public String getName() {
        return name;
    }

    public String getGenre1() {
        return Genre1;
    }

    public String getGenre2() {
        return Genre2;
    }

    public String getGenre3() {
        return Genre3;
    }

    public String getProductionCompany() {
        return ProductionCompany;
    }

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public int getRunningTime() {
        return RunningTime;
    }

    public int getBudget() {
        return Budget;
    }

    public int getRevenue() {
        return Revenue;
    }

    public Movie(String name, int ReleaseYear, String Genre1, String Genre2, String Genre3, int RunningTime, String ProductionCompany, int Budget, int Revenue)
    {
        this.name=name;
        this.ReleaseYear=ReleaseYear;
        this.Genre1=Genre1;
        this.Genre2=Genre2;
        this.Genre3=Genre3;
        this.RunningTime=RunningTime;
        this.ProductionCompany=ProductionCompany;
        this.Budget=Budget;
        this.Revenue=Revenue;

    }
    public  Movie(sMovie m){
        name=m.name;
        ReleaseYear=m.ReleaseYear;
        Genre1=m.Genre1;
        Genre2=m.Genre2;
        Genre3=m.Genre3;

        RunningTime=m.RunningTime;
        ProductionCompany=m.ProductionCompany;
        Budget=m.Budget;
        Revenue=m.Revenue;

    }


}
