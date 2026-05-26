//thread - a thread is lightweight subprocess used for executing multiple tasks simultaneously.
// better cpu utilisation 
// fast 
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class threaddemo {
    public static void main(String[] args){
      MyThread t= new MyThread();
      t.start();
    }
}
