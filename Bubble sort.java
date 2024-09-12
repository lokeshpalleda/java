import java.util.*;

public class Bubble {
    static void sort(int[] ar) {
        int n = ar.length;
        int temp;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (ar[j] > ar[j +1]) {
                    // Swap ar[j] and ar[j + 1]
                    temp = ar[j];
                    ar[j] = ar[j +1];
                    ar[j+1 ] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        sort(ar);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
        sc.close();
    }
}
