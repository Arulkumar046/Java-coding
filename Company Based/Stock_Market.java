import java.util.*;

class Stock_Market {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the Stock Product:");
        int Product = obj.nextInt();
        
        int count = 0;
        int[] arr = new int[Product];
        
        System.out.println("Enter the Stock prices:");
        for (int i = 0; i < Product; i++)
        {
            arr[i] = obj.nextInt();
        }
        
        for (int i = 0; i < Product; i++) {
            if (arr[i] < 0) {
                count += 1;
            }
        }
        
        System.out.print(count);
    }
}
