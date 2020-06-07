/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Animation {
    public static void main(String[] args) {
        double rx = 0.480;
        double ry = 0.860;
        double vx = 0.015;
        double vy = 0.023;
        double radius = 0.05;
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        while (true) {
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.filledSquare(0, 0, 1);
            if (Math.abs(rx + vx) + radius > 1) vx = -vx;
            if (Math.abs(ry + vy) + radius > 1) vy = -vy;
            rx += vx;
            ry += vy;
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show(10);

        }
    }
}
