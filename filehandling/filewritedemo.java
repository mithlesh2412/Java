//filewrite - used to write data into the file.

import java.io.FileWriter;
import java.io.IOException;

public class filewritedemo {
    public static void main(String[] args){

        try{
            FileWriter fw =new FileWriter("sample.txt");
            fw.write("Welcome to file handling");
            fw.close();
            System.out.println("data written successfully");
        }
        catch(IOException  e){
            System.out.println("Exception occured");
        }
    }
}
