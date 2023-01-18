import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        FileHandling f=new FileHandling();//in this class text file is loaded to an array list creating movie object
        f.handle();
        ArrayList<Movie> m=f.ListOfMovie();//List of movie returns the total arrayList created from text file(movies.txt)
       int p= MainMenu.main();//here code main menu is written
       if(p==1)

    {

          Search.search(m);

       }
       else if(p==2)
       {
           ProDuctionCompanyBais.CompanySearch(m);
       }
       else if(p==3)
       {
           AddMovie.AddMovie(m);
       }
       if(p==4)
           return;


    }
}
