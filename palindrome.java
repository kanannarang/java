public class palindrome {
    public static void main(String[] args) {
        int a=1331;
        int original=a;
        int rev=0;

        while (a>0){
          int digit =a%10;
            rev=  rev*10 + digit;
            a=a/10;

        }
        System.out.println("the reverse of the num is = " + rev);
        if (original==rev){
            System.out.println("the digit is palindrome");
        }
        else{
            System.out.println("the digit is not palindrome");
        }
    
            
        }
            
        }
    

    

