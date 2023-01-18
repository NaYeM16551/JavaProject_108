import java.util.ArrayList;
import java.util.Scanner;

public class ProDuctionCompanyBais {
    static void CompanySearch(ArrayList<Movie> m)
    {
        int n;
        Scanner in=new Scanner(System.in);
        while (true)
        {

            System.out.println("1) Most Recent Movies ");
            System.out.println("2) Movies with the Maximum Revenue");
            System.out.println("3) Total Profit");
            System.out.println("4) List of Production Companies and the Count of their Produced Movies ");
            System.out.println("5) Back to Main Men");

            n=in.nextInt();
            if(n>=1 && n<=5)
                break;
                //return n;
            else
                System.out.println("Invalid search choice! Please make a valid choice.\n\n");

        }
        if(n==1)
        {
            MostRecentMovies.MostRecent(m);//invoking serach title method
        }
        else if(n==2)
            MaximumRevenue.MaximumRevenue(m);
        else if(n==3)
            TotalProfit.TotalProfit(m);
        else if(n==4)
            ProductionCompany_TheirMoviesCount.MovieCount(m);
        else
           MainMenu.main();
    }

}
