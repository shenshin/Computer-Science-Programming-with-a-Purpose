/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     7/6/2020
 **************************************************************************** */

public class RevesPuzzle {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        hanoi(n, "a", "b", "c", "d");
    }

    private static void hanoi3(int n, int k, String from, String to,
                               String temp) {
        if (n != 0) {
            hanoi3(n - 1, k, from, temp, to);
            print(n + k, from, to);
            hanoi3(n - 1, k, temp, to, from);
        }
    }

    private static void hanoi(int n, String from, String temp1,
                              String temp2, String to) {
        if (n == 1)
            print(n, from, to);
        else {
            int k = (int) Math.round((double) n + 1 - Math.sqrt(2 * (double) n + 1));
            hanoi(k, from, temp2, to, temp1);
            hanoi3(n - k, k, from, to, temp2);
            hanoi(k, temp1, from, temp2, to);
        }
    }

    private static void print(int n, String from, String to) {
        StdOut.printf("Move disc %d from %S to %S%n", n, from, to);
    }
}
