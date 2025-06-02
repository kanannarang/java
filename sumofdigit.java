public class sumofdigit {

    public static void main(String[] args) {
        int a=860;
        int sum=0;
        while (a>0) {
            sum = sum+ a%10;
            a= a/10;
            
        }
        System.out.println(sum);

    }
    }
