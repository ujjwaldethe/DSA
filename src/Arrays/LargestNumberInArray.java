package Arrays;

public class LargestNumberInArray {
    public static void getLargest(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
            if(smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        System.out.print("Largest Number : "+largest+" Smallest Number : "+smallest);
    }
    public static void driver()
    {
        int arr[]={1,2,3,4,5,6};
        getLargest(arr);
    }

}
