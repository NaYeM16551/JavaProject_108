import java.util.ArrayList;
import java.util.Scanner;

public class SearchProductionCompany {
    static void SearchProductCompany(ArrayList<Movie> movie)
    {
        String Str2;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Production Company name : ");
        Str2=in.nextLine();
        int x=0,k=0;
        for(Movie m:movie)
        {
            String str1=m.ProductionCompany;
            if(str1.equalsIgnoreCase(Str2))
            {
                PrintMovieInfo.printInfo(m);
                x++;
            }

        }
        if(x==0)
        {
            System.out.println("“No such movie with this production company");
            while(true)
            {
                System.out.println("Want to search again For this Criteria?\n1)Yes\n2)No ");
                System.out.print("Enter Choice: ");
                int n=in.nextInt();
                if(n==1)
                {
                    SearchProductionCompany.SearchProductCompany(movie);
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
                SearchProductionCompany.SearchProductCompany(movie);
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
