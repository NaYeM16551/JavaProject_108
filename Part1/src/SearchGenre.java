import java.util.ArrayList;
import java.util.Scanner;

public class SearchGenre {
    static void SearcGenre(ArrayList<Movie> movie)
    {
        String Str2;
        int k=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Genre name : ");
        Str2=in.nextLine();
        int x=0;
        for(Movie m:movie)
        {
            String str1=m.Genre1;
            String str3=m.Genre2;
            String str4=m.Genre3;
            if(str1.equalsIgnoreCase(Str2) ||str3.equalsIgnoreCase(Str2)|| str4.equalsIgnoreCase(Str2))
            {
               PrintMovieInfo.printInfo(m);
                x++;
            }

        }
        if(x==0)
        {
            System.out.println("No such movie with this genre");
            while(true)
            {
                System.out.println("Want to search again For this Criteria?\n1)Yes\n2)No ");
                System.out.print("Enter Choice: ");
                int n=in.nextInt();
                if(n==1)
                {
                    SearchGenre.SearcGenre(movie);
                    break;
                }
                else if(n==2)
                {
                   k= MainMenu.main();
                    break;
                }
                else
                    System.out.println("Invalid input");

            }
        }
        while(true)
        {
            if(k==4)
                break;
            System.out.println("Want to search again For this Criteria?\n1)Yes\n2)No ");
            System.out.print("Enter Choice: ");
            int n=in.nextInt();
            if(n==1)
            {
                SearchMovieTitle.SearchTitle(movie);
                break;
            }
            else if(n==2)
            {
                MainMenu.main();
                break;
            }
            else
                System.out.println("Invalid input");

        }



    }
}
