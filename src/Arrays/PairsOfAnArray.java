package Arrays;

import java.util.*;

public class PairsOfAnArray {
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        Set<String> s = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print(" "+arr[i]+" "+arr[j]+" ");
                int temp[]={arr[i],arr[j]};
                Arrays.sort(temp);
                s.add(Arrays.toString(temp));
            }
            System.out.println();
        }
        for (String str : s)
        {
            System.out.print(str+" ");
        }
    }
}
