 class WithdrawThread extends Thread{
     static int totalBalance;
     int amount;
    
     WithdrawThread(int amount){
        this.amount= amount;
     }
     public void run(){
        synchronized (WithdrawThread.class){
            if(totalBalance >=amount){
                System.out.println(Thread.currentThread().getName() + "is going to withdraw " + amount);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    totalBalance -= amount;
                    System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + totalBalance);
                }
            }
            else {
                System.out.println("Insufficient balance");
            }
        }
     }

    }

public class multithreading5 {
    WithdrawThread x = new WithdrawThread(800);
    WithdrawThread y = new WithdrawThread(800);
    
}
