package com.example.peoplesearch;

import Server.sMovie;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client {
   public static List<Movie> ClientMovielist=new ArrayList<>();
   //public static String NewMovie="";
    public static int i=1;
    public static void client(String name) throws IOException, ClassNotFoundException {
        System.out.println("Client started..");
        Socket socket = new Socket("127.0.0.1", 22222);
        System.out.println("Client Connected..");
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        System.out.println(name);
        boolean result =name.matches(".*[0-9].*");
        if (result)
        {
            oos.writeObject(name);
        }
        else
        {
            System.out.println("in array list");
            oos.writeObject(name);
            Object data=ois.readObject();
            //  ClientMovielist=(ArrayList<sMovie>) data;
            List<sMovie>d=(List<sMovie>) data;
            for(sMovie m:d){
                ClientMovielist.add( new Movie(m));
            }
            System.out.println(ClientMovielist.get(1).Budget);


        }

        //System.out.println(name);
        //System.out.println(NewMovie+"fuck");
        //oos.writeObject(name);




    }

}
