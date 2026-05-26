class animal{
    void sound(){
        System.out.println("animal makes so much sound");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog barks loudly");

    }
}
class cat extends dog{
    void meow(){
        System.out.println("cat meows loudly");
    }
}


public class multilevelinheritance {
    public static void main(String[] args){
        cat c = new cat();
        c.meow();
        c.bark();
        c.sound();
        
    }
}
