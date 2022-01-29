import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();

        int count = 0;
        while (true) {
            Random random = new Random(k);
            for (int i = 0; i < n; i++) {
                double gaussian = random.nextGaussian();
                if (gaussian > m) {
                    random.setSeed(k++);
                    count = 0;
                    break;
                }
                count++;
            }
            if (count == n) {
                System.out.println(k);
                break;
            }
        }
    }
}
