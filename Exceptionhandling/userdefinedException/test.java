// userdefinedexceptions - a custom exception created by the user
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class test {
    public static void main(String[] args){
        try{
            throw new MyException("custom exception");

        }
        catch(MyException e){
            System.out.println(e);

        }
    }
}
