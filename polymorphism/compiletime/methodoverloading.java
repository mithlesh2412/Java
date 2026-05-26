//methodoverloading- means having multiple methods with same name and different parameters 

class addition{
    int add(int a,int b){
        return a+b;

    }

    double add(double a,double b){
        return a+b;

    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}




public class methodoverloading {
    public static void main(String[] args){
      
        addition obj = new addition();
     
        System.out.println("sum of two int:"+obj.add(4,5));
        System.out.println("sum of two double:"+obj.add(4.5,5.5));

        System.out.println("sum of three int:"+obj.add(4,5,6));

 
    }
}
