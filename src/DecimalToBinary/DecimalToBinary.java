package DecimalToBinary;

public class DecimalToBinary {
    public int decimalToBinary(int n)
    {
        int pow1 = 0 ,decNum=0;
        while(n>0)
        {
            int lastDigit = n%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow1));
            pow1++;
            n=n/10;
        }
        return decNum;
    }
    public static void main(String args[])
    {
        DecimalToBinary d = new DecimalToBinary();
        System.out.println("Decimal : "+d.decimalToBinary(101));
    }
}
