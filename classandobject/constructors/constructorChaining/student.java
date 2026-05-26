// Constructor Chaining
// Constructor chaining is the process of calling
// one constructor from another constructor
// of the same class using this().

public class student
{
    String name;
    int age;
    String course;

    // Default constructor
    student()
    {
        this("Sam");

        System.out.println("Default constructor called successfully");
    }

    // One parameter constructor
    student(String name)
    {
        this(name, 20);

        System.out.println("One parameter constructor");
    }

    // Two parameter constructor
    student(String name, int age)
    {
        this(name, age, "B.Tech");

        System.out.println("Two parameter constructor called");
    }

    // Three parameter constructor
    student(String name, int age, String course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display()
    {
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Course is : " + course);
    }

    public static void main(String[] args)
    {
        student s = new student();

        s.display();
    }
}