package Arrays;
public class MaxSubArrayUsingKadanes {
    public static boolean isArrayNegative(int[] arr) {
        for (int num : arr) {
            if (num > 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
            int arr[]={-1,-2,-3,-4,-23};
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum=0;
            boolean allnegative=isArrayNegative(arr);
            if(!allnegative)
            {
                for(int i=0;i<arr.length;i++) {
                    sum=sum+ arr[i];
                    if(sum<0)
                    {
                        sum=0;
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
                System.out.println("\nMinimum : "+min+"\nMaximum : "+max);
            }
            else {
                for(int i=0;i<arr.length;i++) {
                    sum=sum+ arr[i];
                    max = Math.max(sum,max);
                    min = Math.min(sum,min);
                    if(sum<0)
                    {
                        sum=0;
                    }
                }
                System.out.println("\nMinimum : "+min+"\nMaximum : "+max);
            }
    }
}
