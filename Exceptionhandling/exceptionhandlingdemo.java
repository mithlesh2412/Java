//exceptionhandling - a block code that prevents the exception from causing and runs the program as normal workflow.
/*  exception is traced and using keyword - 
(1)try -block of code causing exception
(2)catch- block catches the type of exception
(3)throw-explicityly throws exception
(4)finally-always executes

*/

class exceptionhandlingdemo{
    public static void main(String[] args){
        try{
        int a=10;
        int b=0;

        int c =a/b;
        System.out.println("result is: "+c);

        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");

        }
        System.out.println("program continues");

    }
}
