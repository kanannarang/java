import java.util.Scanner;

public class inputarr { 
    public static void main(String[] args) {
        int sum=0;
        int even=0;
        int odd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        System.out.println("Enter the values");
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
              arr[i]= sc.nextInt();
        } 
        int min= arr[0];
        int max = arr[0];
        
        System.out.print("the elements are = ");
        for( int i=0; i<arr.length; i++){
            
            System.out.print( arr[i]);
            System.out.print(" ");
        }
        for( int i=0; i<arr.length; i++){
            sum = sum + arr[i];          
        } 
        System.out.println();
        System.out.println("the sum is =" + sum); 

        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0) {
                System.out.println("Even element = " + arr[i] );
            }
            else{
                System.out.println("Odd element = "  + arr[i]);
            }
       }
      for ( int k=0;k<arr.length;k++){
        if (arr[k]%2==0) {
            even++;
        }
        else{
            odd++;
        }
      }
      System.out.println("even values are"+ " " + even );
      System.out.println("odd values are" + " " + odd);
        
      for(int i=0;i<arr.length;i++){
        if (max < arr[i]) {
            max = arr[i];
            }
        } 
        System.out.println("the maximum element is = " + max);
        
        for(int  i=0;i<arr.length;i++){
            if (min > arr[i]) {
                min = arr[i];
                }
            }
         
            System.out.println("the minimum element is = "+ min);
   
   }

}  

