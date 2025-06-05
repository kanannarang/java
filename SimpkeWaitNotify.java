
public class SimpkeWaitNotify {
    private boolean isSignalled = false;

    public synchronized void sendSignal() {
        isSignalled = true;
        System.out.println("Producer: Sending Signal....");
        notify();
    }
    public synchronized void waitForSignal() {
        while(!isSignalled) {
            try {
                System.out.println("Consumer : Waiting for Signal....");
                wait();
            } catch (InterruptedException e) {
             
            }
        }
        System.out.println("Consumer: Got the Signal");
    }

    public static void main(String[] args) {
        SimpkeWaitNotify obj = new SimpkeWaitNotify();
        Thread consumer = new Thread( ()-> {
            obj.waitForSignal();
        });
        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            obj.sendSignal();
        });
        consumer.start();
        producer.start();
    }
    
}
