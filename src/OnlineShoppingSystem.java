import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ShoppingCart s = new ShoppingCart();
        int choice = 999;

        while( choice!=0)
        {
            System.out.println("Press \n1.Add Items \n2.RemoveItems \n3.View Items \n4.Total \n0.Exit ");
            choice= sc.nextInt();
            switch (choice)
            {
                case 1:
                    s.addItems();
                    break;
                case 2:
                    s.removeItems();
                    break;
                case 3:
                    s.viewCart();
                    break;
                case 4:
                    s.calculateTotalPrice();
                    break;
             }
        }
    }
}
class Product{
    int pid;
    String n;
    int pr;
    int qu;

}
class ShoppingCart extends Product{
   ArrayList<Integer> Pid = new ArrayList<>();
    ArrayList<String> Pname = new ArrayList<>();
    ArrayList<Integer> Pprice = new ArrayList<>();
    ArrayList<Integer> Pquanity = new ArrayList<>();

    Scanner sc = new Scanner(System.in);


    public void addItems()
    {
        System.out.print("Enter Product Id :");
        pid = sc.nextInt();
        System.out.println("Enter Name : ");
         n = sc.next();
        System.out.println("Enter Price : ");
         pr = sc.nextInt();
        System.out.println("Enter Quantity : ");
        qu = sc.nextInt();
        Pid.add(pid);
        Pname.add(n);
        Pprice.add(pr);
        Pquanity.add(qu);

    }
    public void removeItems()
    {
        System.out.println("Enter Product Id : ");
        int d = sc.nextInt();
        Pid.remove(d-1);
        Pname.remove(d-1);
        Pprice.remove(d-1);
        Pquanity.remove(d-1);
    }
    public void viewCart()
    {
        for (int i = 0; i < Pid.size();i++)
        {
            System.out.println("Product id : "+Pid.get(i)+" Name : "+Pname.get(i)+" Price : "+Pprice.get(i)+" Quantity : "+Pquanity.get(i));
        }
    }
    public void calculateTotalPrice()
    {
        int totalPrice=0;
        for(int i=0;i<Pprice.size();i++)
        {
            totalPrice=totalPrice+Pprice.get(i);
        }
        System.out.println("Total Items Price : "+totalPrice);
    }
}

