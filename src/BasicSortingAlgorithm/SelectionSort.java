package BasicSortingAlgorithm;

public class SelectionSort {
   public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                {
                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
       for(int ar : arr)
       {
           System.out.print(ar+" ");
       }
    }
    public static void main(String args[]) {
        int arr[]={2,4,7,5,4,3,34};
        selectionSort(arr);
    }
}
