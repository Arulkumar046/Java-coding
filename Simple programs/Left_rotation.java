import java.util.*;
class Left_rotation
{
  public static void main(String[]args)
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=obj.nextInt();
    }
    int r=obj.nextInt();
    int[] res=new int[n];
    for(int i=0;i<n;i++)
    {
      res[i]=a[(i+r)%n];
    }
    for(int i=0;i<n;i++)
    {
      System.out.printf("%d ",res[i]);
    }
    
  }
}
