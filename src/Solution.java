import java.util.Scanner;

public class Solution {
    
    // Generic method to find max
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer array
        int n = sc.nextInt();
        Integer[] intArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        // String array
        int m = sc.nextInt();
        String[] strArr = new String[m];
        for (int i = 0; i < m; i++) {
            strArr[i] = sc.next();
        }

        sc.close();

        System.out.println("Max Integer: " + findMax(intArr));
        System.out.println("Max String: " + findMax(strArr));
    }
}
