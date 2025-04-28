public class bubblesort {
    static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] /= arr[j+1];
                    arr[j+1] = temp;                }
            }
        }
    }
    for(int i:arr) {
        

    }
}
