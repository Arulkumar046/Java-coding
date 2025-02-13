import java.util.*;
class sample
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(isPerfectNumber(n))
        {
            System.out.println(n + " is a perfect number");
        }
        else
        {
            System.out.println(n + " is not a perfect number");
        }
    }
    public static boolean isPerfectNumber(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                sum +=i;
            }
        }
        return sum == n;
    }
}