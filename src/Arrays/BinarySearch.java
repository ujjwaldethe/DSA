package Arrays;

public class BinarySearch {
    public static int bSearch(int arr[],int key)
    {
        int start=0,end=arr.length-1;
        while (start<=end)
        {
            int mid = (start+end)/2;
            if (arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;


    }
    public static void driver()
    {
        int arr[]={1,2,3,4,5,6,7,8,9,11,12,13,14};
        int key=11;
        int found =+bSearch(arr,key);
        if (found!=-1)
            System.out.print(" Element "+key+" Found At Location "+found);
        else
            System.out.print("Element Not Found");
    }
}
