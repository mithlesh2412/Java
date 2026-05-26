// throw -used to explicitly throw exceptions
public class throwdemo {
    public static void main(String[] args){
        int age=25;

        if(age<10){
            throw new ArithmeticException("Not eligible");
        }
        System.out.println("eligible");
    }
    
}
