class animal{
    animal(){
        System.out.println("animal constructor called succesfully");
    }

}
class dog extends animal{
    dog(){
        super(); // calls the parent class constructor
        System.out.println("dog barks loudly");
    }
}

public class superconstructor {
    public static void main(String[] args){
 dog d = new dog();
 
    }
}
