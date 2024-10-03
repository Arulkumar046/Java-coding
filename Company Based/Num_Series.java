import java.util.*;
class Num_Series
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i+=1)
        {
            arr[i]=obj.nextInt();
        }
        int sum=0;
        int res;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
              {
            
            res = Math.abs(arr[i]-arr[j]);
            sum = sum+res;
        }
        }
        System.out.print(sum);
    }
    
}