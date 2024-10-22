package Arrays;

public class MaxSubArraySumUsingPrefix {
        public static void main(String args[])
        {
            int arr[]={2,4,6,8,10};
            int prefix[]=new int[arr.length];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum=0;
            prefix[0]=arr[0];
            for(int i=1;i<prefix.length;i++) {
                prefix[i]=prefix[i-1]+arr[i];
                System.out.print(prefix[i]+" ");
            }
            for(int i=0;i<arr.length;i++)
            {
                for (int j=i;j<arr.length;j++)
                {
                    sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                }
                if(max<sum)
                {
                    max=sum;
                }
                if(min>sum)
                {
                    min=sum;
                }
            }
            System.out.println("\n "+min+"\n "+max);
    }

}
