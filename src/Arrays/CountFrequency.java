package Arrays;

import java.util.Scanner;

public class CountFrequency {
    public static int countFreq(String name)
    {
        int freq[] = new int[26];
        int max;
        for(int i=0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(Character.isLetter(ch))
            {
                ch = Character.toLowerCase(ch);

                freq[ch-'a']++;
            }
        }
        for(int i=0;i< freq.length;i++)
        {

        }
        return 0;
    }
    public static void main(String args[])
    {

        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String : ");
        name = sc.nextLine();
        System.out.println("Name : "+name);
        countFreq(name);
    }
}
