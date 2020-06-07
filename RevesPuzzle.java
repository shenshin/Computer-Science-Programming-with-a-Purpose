/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     7/6/2020
 **************************************************************************** */

public class RevesPuzzle {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        reves(n, "a", "b", "c", "d");
    }

    public static void hanoi(int n, String from, String to,
                             String temp) {
        if (n != 0) {
            hanoi(n - 1, from, temp, to);
            print(n, from, to);
            hanoi(n - 1, temp, to, from);
        }
    }

    public static void reves(int n, String from, String temp1,
                             String temp2, String to) {
        if (n == 1)
            print(n, from, to);
        else {
            int k = (int) ((Math.sqrt(8 * n + 1) - 1) / 2);
            reves(n - k, from, temp2, to, temp1);
            hanoi(k, from, to, temp2);
            reves(n - k, temp1, from, temp2, to);
        }
    }

    private static void print(int n, String from, String to) {
        StdOut.printf("Move disc %d from %S to %S%n", n, from, to);
    }
}
