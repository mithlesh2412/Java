// a generic class(template) for that works for different datatypes.
class Test <T>
{
     T data;

     Test(T data){
        this.data=data;

     }
     void show(){
        System.out.println(data);

     }
}

public class templatedemo {
    public static void main(String[] args){
      
        Test<Integer>t1=
        new Test<Integer>(100);

        Test<String>t2=
        new Test<String>("Java");

        t1.show();
        t2.show();



    }
}
