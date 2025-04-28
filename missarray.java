public class missarray {
    public static void main(String[] args) {
        int sum=0;
        int max=0;
        int[] arr = {3,5,0,4,1};

        for(int i=0;i<arr.length;i++) {
            sum = sum +arr[i];
            System.out.println(sum);
        }
        for (int i=0; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
                System.out.println(max);
            }
        }

    }
    
}
