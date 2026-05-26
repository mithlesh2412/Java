// a class is a blueprint for creating objects and object is an instance of class

class student{
    String name;
    int age;
    int year;

    student(String n,int a,int y){
        this.name = n;
       this.age = a;
        this.year = y;
    }

    void display(){
        System.out.println("name is:"+name);
        System.out.println("age is:"+age);
        System.out.println("year is:"+year);

    }

    public static void main(String[] args){
        student s1 = new student("Sam",19,3);
        s1.display();

    }
}