package FunctionOverloading;

public class FunctionOverloading {
    public int add(int x , int y)
    {
        return (x+y);
    }
    public int add(int x,int y,int z)
    {
        return (x+y+z);
    }
    public int add(int x,int y,int z,int w)
    {
        return (x+y+w+z);
    }
    public static void main(String args[])
    {
        FunctionOverloading f = new FunctionOverloading();
        System.out.println(f.add(4,6));
        System.out.println(f.add(4,6,7));
        System.out.println(f.add(4,6,7,8));

    }
}
