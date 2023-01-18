package com.example.peoplesearch;

public class PrintMovieInfo {
    static void printInfo(Movie m)
    {
        /*System.out.println(m.Genre2 +m.Genre3);
        System.out.println("\n\r");*/
        if(m.Genre2=="" && m.Genre3=="")
        {
            /*Title: Titanic
Year of Release: 1997
Genre: Drama, Romance, Thriller
Running Time(in minutes): 194
Production Company: Paramount Pictures
Budget: 200000000
Revenue: 1845034188*/
            System.out.print("Title: "+m.name+"\n"+"Year of Release: "+m.ReleaseYear+"\n"+"Genre: "+m.Genre1);
            System.out.println("\nRunning Time(in minutes): "+m.RunningTime+"\nProduction Company: "+m.ProductionCompany+ "\nBudget: "+ m.Budget+"\nRevenue :"+m.Revenue);
            System.out.println("\n");

        }
          else if(m.Genre3=="") //&& m.Genre2!=null)
        {

            System.out.print("Title: "+m.name+"\n"+"Year of Release: "+m.ReleaseYear+"\n"+"Genre: "+m.Genre1+","+m.Genre2);
            System.out.println("\nRunning Time(in minutes): "+m.RunningTime+"\nProduction Company: "+m.ProductionCompany+ "\nBudget: "+ m.Budget+"\nRevenue :"+m.Revenue);
            System.out.println("\n");
        }
          else {
            System.out.print("Title: "+m.name+"\n"+"Year of Release: "+m.ReleaseYear+"\n"+"Genre: "+m.Genre1+","+m.Genre2+","+m.Genre3);
            System.out.println("\nRunning Time(in minutes): "+m.RunningTime+"\nProduction Company: "+m.ProductionCompany+ "\nBudget: "+ m.Budget+"\nRevenue :"+m.Revenue);
            System.out.println("\n");
        }
         /*System.out.print(m.name+","+m.ReleaseYear+","+m.Genre1+","+m.Genre2+","+m.Genre3);
              System.out.println(","+m.RunningTime+","+m.ProductionCompany+ ","+ m.Budget+","+m.Revenue);*/



    }
}
