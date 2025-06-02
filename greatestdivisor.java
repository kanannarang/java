public class greatestdivisor {
    public static void main(String[] args) {
        
    
    int n1,n2, gcd=1;
        n1=36;
        n2=48;
    
    
   

   for(int i=1;i<=n1 && i<=n2; i++){
       if(n1%i==0 && n2%i==0){
           gcd =i;

       }
   }
    System.out.println("the greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    
}}
