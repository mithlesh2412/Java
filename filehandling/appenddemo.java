//append - used to add two file data into single 

import java.io.FileWriter;

public class appenddemo {
    public static void main(String[] args){
        try{
            FileWriter fw= new FileWriter("sample.txt",true);
            fw.write("\n new data added");
            fw.close();
            System.out.println("data appended");

        }
        catch(IOException e){
            System.out.println("exception occured");
            
        }
    }
}
