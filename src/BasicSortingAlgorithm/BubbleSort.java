package BasicSortingAlgorithm;

public class BubbleSort {
    public static void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int ar : arr)
        {
            System.out.print(ar+" ");
        }
    }
        public static void main(String args[]) {
            int arr[] = {9,7,5,8,3};
            BubbleSort(arr);

        }

}
