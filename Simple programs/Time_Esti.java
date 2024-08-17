import java.util.*;
class Time_Esti
{
  public static void main(String[]args)
  {
  Scanner obj=new Scanner(System.in);
  int weight=obj.nextInt();
  if(weight==0)
  {
    System.out.print("Time Estimated: 0 minutes");
  }
  else if(weight>=0&& weight<=2000)
  {
    System.out.print("Time Estimated: 25 minutes");
  }else if(weight>2000 && 4000>weight)
  {
    System.out.print("Time Estimated: 35 minutes");
  }
  else if(weight>=4001&& weight<=7000)
  {
    System.out.print("Time Estimated: 45 minutes");
  }
  else
  {
    System.out.print("INVALID INPUT");
  }
}
}