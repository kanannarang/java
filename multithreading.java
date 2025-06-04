class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        try {
            Thread.sleep(4000);
        }
            catch (Exception e){
        }
        System.out.println("hyyy");
    }
}
public class multithreading {
    public static void main(String[] args) {
        MyThread t= new MyThread();
        t.start();
    }
}
