//constructors- a constructor is a speacial member function which is used to iniatialise object 

/*  a constructor contains -same name as class name,
 a constructor has no returntype
 called automatically when object is created 

*/

public class test {
    String name;
    int age;
    int testclass;

    test(){
        name ="aman";
        age=21;
        testclass=12;


    }

    void display(){
        System.out.println("name is: "+name);
        System.out.println("age is: "+age);
        System.out.println("class is: "+testclass);
    }

    public static void main(String[] args){
        test t1 =new test();
       t1.display();

    }
}
