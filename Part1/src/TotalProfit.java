import java.util.ArrayList;
import java.util.Scanner;

public class TotalProfit {
    static void TotalProfit(ArrayList<Movie> movie) {
        {
            ArrayList<Movie> ProductionCompanyMovie = new ArrayList<>();
            String Str2;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Production Company name : ");
            Str2 = in.nextLine();
            int x = 0,k=0;
            for (Movie m : movie) {
                String str1 = m.ProductionCompany;
                if (str1.equalsIgnoreCase(Str2)) {
                    ProductionCompanyMovie.add(m);

                    x++;
                }

            }
            if (x == 0) {
                System.out.println("No such Production Company with this name");//need to do something
                while(true)
                {
                    System.out.println("Want to search again For this Criteria?\n1)Yes\n2)No ");
                    System.out.print("Enter Choice: ");
                    int n=in.nextInt();
                    if(n==1)
                    {
                        TotalProfit.TotalProfit(movie);
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
            if(k!=4)
            {
                long  Profit = 0;
                for (Movie m : ProductionCompanyMovie) {
                    Profit +=(m.Revenue - m.Budget);
                }
                System.out.println("Total Profit of "+Str2+" Production company is "+Profit);
            }


        }
    }
}
