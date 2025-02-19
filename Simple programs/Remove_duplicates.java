import java.util.*;
class Remove_duplicates
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int arr[] = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10};
        Arrays.sort(arr);
        System.out.print(arr[0] + " ");
        int previous = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != previous) {
                System.out.print(arr[i] + " ");
                previous = arr[i];
            }
        }
    }
}
