import java.util.*;
class Min_element
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int arr[]={12,43,23,53,25,87,25,34,83};
        int min=arr[0];
        for(int i=1;i<arr.length;i+=1)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Min_element : "+ min);
    }
}