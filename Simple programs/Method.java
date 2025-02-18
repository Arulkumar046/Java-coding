import java.util.*;
class Method
{
    static int Average(int T, int E, int M,int S,int SS)
    {
        int total=(T+E+M+S+SS);
        return total/5;
    }
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        float avg = Average(80,85,90,75,88);
        System.out.println("Average of marks :" + avg);
    }
}