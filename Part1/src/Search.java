import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    static void search(ArrayList<Movie> m)
    {
       /* FileHandling f=new FileHandling();
        f.handle();//Creating objects from file
        ArrayList<Movie> m=f.ListOfMovie();//returning whole movie object*/
        int n;
        Scanner in=new Scanner(System.in);
        while (true)
        {
            /*1) By Movie Title
             2) By Release Year
             3) By Genre
             4) By Production Company
             5) By Running Time
             6) Top 10 Movies
             7) Back to Main Menu*/
            System.out.println("1)By Movie Title");
            System.out.println("2) By Release Year ");
            System.out.println("3) By Genre ");
            System.out.println("4) By Production Company");
            System.out.println("5) By Running Time ");
            System.out.println("6) Top 10 Movies ");
            System.out.println("7) Back to Main Menu");
            System.out.print("Enter option :");
            n=in.nextInt();
            if(n>=1 && n<=7)
                break;
                //return n;
            else
                System.out.println("Invalid search choice! Please make a valid choice.\n\n");

        }
        if(n==1)
        {
            SearchMovieTitle.SearchTitle(m);//invoking serach title method
        }
        else if (n==2)
        {
            SearchReleaseYear.SearchYear(m);//invoking search yera method
        }
        else if(n==3)
        {
            SearchGenre.SearcGenre(m);//invoking search gonre method
        }
        else if(n==4)
        {
            SearchProductionCompany.SearchProductCompany(m);
        }
        else if(n==5)
        {
            SearchRunTime.SearchTime(m);
        }
        else if(n==6)
        {
            Top10Movies.Top_10(m);
        }
        else //for n==7
            MainClass.main(null);


    }
}
