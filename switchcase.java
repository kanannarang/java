import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int num;
        Scanner a  = new Scanner(System.in);
        System.out.println("Enter your number");

        num = a.nextInt();

        switch (num) {

            case 0:
            System.out.println("zero");
                break;

           case 1:
            System.out.println("one");
                break;

                case 2:
            System.out.println("two");
                break;

                case 3:
            System.out.println("three");
                break;

                case 4:
            System.out.println("four");
                break;

                case 5:
            System.out.println("five");
                break;

                case 6:
            System.out.println("six");
                break;

                case 7:
            System.out.println("seven");
                break;

                case 8:
            System.out.println("eight");
                break;

                case 9:
            System.out.println("nine");
                break;
        
            default:
            System.out.println("INVALID VALUE");
                break;
        }

        
      
    }
    
}
