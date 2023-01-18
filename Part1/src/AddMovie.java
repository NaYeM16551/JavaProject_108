import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AddMovie {
    static void AddMovie(ArrayList<Movie> movie)
    {
        Scanner in=new Scanner(System.in);
        String name,Genre1,Genre2,Genre3,ProductionCompany;
        int n,ReleaseYear,RunningTime,Budget,Revenue;
        System.out.print("Enter Movie Name: ");
        name=in.nextLine();
        System.out.print("Enter release year: ");
        ReleaseYear=in.nextInt();
        System.out.println("How many Genres the movie has?\n1)One\n2)Two\n3)Three");
        System.out.print("Enter choice: ");
        n= in.nextInt();
        in.nextLine();

        System.out.println("");
        if(n==1)
        {
            System.out.print("Enter Genre : ");
            Genre1=in.nextLine();
            Genre2="";
            Genre3="";
        }
        else if(n==2)
        {
            System.out.print("Enter Genre1 : ");
            Genre1=in.nextLine();
            System.out.print("Enter Genre2 : ");
            Genre2=in.nextLine();
            Genre3="";
        }
        else
        {
            System.out.print("Enter Genre1 : ");
            Genre1= in.nextLine();
            System.out.print("Enter Genre2 : ");
            Genre2=in.nextLine();
            System.out.print("Enter Genre3 : ");
            Genre3=in.nextLine();
        }
        System.out.print("Enter Running Time: ");
        RunningTime=in.nextInt();
        in.nextLine();
        System.out.print("Enter production Company: ");
        ProductionCompany=in.nextLine();
        System.out.print("Enter Budget: ");
        Budget=in.nextInt();
        System.out.print("Enter Revenue:" );
        Revenue=in.nextInt();
        Movie m=new Movie(name,ReleaseYear,Genre1,Genre2,Genre3,RunningTime,ProductionCompany,Budget,Revenue);
        movie.add(m);
        try {
             String output;
            /*String output=m.name+","+m.ReleaseYear+","+m.Genre1+
                    ","+m.Genre2+","+m.Genre3+","+m.RunningTime+","+m.ProductionCompany+","+ m.Budget+","+m.Revenue;*/
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
           /* OutputStream outStream = new FileOutputStream("movies.txt",true);
            outStream.write("\n".getBytes());
            outStream.write(output.getBytes());
            outStream.close();*/
            File log = new File("movies.txt");
            PrintWriter out = new PrintWriter(new FileWriter(log, true));
            out.append(output+ "\n");
            out.close();



        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        if(movie.contains(m))
            System.out.println("Successfully Added ");
        else
            System.out.println("Addition Failed");
    }
}
