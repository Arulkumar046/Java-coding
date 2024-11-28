import java.util.*;
public class Vowel
    {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        try{
            check(s);
            System.out.print("String contain vowels");
        }
        catch(Exception e)
        {
            System.out.print("String does not contain vowels");
        }
        finally
            {
            obj.close();
            }

    }
    static void check(String s) throws Exception
        {
        int a=0;
        for(int i=0; i<s.length();i++){
            char b=s.charAt(i);
            if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u' || b=='A' || b=='E' || b=='I' || b=='O' || b=='U')
            {
                a=1;
                break;
            }
    }
    if(a==0)
    {
        throw new Exception();
    }
    }
}

