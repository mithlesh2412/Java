//finally - this block executes whether exception occurs or not

class finallydemo{
    public static void main(String[] args){
        try{
            int x =10/0;

        }
        catch(ArithmeticException e){
            System.out.println("exception handled successfully");
        }
        finally{
            System.out.println("finally block executes");
        }
        

    }
}