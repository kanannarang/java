class MyRunnable implements Runnable {
public void run(){
    for(int i=0;i<10;i++){
    System.out.println(Thread.currentThread().getName());
       }
    }
}

public class multithreading3 {
    public static void main(String[] args)throws InterruptedException {
        MyRunnable y= new MyRunnable();
        Thread u=new Thread(y);
        u.setName("kanan");
        u.start();
        u.join();
        try {
           Thread.sleep(10000);}
        catch (Exception e) {
         }
        for(int i=0;i<10;i++){
        System.out.println(Thread.currentThread().getName());
        }
    }
}
