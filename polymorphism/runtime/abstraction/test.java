//abstract class - a classs which shows the neccesaary details without showing its actual implementation. ->declared using abstract keyword .
// achieved using abtract class and interfaces

abstract class animal{
    abstract void sound();

    void sleep(){
        System.out.println("animal sleeps ");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
public class test {
    public static void main(String[] args){
        dog d = new dog();
        d.sleep();
        d.sound();

    }
    
}
