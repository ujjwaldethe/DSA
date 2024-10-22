package BasicSortingAlgorithm;
import java.util.*;
public class InbuiltSort {
    public static void main(String args[])
    {
        int arr[]={2,4,6,45,65,562,33,4,7,8,};
        Integer arr2[]={2,4,6,45,65,562,33,4,7,8,};
        //Arrays.sort(arr);
        for(int ar : arr)
        {
            System.out.print(ar+ " ");
        }
        System.out.println();
        Arrays.sort(arr,0,8);
        for(int ar : arr)
        {
            System.out.print(ar+ " ");
        }
        Arrays.sort(arr2,Collections.reverseOrder());
        System.out.println();
        for(int ar : arr2)
        {
            System.out.print(ar+ " ");
        }
    }
}
