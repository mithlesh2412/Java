   
// copy constructor copies the object 

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

    //copy constructor
    employee(employee e){
        name =e.name;
        empid =e.empid;
        salary =e.salary;
    }

    void display(){
        System.out.println("name is:"+ " "+name);
        System.out.println("empid is"+ " "+empid);
        System.out.println("salary is:"+ " "+salary);

    }
}

public class copyconstructor{

    public static void main(String[] args){
        employee e1 = new employee("abc",123,12000);
        employee e2 = new employee(e1); //copying the objects  
        e1.display();
        e2.display();




    }
}