import java.util.Scanner;

public class Main {
    static boolean f(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (f(n)) {
            System.out.println("простое");
        } else {
            System.out.println("не простое");
        }
        scanner.close();
    }
}