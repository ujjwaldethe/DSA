package Factorial;

import java.util.Scanner;

public class Fact {
    public long factorial(long n)
    {
        long f = 1;
        for(int i=1;i<=n;i++)
        {

            f = f * i ;
        }
        return f;
    }
    public static void main(String args[])
    {
        Fact f = new Fact();
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        n= sc.nextInt();
        System.out.println("Factorial : "+f.factorial(n));
    }
}
