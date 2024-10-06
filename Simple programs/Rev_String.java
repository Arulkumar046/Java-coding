import java.util.*;
class Rev_String
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine();
    
    String[] arr = str.split(" ");
    
    StringBuilder string = new StringBuilder();
    
    for(int i = 0;i < arr.length;i++)
    {
      String str2 = rev(arr[i]);
      string.append(str2).append(" ");
      
    }
    System.out.print(string.toString().trim());
  }
  public static  String rev(String name)
  {
    String str3 = name;
    String empty = "";
    
    for(int i =str3.length() - 1;i >=0;i--)
    {
      empty = empty + str3.charAt(i);
    }
    return empty;
  }
}
