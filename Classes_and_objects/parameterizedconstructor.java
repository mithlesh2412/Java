// parameterized constructor has parameters passed in 

class employee{
    String name;
    int empid;
    float salary;


    // parameterized constructor
    employee(String n,int e,float s){
       name = n;
        empid=e;
        salary =s;

    }

    void display(){
        System.out.println("name is:"+ " "+name);
        System.out.println("empid is"+ " "+empid);
        System.out.println("salary is:"+ " "+salary);

    }
}

public class parameterizedconstructor{
    public static void main(String[] args){
        employee e1 = new employee("abc",123,12000);
        employee e2 = new employee("xyz",321,1000);

        e1.display();
        e2.display();



    }
}