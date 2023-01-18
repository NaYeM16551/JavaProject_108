package Server;

import java.util.ArrayList;

public class ProductionCompanyMovie {
    private ArrayList<sMovie> ProductionCompanyMovie = new ArrayList<>();

   public   ArrayList<sMovie> ClientMovieList(String name, ArrayList<sMovie> movie)
    {

        for (sMovie m : movie) {
            String str1 =m.ProductionCompany;
            if (str1.equalsIgnoreCase(name)) {
                ProductionCompanyMovie.add(m);
            }

        }
        return ProductionCompanyMovie;







    }
}
