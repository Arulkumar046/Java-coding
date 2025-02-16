import java.util.*;
class Palindrome
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int rev_num=0;
        int org_num=num;
        while(num!=0)
        {
            int dig=num%10;
            rev_num=(rev_num*10)+dig;
            num=num/10;
        }
        if(org_num==rev_num)
        {
            System.out.println(num +" is Palindrome");
        }
        else
        {
            System.out.println(num +" is not Palindrome");
        }
        obj.close();
    }
}