
class father{
    void earn(){
        System.out.println("father earns for the family");
    }
}
class boy extends father{
    void learn(){
        System.out.println("boy should learn and grow ");
    }
}
class girl extends father{
    void grow(){
        System.out.println("girl should give their best ");
    }
}



public class hieraricalinheritance{
    public static void main(String[] args){
 boy b1 = new boy();
 girl g1 = new girl();
 
 b1.earn();
 b1.learn();

 g1.earn();
 g1.grow();

        
    }
}