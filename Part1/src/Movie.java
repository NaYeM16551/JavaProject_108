import java.io.Serializable;

public class Movie implements Serializable {//movie class which will determine store the attributes of movies

    //Name,ReleaseYear,Genre1,Genre2,Genre3,RunningTime,ProductionCompany,Budget,Revenue
    String name,Genre1,Genre2,Genre3,ProductionCompany;
    int ReleaseYear,RunningTime,Budget,Revenue;
    Movie(String name,int ReleaseYear,String Genre1,String Genre2,String Genre3,int RunningTime,String ProductionCompany,int Budget,int Revenue)
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
}
