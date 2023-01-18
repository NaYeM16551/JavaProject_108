package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
   public static ArrayList<sMovie> movie=new ArrayList<>();
  // static ArrayList<sMovie>AllMovie=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        try {

            InputStream input = new FileInputStream("movies.txt");
            byte[] array = new byte[input.available()];

            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            input.close();

            FileHandling file = new FileHandling();

            movie= file.handle(data);
            System.out.println(movie.size());
           // show(movie);
            // oos.writeObject(data);

        } catch (Exception e) {
            e.getStackTrace();
        }
        ServerSocket serverSocket = new ServerSocket(22222);
        System.out.println("Server Started..");
        int i=1;

        while (true) {
            //System.out.println(i++);
            try{

            Socket socket = serverSocket.accept();
            System.out.println("Client connected..");

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                Object data= ois.readObject();
                String company=(String) data;
                boolean result =company.matches(".*[0-9].*");
                System.out.println(result);

                if(result)
                {
                   // System.out.println("file writting");

                    File log = new File("movies.txt");
                    PrintWriter out = new PrintWriter(new FileWriter(log, true));
                    out.append(company+ "\n");
                    out.close();





                }
                else
                {

                    ArrayList<sMovie> ProductionMovie=new ArrayList<>();
                    ProductionCompanyMovie p=new ProductionCompanyMovie();
                    ProductionMovie= p.ClientMovieList(company, movie);
                    // show(ProductionMovie);
                    oos.writeObject(ProductionMovie);
                    /*System.out.println("written");
                    System.out.println(ProductionMovie.get(0).RunningTime);*/

                }


















                   /* Object addMovie=ois.readObject();
                    String output=(String) addMovie;
                    File log = new File("test.txt");
                    PrintWriter out = new PrintWriter(new FileWriter(log, true));
                    out.append(output+ "\n");
                    out.close();*/



            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }



            }
        }
        public static ArrayList<sMovie> writting(String movieName,String CompanyName,String identifier) throws IOException {
            //change the arrayLisyt
            System.out.println("In server writting");
            String data= txtToString.txt("movies.txt");
            FileHandling file = new FileHandling();
            movie= file.handle(data);
            if(identifier.equalsIgnoreCase("tranfer"))
            {
                for(sMovie m:movie)
                {
                    String str1=m.getName();
                    // System.out.println(str1);
                    if(str1.equalsIgnoreCase(movieName))
                    {
                        m.ProductionCompany=CompanyName;
                        // System.out.println(m.getProductionCompany());
                        break;
                    }

                }

                //then overwrite the file
                File log = new File("movies.txt");
                PrintWriter out = new PrintWriter(new FileWriter(log, false));
                out.append("");
                out.close();
                ArrayListToFile.file(movie);
                ArrayList<sMovie>CompanyMovie=new ArrayList<>();
                CompanyMovie=Refresh(CompanyName, movie);
                return CompanyMovie;

            }


           else
            {
                ArrayList<sMovie>ProductionCompanyMovie=new ArrayList<>();
                ProductionCompanyMovie=Refresh(CompanyName, movie);
               // System.out.println(ProductionCompanyMovie.get(0).name);
                return ProductionCompanyMovie;


            }






        }
        public static ArrayList<sMovie> Refresh(String CompanyName,ArrayList<sMovie>movie)
        {
            System.out.println("In server refresh"+" "+Server.movie.size());
            //create specific productioncompany movie
            ArrayList<sMovie> ProductionMovie=new ArrayList<>();
            ProductionCompanyMovie p=new ProductionCompanyMovie();
            ProductionMovie= p.ClientMovieList(CompanyName, movie);
            //return that arraylist
            return ProductionMovie;


        }
        public static int LoginCheck(String CompanyName) throws IOException {
            int x=0;
            String data= txtToString.txt("movies.txt");
            FileHandling file = new FileHandling();
            movie= file.handle(data);
            for(sMovie m:movie)
            {
                String str1=m.ProductionCompany;
                if(str1.equalsIgnoreCase(CompanyName))
                {

                    x++;
                }

            }
            return x;



        }

    }
