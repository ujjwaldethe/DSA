package Arrays;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String args[])
    {
        //Ways to create arrays
        String str ="madam";
        StringBuilder str1 = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
           str1.append(str.charAt(i));
        }
        if(str1.toString().equals(str))
        {
            System.out.print("Palindrone");
        }
        else{
            System.out.print("Not Palindrone");
        }
        int arr[]=new int[10];
        int arr1[]={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" Elements Of An Array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elemensts : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int ele : arr1)
        {
            System.out.print(ele);
        }

    }
}
