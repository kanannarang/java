abstract class Payment{
    abstract void pay(int a);
    void success(){
        System.out.println("Payment successful");
    }
} 

class UpiPayment extends Payment{
       void pay(int a){
        System.out.println("Pay via UPI: " + a);
       }

}
class NetBanking extends Payment{
    void pay(int b){
        System.out.println("Pay via NetBanking: "+ b);
    }
}
public class overriding1 { 
    public static void main(String[] args) {
    

     Payment obj1 = new UpiPayment();
     obj1.pay(22000);
     obj1.success();
     Payment obj2 = new NetBanking();
     obj2.pay(5000000);
     obj2.success();
    }    
}
