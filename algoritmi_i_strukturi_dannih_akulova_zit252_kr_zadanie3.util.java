import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String[] a = s.split(" ");
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            String w = a[i];
            int sm = 0;
            for (int j = 0; j < w.length(); j++) {
                char c = w.charAt(j);
                // '0' = 48, '1' = 49 и т.д.
                int dig = c - 48;
                sm = sm + dig;
            }
            sum[i] = sm;
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (sum[j] > sum[j + 1]) {
                    int tempSum = sum[j];
                    sum[j] = sum[j + 1];
                    sum[j + 1] = tempSum;
                    String tempWord = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tempWord;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(" ");
            }
        }
        
        sc.close();
    }
}