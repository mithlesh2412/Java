//constructor overloading - a constructor overloding is a condition when multiple constructor with different parameters are passed.

public class studentdemo {
    String name;
    int age;

    studentdemo(){
      
    }

    studentdemo(String n,int a){
         name =n;
         age =a;

    }
    void show(){
        System.out.println("name is: "+name);
        System.out.println("age is:"+age);

    }

    public static void main(String[] args){
        studentdemo s1 = new studentdemo();
        studentdemo s2 = new studentdemo("sam",20);

        s1.show();
        s2.show();

    }
}
