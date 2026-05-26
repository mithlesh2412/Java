// Parameterized Constructor
// A parameterized constructor accepts values during object creation

class ParameterizedDemo
{
    String name;
    int age;
    int salary;

    ParameterizedDemo(String n, int a, int s)
    {
        name = n;
        age = a;
        salary = s;
    }

    void display()
    {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
    }

    public static void main(String[] args)
    {
        ParameterizedDemo p =
            new ParameterizedDemo("Sam", 19, 2400);

        p.display();
    }
}