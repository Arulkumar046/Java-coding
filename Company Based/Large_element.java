import java.util.*;

class Large_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Please enter at least 2 elements.");
            return;
        }
        
        int[] a = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);

        findLargestSum(a, n);
    }

    public static void findLargestSum(int[] a, int n) {
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                set1.add(a[i]);
            } else {
                set2.add(a[i]);
            }
        }
        
        if (set1.size() < 2 || set2.size() < 2) {
            System.out.println("Not enough elements to find the second largest.");
            return;
        }
        
        int result = set1.get(set1.size() - 2) + set2.get(set2.size() - 2);
        System.out.println("The sum of the second largest elements is: " + result);
    }
}
