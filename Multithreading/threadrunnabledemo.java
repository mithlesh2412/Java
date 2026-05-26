//thread using runnable

class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running using runnable");


    }
}

public class threadrunnabledemo {
    public static void main(String[] args){
        
        MyThread m = new MyThread();
        Thread t =new Thread(m);

        t.start();


    }
    
}
