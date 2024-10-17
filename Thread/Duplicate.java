
import java.util.Scanner;
public class Duplicate
    {
      public static void main(String[] args)
       {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        try {
            check(arr);
            System.out.print("No duplicate numbers");
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
    public static void check(int[] arr) throws Exception
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    throw new Exception("Error:Duplicate number found:" + arr[i]);
                }
            }
        }
    }
}
