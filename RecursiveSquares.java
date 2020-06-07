/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     7/6/2020
 **************************************************************************** */

public class RecursiveSquares {
    // Draws a square centered on (x, y) of the given side length
    // with a light gray background and a black border.
    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, length / 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, length / 2);
    }

    // Draws a recursive square pattern of order n, centered on (x, y)
    // of the given side length.
    public static void draw(int n, double x, double y, double length) {
        if (n != 0) {
            draw(n - 1, x + length / 2, y + length / 2, length / 2); // upper right
            draw(n - 1, x - length / 2, y + length / 2, length / 2); // upper left
            drawSquare(x, y, length);
            draw(n - 1, x + length / 2, y - length / 2, length / 2); // lower right
            draw(n - 1, x - length / 2, y - length / 2, length / 2); // lower left
        }
    }

    // Takes an integer command-line argument n and draws a recursive
    // square pattern of order n, centered on (0.5, 0.5) with side length 0.5.
    public static void main(String[] args) {
        int n = Math.abs(Integer.parseInt(args[0]));
        double x = 0.5;
        double y = 0.5;
        double length = 0.5;
        draw(n, x, y, length);
    }
}
