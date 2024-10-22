package BasicSortingAlgorithm;

public class CountingSort {
    public static void countingSort(int arr[])
    {

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j =0;
        for(int i=0;i<arr.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,4,5,6,7,8,9,34,54,7,5,8,5};
        countingSort(arr);
    }
}
