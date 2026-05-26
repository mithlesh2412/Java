//fileread - used to read characters data from the file.

import java.io.FileReader;
import java.io.IOException;

public class filereaddemo {
    public static void main(String[] args){
        try{
            FileReader fr =new FileReader("sample.txt");
            int i;
            while((i = fr.read()) != -1){
                System.out.println((char)i);
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println("Exception occured");
        }
    }
}
