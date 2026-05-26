// encapsulation- concept of data hiding ,it is used for hidding data memebers and methods inside a single unit called class. - example - just like a capsule. // setter and getters are used .
class student{
     private String name;
    private int age;
public void setname(String n){
    name =n;
}

public void setage(int a){
       age =a;
}

public String getname(){
    return name;
}
public int getage(){
    return age;
}

}

public class encapsulationdemo {
    public static void main(String[] args){
        student s= new student();
        s.setname("khushi");
        s.setage(20);

        System.out.println("name is:"+s.getname());
        System.out.println("age is:"+s.getage());


    }
}
