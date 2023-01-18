package Server;

import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    private ArrayList<sMovie> movie=new ArrayList<>();

    ArrayList<sMovie> handle(String filedata) {
        Scanner sc = new Scanner(filedata);
        String name = null, Genre1 = null, Genre2 = null, Genre3 = null, ProCompany = null;
        int Relyear = 0, RunTime = 0, Budget = 0, revenue = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arrOfStr = line.split(",");//spliting mechanism
            name = arrOfStr[0];
            Relyear = Integer.parseInt(arrOfStr[1]);
            Genre1 = arrOfStr[2];
            if (isNumeric(arrOfStr[3])) {
                Genre2 = "";
                Genre3 = "";
                RunTime = Integer.parseInt(arrOfStr[3]);
                ;
                ProCompany = arrOfStr[4];
                Budget = Integer.parseInt(arrOfStr[5]);
                revenue = Integer.parseInt(arrOfStr[6]);
            } else {
                if (isNumeric(arrOfStr[4])) {
                    Genre2 = arrOfStr[3];
                    Genre3 = "";
                    RunTime = Integer.parseInt(arrOfStr[4]);
                    ProCompany = arrOfStr[5];
                    Budget = Integer.parseInt(arrOfStr[6]);
                    revenue = Integer.parseInt(arrOfStr[7]);
                } else {
                    Genre2 = arrOfStr[3];
                    Genre3 = arrOfStr[4];
                    RunTime = Integer.parseInt(arrOfStr[5]);
                    ProCompany = arrOfStr[6];
                    Budget = Integer.parseInt(arrOfStr[7]);
                    revenue = Integer.parseInt(arrOfStr[8]);
                }

            }
            sMovie m = new sMovie(name, Relyear, Genre1, Genre2, Genre3, RunTime, ProCompany, Budget, revenue);
            movie.add(m);
        }
        //show(movie);
        return movie;


    }
   /* void show(ArrayList<Movie>movie)
    {
        for(Movie x:movie)
            System.out.println(x.ProductionCompany);
    }*/

    boolean isNumeric(String s) {//Function to check whether a string is numeric or not
        return s != null && s.matches("[0-9.]+");
    }
}
