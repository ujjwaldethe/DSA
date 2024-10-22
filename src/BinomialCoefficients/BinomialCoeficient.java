package BinomialCoefficients;

import java.util.Scanner;

public class BinomialCoeficient {
    public long fact(long n)
    {
        long f = 1 ;
        for(int i=1;i<=n;i++)
        {
            f = f * i ;
        }
        return f;
    }
    public long binoCoeffi(long n , long r)
    {
       long fact_n =fact(n);
       long fact_r = fact(r);
       long fact_nr = fact(n-r);
       long bino = fact_n/(fact_r*fact_nr);
       return bino;
     }
     public static void main(String args[])
     {
         BinomialCoeficient b = new BinomialCoeficient();
         long n , r  ;
         Scanner sc = new Scanner(System.in);
         n = sc.nextLong();
         r = sc.nextLong();
         System.out.println("Binomial Coefficient : "+b.binoCoeffi(n,r));
     }
}
