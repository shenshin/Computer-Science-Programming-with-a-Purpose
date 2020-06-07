/* *****************************************************************************
 *  Name:              Alex Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     14/5/2020
 **************************************************************************** */

public class Minesweeper {

    public static void main(String[] args) {
        int m = Math.abs(Integer.parseInt(args[0]));
        int n = Math.abs(Integer.parseInt(args[1]));
        int k = Math.abs(Integer.parseInt(args[2]));
        int[][] mines = new int[m][n];
        if (k > m * n) k = m * n;

        int minesPut = 0;
        while (minesPut < k) {
            int rand = (int) (Math.random() * m * n);
            int x = rand / n; // вот это гениальный приём, как заполнить
            int y = rand % n; // двумерный массив случайными числами, вызывая
            if (mines[x][y] == 1) continue; // random всего один раз
            mines[x][y] = 1;
            minesPut++;

        }
        for (int i = 0; i < m * n; i++) {
            int x = i / n;
            int y = i % n;
            if (mines[x][y] == 1) System.out.print("*  ");
            else {
                int index = 0;
                for (int offsetX = -1; offsetX <= 1; offsetX++) {
                    for (int offsetY = -1; offsetY <= 1; offsetY++) {
                        if (offsetX + x < 0 || offsetY + y < 0 || offsetX + x >= m
                                || offsetY + y >= n) continue;
                        index += mines[offsetX + x][offsetY + y];
                    }
                }
                System.out.print(index + "  ");
            }
            if (i % n == n - 1) System.out.println();
        }
    }
}
