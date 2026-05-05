import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static String f(String s) {
        String[] a = s.split(" ");
        ArrayList b = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            String w = a[i];
            boolean t = true;
            for (int j = 0; j < b.size(); j++) {
                if (b.get(j).equals(w)) {
                    t = false;
                }
            }
            if (t) {
                b.add(w);
            }
        }
        String r = "";
        for (int i = 0; i < b.size(); i++) {
            r = r + b.get(i);
            if (i < b.size() - 1) {
                r = r + " ";
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(f(s));
    }
}