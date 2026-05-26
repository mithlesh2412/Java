 class animal{

    void sound(){
        System.out.println("animal makes sound");
    }
    
}
class dog extends animal{
    void bark(){
        System.out.println("dog barks loudly");
    }

    
}
public class singleinheritance1{
    public static void main(String[] args){
        dog d = new dog();
        d.sound();
        d.bark();
        
    }
}
