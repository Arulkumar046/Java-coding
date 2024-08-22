import java.util.*;
class Alt_power
{
  public static void main(String[]args)
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int p2=0;
    int p3=0;
    for(int i=0;i<n;i++)
    {
      if(i%2==0)
      {
        System.out.print((int)Math.pow(2,p2)+" ");
        p2++;
    }
    else
    {
      System.out.print((int)Math.pow(3,p3)+" ");
      p3++;
    }
  }
  }
}
