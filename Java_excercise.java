//1.Scan a string and print all the characters until it meets lowercase character.
import java.util.*;
class Java_excercise
{
  public static void main(String[] args)
  {
    Scanner n=new Scanner(System.in);
    String str=n.nextLine();
    StringBuilder d=new StringBuilder();
    for(char ch:str.toCharArray())
    {
      if(Character.isLowerCase(ch))
      {
       break;
      }
      d.append(ch);
    }
  System.out.print(d.toString());
  }
}



//2.Given two strings, write a code to compare two strings to check and say equal or not. 
import java.util.*;
class Java_excercise
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    if(str1.equals(str2))
    {
      System.out.print("Equal");
    }
    else
    {
      System.out.print("Not Equal");
    }
  }
}


//3.Write a program to implement strupr function.
import java.util.*;
class Java_excercise
{
  public static void main(String[] args)
  {
    Scanner n=new Scanner(System.in);
    String d=n.nextLine();
    System.out.print(d.toUpperCase());
  }
}


//4.Given number of elements , array and K value, Find the minimum number of Swaps required to get elements less then K and  greater elements on the right  side.
import java.util.*;
class Java_excercise{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
  int h=n.nextInt();
  int arr[]=new int[h];
  for(int i=0;i<h;i++){
    arr[i]=n.nextInt();
  }
  int k=n.nextInt();
  int count=0;
  for(int i=0;i<h;i++){
    if(arr[i]<=k)
    count++;
  }
  int a=0;
  for(int i=0;i<count;i++){
    if(arr[i]>k)
    a++;
  }
    int swap=a;
    for(int i=0;i<h;i++){
      if(arr[i]>k)
      a--;
      if(arr[i]>k)
      a++;
    swap=Math.min(swap,a);
    }
    System.out.print(swap);
  }
}


//5.Write a program to check whether the given array of elements are in a Monotonic order or Not.
import java.util.*;
class Java_excercise{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=n.nextInt();
    boolean t=false;
    int arr[]=new int[h];
    for(int i=0;i<h;i++){
      arr[i]=n.nextInt();
    }
    if(arr[0]>arr[1]){
      for(int j=1;j<h;j++){
  if(arr[j-1]>arr[j]){
  t=true;
  }
  else{
  t=false;
    break;
  }
    }}
    else{
      for(int y=1;y<h;y++){
   if(arr[y-1]<arr[y]){
     t=true;
   }else{
     t=false;break;
   }
    }}
    if(t){
      System.out.print("Monotonic");
    }
    else{
      System.out.print("Not Monotonic");
    }
  }
}
