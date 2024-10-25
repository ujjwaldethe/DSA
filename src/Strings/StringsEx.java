package Strings;

import java.util.Scanner;

public class StringsEx {
    public  static void printLetters(String str){
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void Palindrone(String str){
        boolean flag=false;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                flag=true;
            }
        }
        if(flag)
        {
            System.out.println("Not Palindrone");
        }
        else{
            System.out.println("Palindrone");
        }
    }
    public static void main(String[] args) {
        Palindrone("et");
        printLetters("Ujjwal");
        char arr[]={'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("\nEnter String : ");
        name=sc.nextLine();
        System.out.println("\n Name : "+name);
        System.out.println("\n Length : "+name.length());

        //Concat
        String con = str + str2;
        System.out.println("concat : "+con);

        //charAt
        System.out.println("First Letter : "+name.charAt(0));
    }
}
