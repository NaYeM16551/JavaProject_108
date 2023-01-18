package Server;

import com.example.peoplesearch.FirstView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArrayListToFile {
    public static void file(ArrayList<sMovie>movie) throws IOException {
      /* File logg = new File("movies.txt");
                PrintWriter outt = new PrintWriter(new FileWriter(logg, false));
                outt.append("");
                outt.close();*/
        File log = new File("movies.txt");
        PrintWriter out = new PrintWriter(new FileWriter(log, true));
        for (sMovie m:movie)
        {

            String output;

            if(m.Genre2=="" && m.Genre3=="")
            {
                output=m.name+","+m.ReleaseYear+","+m.Genre1+
                        ","+m.RunningTime+","+m.ProductionCompany+","+ m.Budget+","+m.Revenue;

            }
            else if(m.Genre3=="") //&& m.Genre2!=null)
            {
                output=m.name+","+m.ReleaseYear+","+m.Genre1+","+m.Genre2+
                        ","+m.RunningTime+","+m.ProductionCompany+","+ m.Budget+","+m.Revenue;
            }
            else {
                output=m.name+","+m.ReleaseYear+","+m.Genre1+
                        ","+m.Genre2+","+m.Genre3+","+m.RunningTime+","+m.ProductionCompany+","+ m.Budget+","+m.Revenue;

            }
            out.append(output+ "\n");


        }
        out.close();
        return;





    }
}
