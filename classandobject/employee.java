public class employee {
    String name;
    int age;
    int empid;

    void show(){
        
        System.out.println(name +" "+age + " "+ empid);

    }
    public static void main(String[] args){
      employee e1 = new employee();
      employee e2 = new employee();

      e1.name ="ram";
      e1.age=21;
      e1.empid=001;

      e2.name="shyam";
      e2.age=22;
      e2.empid=002;

      e1.show();
      e2.show();
    }
}

