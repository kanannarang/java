public class binarysearch {

    public static int BinarySearch() {
        int target = 5;
        int[] arr = {1,2,3,4,5,6,7,8};
        int start = 0;
        int endPoint = arr.length -1;

        while (start <= endPoint) {
            int midPoint = ( start + endPoint)/2;

            if (arr[midPoint]==target) {
                return midPoint;
                
            }
            else if (arr[midPoint]>target) {
                endPoint = midPoint -1;
           }
           else{
            start = midPoint +1;
           }
            
        }
        return -1;
    }
    public static void main(String[] args) {
       BinarySearch();
        System.out.println();
    }
    
}
