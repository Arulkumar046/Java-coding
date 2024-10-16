import java.util.*;
class Height
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int height=obj.nextInt();
        int velocity=obj.nextInt();
        int vn=obj.nextInt();
        int en=(velocity/vn);
        int res=height*(en*en);
        System.out.print(res);
    }
}