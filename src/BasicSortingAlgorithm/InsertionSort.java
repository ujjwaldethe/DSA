package BasicSortingAlgorithm;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++) {
            int curr = arr[i];
            int prev = i - 1;
            while(prev>=0 && arr[prev]>curr){
                //5,3,2,1
                System.out.print("\nprev : "+prev+" >= 0 "+"&& "+arr[prev]+" > curr : "+curr+"\n "+arr[prev+1]+" = "+arr[prev]+" Prev : ");
                arr[prev+1]=arr[prev];
                prev--;
                System.out.print(prev+ " Array : ");
                for(int ar : arr)
                {
                    System.out.print(ar+" ");
                }
            }
            arr[prev+1]=curr;
        }
        System.out.println();
        for(int ar : arr)
        {
            System.out.print(ar+" ");
        }
    }
    public static void main(String args[]) {
        int arr[]={5,3,2,1};
        insertionSort(arr);
    }
}
