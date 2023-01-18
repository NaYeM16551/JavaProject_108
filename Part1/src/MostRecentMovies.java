import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MostRecentMovies {
    static void MostRecent(ArrayList<Movie> movie)
    {
        ArrayList<Movie> ProductionCompanyMovie=new ArrayList<>();
        String Str2;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Production Company name : ");
        Str2=in.nextLine();
        int x=0;
        for(Movie m:movie)
        {
            String str1=m.ProductionCompany;
            if(str1.equalsIgnoreCase(Str2))
            {
                ProductionCompanyMovie.add(m);

                x++;
            }

        }
        if(x==0)
        {
            System.out.println("No such Production Company with this name");//need to do something


            while(true)
            {
                System.out.println("Want to search again For this Criteria?\n1)Yes\n2)No ");
                System.out.print("Enter Choice: ");
                int n=in.nextInt();
                if(n==1)
                {
                    MostRecentMovies.MostRecent(movie);
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


        //sorting based of release year
        else
        {
            Collections.sort(ProductionCompanyMovie, new Comparator<Movie>() {
                @Override
                public int compare(Movie o1, Movie o2) {
                    return Integer.valueOf(o2.ReleaseYear).compareTo(o1.ReleaseYear);//syntax to sort,collection class
                }
            });
            int c=ProductionCompanyMovie.get(0).ReleaseYear;
            System.out.println(c);
            for(Movie m:ProductionCompanyMovie)
            {
                if(m.ReleaseYear==c)
                    PrintMovieInfo.printInfo(m);


            }

        }


    }
}
