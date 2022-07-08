import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();
        int[] v = new int[10];
        for (int i = 0; i < n; ++i) {
            System.out.print("v[" + i + "] = ");
            v[i] = scan.nextInt();
        }

        Arrays.sort(v);

        for (int i = 0; i < n; ++i) {
            System.out.print(v[i] * 2 + " ");
        }
        scan.close();
    }
}
