// a generic class is a template class which works for different types of datatypes or methods safely.

// a generic class does not require typecasting 
// a generic class provides - typesafety ,compile time checking ,no need for typecasting

// program without generic class

import java.util.*;
class introdemo{
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(10);

        String s= (String)list.get(0);
        System.out.println(s);

        
    }
}