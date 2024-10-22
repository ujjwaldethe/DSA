package Arrays;

public class ReverseArray {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,11,12,13,14};
        int start=0,end=arr.length-1;
        System.out.print("\n\nArray Before Reverse : ");
        for(int ar: arr)
        {
            System.out.print(ar+" ");
        }
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print("\n\nArray After Reverse : ");
        for(int ar: arr)
        {
            System.out.print(ar+" ");
        }

    }
}
