class WithdrawThread extends Thread {
    static int totalBalance = 1000;
    int amount;

    public WithdrawThread(int amount){
        this.amount= amount;
    }

public void run(){
    if(totalBalance>=amount){
        System.out.println("Money debited from Account: "+amount);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        totalBalance-=amount;
        System.out.println(totalBalance);
    }
    else{
        System.out.println("Insufficient Balance");
    }
}}
public class multithreading4 {
    public static void main(String[] args) {
    WithdrawThread x = new WithdrawThread(800);
    WithdrawThread y = new WithdrawThread(500);
    x.start();
    y.start();
    }  
    
}
