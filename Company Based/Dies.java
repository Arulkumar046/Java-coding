import java.util.*;
class Dies
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();        
        {
           for(int i=1;i<6;i++) 
           {
               for(int j=1;j<6;j+=1)
               {
                   if(i+j==n)
                   {
                       System.out.printf("%d+",i);
                       
                       System.out.printf("%d",j);
                       System.out.println();
                   }
               }
           }
        }
    }
}