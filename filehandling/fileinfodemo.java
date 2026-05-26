import java.io.*;
public class fileinfodemo {
    public static void main(String[] args){
        File f = new File("sample.txt");

        if(f.exists()){
            System.out.println("filename: "+f.getName());
            System.out.println("filesize: "+f.length());
        }
    }
}
