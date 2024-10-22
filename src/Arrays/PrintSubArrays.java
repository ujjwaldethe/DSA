package Arrays;

public class PrintSubArrays {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                for(int k=i;k<j;k++)
                {
                    System.out.print(arr[k]+" ");

                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total SubArrays : "+count);
    }
}
