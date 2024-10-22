package ARRAYS2D;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays2D {
    public static boolean Found(int matrix[][],int key)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Found At : ("+i+" "+j+")");
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }
    public static int Largest(int matrix[][])
    {
        int largest = matrix[0][0];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[i].length;j++)
            {
                if(matrix[i][j]>largest)
                {
                    largest=matrix[i][j];
                }
            }
            System.out.println();
        }
        return largest;
    }
    public static int Smallest(int matrix[][])
    {
        int smallest = matrix[0][0];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<smallest)
                {
                    smallest=matrix[0][0];
                }
            }
            System.out.println();
        }
        return smallest;
    }
    public static void main(String args[])
    {
        int matrix[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Elements : ");
        int key ;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("\nArray Elements Are : \n");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        System.out.print("\nEnter Key ");
        key = sc.nextInt();
        if(Arrays2D.Found(matrix,key))
        {
            System.out.println("Key Found");
        }
        else{
            System.out.println("Not Found");
        }
        System.out.println("Largest Number Is "+ Arrays2D.Largest(matrix));
        System.out.println("Smallest Number Is "+Arrays2D.Smallest(matrix));
    }
}
