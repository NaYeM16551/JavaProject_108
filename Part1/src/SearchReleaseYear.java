import java.util.ArrayList;
import java.util.Scanner;

public class SearchReleaseYear {
    static void SearchYear(ArrayList<Movie> movie) {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year : ");
        i = in.nextInt();
        int x = 0,k=0;
        for (Movie m : movie) {
            int j = m.ReleaseYear;
            if (j == i) {
                PrintMovieInfo.printInfo(m);
                x++;
            }

        }
        if (x == 0) {
            System.out.println("No such movie with this release year");
            while(true)
            {
                System.out.println("Want to search again For this Criteria?\n1)Yes\n2)No ");
                System.out.print("Enter Choice: ");
                int n=in.nextInt();
                if(n==1)
                {
                    SearchReleaseYear.SearchYear(movie);
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
                SearchReleaseYear.SearchYear(movie);
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
