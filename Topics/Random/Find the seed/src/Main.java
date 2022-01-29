import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int seed = a;
        int min = k;

        for (int i = a; i <= b; i++) {
            Random random = new Random(i);
            int max = 0;
            for (int j = 0; j < n; j++) {
                int nextInt = random.nextInt(k);
                if (nextInt > max) {
                    max = nextInt;
                }
            }
            if (max < min) {
                seed = i;
                min = max;
            }
        }
        System.out.println(seed);
        System.out.println(min);
    }
}
