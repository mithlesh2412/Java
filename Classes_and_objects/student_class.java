 //A class in Java is a blueprint (template) used to create objects. It defines the properties (variables) and behaviors (methods/functions) that the objects will have.
 
 class student{
    String name;
    int rollno;
    int age;

 }
 
 
 public class student_class{
    public static void main(String[] args){

        student s1 = new student();
        s1.name ="xyz";
        s1.rollno =14;
        s1.age =19;

        System.out.println("name is:"+s1.name);
        System.out.println("roll no is :"+s1.rollno);
        System.out.println("age is:"+s1.age);







    }
 }