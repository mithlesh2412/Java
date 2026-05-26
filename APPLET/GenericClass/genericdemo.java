//generic class with security and typecasting of data -type of data we need to store (here string type)

import java.util.ArrayList;

public class genericdemo {
    public  static void main(String[] args){
        ArrayList<String> list =
            new ArrayList<String>();
        list.add("Java");

        System.out.println(list.get(0));

    }
}
