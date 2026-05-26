//thiskeyword - thiskeyword is used  to refere current class object

public class test {
    int roll;

    test(int roll){
        this.roll=roll;

    }
    void show(){
        System.out.println("rollno is:"+roll);

    }
    public static void main(String[] args){
        test t1= new test(87);
        t1.show();
        
        
    }
}
