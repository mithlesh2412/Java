class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Student(String n) {
        name = n;
        age = 18;
    }

    // Constructor with two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class constructoroverloading {

    public static void main(String[] args) {

     Student s1 = new Student();          // default
    Student s2 = new Student("Mithlesh"); // oneparameter
     Student s3 = new Student("Rahul", 20);// two parameters

        s1.display();
        s2.display();
        s3.display();
    }
}