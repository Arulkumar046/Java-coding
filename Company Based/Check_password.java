import java.util.*;
class Check_password
{
public static void main(String[]args)
{
    Scanner obj=new Scanner(System.in);
    String s=obj.nextLine();
    int num=0;
    int spc=0;
    int n=s.length();
    char[] c=new char[n];
    for(int i=0;i<n;i++)
     {
         c[i]=s.charAt(i);
     }
    for(int i=0;i<n;i++)
    {
       if(c[0]>='A'&&c[0]<='Z')
         {
             if((c[i]>='0'&& c[i]<='9'))
             {
                 num++;
             }
             if (c[i]==' '&&c[i]=='/')
             {
                 spc++;
                 
             }
            
             
         }
         }
         if(n>4 && num>0 && spc==0)
         {
             
             System.out.print("Password accept");
         }
         else
         {
             
             System.out.print("Password wrong");
         }
    
}
}