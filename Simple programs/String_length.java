import java.util.*;
class String_length
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int length=0;
        for(char c : str.toCharArray())
        {
            length++;
    }
    System.out.println("Length of String : "+ length);
}
}