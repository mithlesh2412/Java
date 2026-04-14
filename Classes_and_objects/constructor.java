//A constructor in Java is a special method used to initialize an object when it is created.

class student{
    String name;
    int age;
    String course;

    //constructor 
    // default constructor -- no paramters are passed

    student(){
        name ="xyz";
        age =19;
        course ="CSE";


    }
    void Show(){
        System.out.println("name is:"+name);
        System.out.println("age is:"+age);
        System.out.println("course is:"+course);


    }

}

public class constructor{
    public static void main(String[] args){
        student obj1 = new student();
        obj1.Show();

    }
}