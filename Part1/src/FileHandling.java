import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;



public class FileHandling {
    private ArrayList<Movie>movie;
    void handle()
    {
        try{//In this try block movie object is created using split method
           // File file=new File("C:\\Users\\M. M. NAYEM\\Project\\movies.txt");
             String INPUT_FILE_NAME = "movies.txt";
            BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
           // Scanner s=new Scanner(file);//a way to read from file
            movie=new ArrayList<>();
            String name=null, Genre1=null,Genre2=null,Genre3=null,ProCompany=null;
            int Relyear=0,RunTime=0,Budget=0,revenue=0;
           // while (s.hasNextLine())
          //  {
               // String str=s.nextLine();
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                //System.out.println(line);
               // String[] arrOfStr = str.split(",");//spliting mechanism
                String[] arrOfStr = line.split(",");//spliting mechanism
                 name=arrOfStr[0];
                 Relyear=Integer.parseInt(arrOfStr[1]);
                 Genre1=arrOfStr[2];
                if(isNumeric(arrOfStr[3]))
                {
                     Genre2="";
                     Genre3="";
                     RunTime=Integer.parseInt(arrOfStr[3]);;
                     ProCompany=arrOfStr[4];
                     Budget=Integer.parseInt(arrOfStr[5]);
                     revenue=Integer.parseInt(arrOfStr[6]);
                }
                else
                {
                    if(isNumeric(arrOfStr[4]))
                    {
                         Genre2=arrOfStr[3];
                         Genre3="";
                         RunTime=Integer.parseInt(arrOfStr[4]);
                         ProCompany=arrOfStr[5];
                         Budget=Integer.parseInt(arrOfStr[6]);
                         revenue=Integer.parseInt(arrOfStr[7]);
                    }
                    else
                    {
                         Genre2=arrOfStr[3];
                         Genre3=arrOfStr[4];
                         RunTime=Integer.parseInt(arrOfStr[5]);
                         ProCompany=arrOfStr[6];
                         Budget=Integer.parseInt(arrOfStr[7]);
                         revenue=Integer.parseInt(arrOfStr[8]);
                    }

                }
                Movie m=new Movie(name,Relyear,Genre1,Genre2,Genre3,RunTime,ProCompany,Budget,revenue);
                movie.add(m);

            }
            //System.out.println(movie.get(2).Genre3);



        }catch(Exception e)
        {
            System.out.println(e);
        }


    }

    private boolean isNumeric(String s) {//Function to check whether a string is numeric or not
        return s != null && s.matches("[0-9.]+");
    }
    ArrayList<Movie> ListOfMovie()
    {
        return movie;
    }


}
