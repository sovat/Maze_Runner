package maze;

public class Main {
    public static void main(String[] args) {

        int[][] multi = new int[][]{
                {1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
                {1, 0, 1, 0, 0, 1, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };
        for (int[] ints : multi) {
            for (int i : ints) {
                if (i == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("\u2588\u2588");
                }
            }
            System.out.println();
        }
    }
}
