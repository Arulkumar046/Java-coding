 import java.util.*;
 class sample
 {
   public static void gen(int n)
   {
   Queue<String> qu=new LinkedList<>();
   qu.add("1");
   for(int i=1;i<=n;i++)
   {
     String cur=qu.poll();
     System.out.print(cur +" ");
     qu.add(cur+"0");
     qu.add(cur+"1");
   }
   }
   public static void main(String[]args)
   {
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     gen(n);
   }
 }