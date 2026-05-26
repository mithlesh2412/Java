import java.io.*;

class DeleteDemo
{
    public static void main(String[] args)
    {
        File f = new File("sample.txt");

        if(f.delete())
        {
            System.out.println("File deleted");
        }
        else
        {
            System.out.println("File not found");
        }
    }
}