// a static keyword belongs to class rather than object
// a static keyword can be called without creating object

class statickeyword{

    static void show(){
        System.out.println("static keyword called");
    }
    public static void main(String[] args){
        show();
    }
}