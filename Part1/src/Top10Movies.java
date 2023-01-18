import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Top10Movies {
    static void Top_10(ArrayList<Movie> movie)
    {
       /* for(int i=0;i< movie.size()-1;++i)
        {
            int x=movie.get(i+1).Revenue-movie.get(i+1).Budget;
            int y=movie.get(i).Revenue-movie.get(i).Budget;
            if(x>y)
            {
                Collections.swap(movie, i,i+1);
            }
        }*/
        //desending sorting for maximum revenue -budget
        Collections.sort(movie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                /*int x=o2.Revenue-o1.Budget;
                int y=o1.Revenue- o1.Budget;*/
                return Integer.valueOf(o2.Revenue-o2.Budget).compareTo(o1.Revenue- o1.Budget);//syntax to sort,collection class
            }
        });


           int x=0;
           for(Movie m:movie)
            {
                PrintMovieInfo.printInfo(m);
                x++;
                 if(x==10)
                    break;
            }

        }
    }

