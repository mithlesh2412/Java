// runtime polymorphism is achieved using abstract method
abstract class shape{
    abstract void draw();

}

class circle extends shape{
    void draw(){
        System.out.println("a circle is of 360 degree");
    }
}
public class abstractpolymorphism {
    public static void main(String[] args){
        shape s = new circle();
        s.draw();
        
    }
    
}
