package Arrays;

public class LinearSearch {
    public static int linearSearch(int arr[],int search)
    {

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==search)
            {
                return search;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,4,6,8,5};
        int key=5;
        System.out.print("Element Found : "+linearSearch(arr,key));
    }
}
