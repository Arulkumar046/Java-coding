import java.util.*;
class Arr_to_ArrList
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<Integer>();
        ArrayList<Integer>list1=new ArrayList<>();
        int n;
        while(true)
        {
            n=obj.nextInt();
            if(n==-1)
            break;
            list.add(n);
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            list1.add(list.get(i));
        }
        System.out.println(list1);
        
    }
}