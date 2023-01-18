import java.util.ArrayList;
import java.util.Scanner;

public class SearchRunTime {
    static void SearchTime(ArrayList<Movie> movie) {
        int a,b,k=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Runtime Range ");
       // System.out.print("Enter initial point :");
        a = in.nextInt();
       // System.out.println("");
        //System.out.print("Enter Final point :");
        b=in.nextInt();
        int x = 0;
        for (Movie m : movie) {
            int j = m.RunningTime;
            if (j>=a && j<=b) {
                PrintMovieInfo.printInfo(m);
                x++;
            }

        }
        if (x == 0) {
            System.out.println("No such movie with this range of run time");
            while(true)
            {
                System.out.println("Want to search again For this Criteria?\n1)Yes\n2)No ");
                System.out.print("Enter Choice: ");
                int n=in.nextInt();
                if(n==1)
                {
                    SearchRunTime.SearchTime(movie);
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
                SearchRunTime.SearchTime(movie);
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
}
