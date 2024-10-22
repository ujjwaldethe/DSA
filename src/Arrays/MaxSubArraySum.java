package Arrays;

public class MaxSubArraySum {
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10,-1};
        int count=0 ;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(max<sum)
                {
                    max=sum;
                }
                if(min>sum)
                {
                    min=sum;
                }
                count++;
            }

        }
        System.out.println("Minimum Sum : "+min+"\nMaximum Sum : "+max);
        System.out.println("Total SubArrays : "+count);
    }
}
