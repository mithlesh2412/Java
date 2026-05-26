public class animal {
    void sound(){
        System.out.println("animal makes sound");
    }
    public static void main(String[] args){
        dog d = new dog();
        d.sound();
        d.bark();
        
    }
}
class dog extends ani{
    void bark(){
        System.out.println("dog barks loudly");
    }

    
}
