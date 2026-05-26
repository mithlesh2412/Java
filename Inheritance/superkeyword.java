//superkeyword - a superkeyword is used to access the parent class constructor or method variable

class animal{
    void sound(){
        System.out.println("animal makes sound");

    }
}
class dog extends animal{
    void speak(){
        super.sound(); // used to access parent class variable
        System.out.println("dog barks");

    }

}

public class superkeyword {
    public static void main(String[] args){
        dog d = new dog();
        d.sound();

    }
}
