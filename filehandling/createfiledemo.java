// filehandling - it is used for perfroming operations on file such read,write,append,delete
import java.io.*;


public class createfiledemo {
    public static void main(String[] args){
        try{
            File f=new File("sample.txt");
            if(f.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("exception occured");
        }
    }
    
}
