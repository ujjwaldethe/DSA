package Functions;

import java.util.Scanner;

public class Functions {
    public static void driver()
    {
//        printHelloWorld();
//        printHelloWorld();
//        printHelloWorld();
        int a , b ,sum;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
//        sum = calculateSum(a,b);
//        System.out.println("Sum : "+sum);
        swap(a ,b);
        swapWithoutThirdVariable(a,b);


    }
    static public void printHelloWorld()
    {
        System.out.println("Hello");
    }
    public static int calculateSum(int a , int b)
    {
        return a+b;
    }
    public static void swap(int a , int b)
    {
        System.out.println("Before Swap : A: "+a+"B :"+b);
        int temp ;
        temp = a ;
        a = b ;
        b = temp;
        System.out.println("After Swap : A: "+a+"B :"+b);
    }
    public static void swapWithoutThirdVariable(int a, int b)
    {
        System.out.println("Before Swap : A: "+a+"B :"+b);
        a = a+b;
        b = a-b;
        a = a-b ;
        System.out.println("After Swap : A: "+a+"B :"+b);
    }
}
