public class nestedloop {
    public static void main(String[] args){
        int a=10;
         int b=20;
         int c=30;

        if(a>b && a>c){
            System.out.println("a is the greater number"+a);

        }
        else if(b>c && b>a){
            System.out.println("b is the greater number"+b);

        }
        else{
            System.out.println("c is the greater number: "+c);
        }
    }
}
