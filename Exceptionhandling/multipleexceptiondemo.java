//multipleexception handling - 

class multipleexceptiondemo{
    public static void main(String[] args){
        try{
            int arr[] =new int[5];
            arr[10] =50;

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index invalid");
        }
        catch(Exception e){
            System.out.println("General exception");
        }
    }
}