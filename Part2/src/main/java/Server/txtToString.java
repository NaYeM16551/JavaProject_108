package Server;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class txtToString {
    public static String txt(String FileName) throws IOException {
        InputStream input = new FileInputStream(FileName);
        byte[] array = new byte[input.available()];

        // Read byte from the input stream
        input.read(array);
        System.out.println("Data read from the file: ");

        // Convert byte array into string
        String data = new String(array);
        input.close();
        return data;
    }
}
