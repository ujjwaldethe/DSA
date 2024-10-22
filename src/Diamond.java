public class Diamond {
    public static void main(String args[])
    {
        int flag=0;
        for(int i=0;i<10;i++)
        {
            for(int j=1;j<10;j++)
            {
                if(i%2==0)
                {
                    continue ;
                }
                if(j>0 && j<i+1)
                {
                    System.out.print(j);
                }
            }
            if(i%2==0)
            {
                continue ;
            }
            System.out.println();
        }
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<8;j++)
            {
                if(j>0 && j<=8-i )
                {
                    if(i%2==0)
                    {
                        continue ;
                    }
                    System.out.print(j);
                }
            }
            if(i%2==0)
            {
                continue ;
            }
            System.out.println();
        }
    }
}
