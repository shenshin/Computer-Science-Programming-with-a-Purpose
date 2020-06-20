/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.awt.Color;

public class FractalDrawings {

    public static void main(String[] args) {
        // number of iterations
        int trials = Integer.parseInt(args[0]);
        drawFractals(trials);
    }

    public static void drawFractals(int trials) {
        // probability distribution for choosing each rule
        double[] dist = StdArrayIO.readDouble1D();

        // update matrices
        double[][] cx = StdArrayIO.readDouble2D();
        double[][] cy = StdArrayIO.readDouble2D();

        // current value of (x, y)
        double x = 0.0;
        double y = 0.0;
        Color[] colors = {
                Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE, Color.MAGENTA, Color.CYAN,
                Color.YELLOW
        };
        // do trials iterations of the chaos game
        StdDraw.enableDoubleBuffering();
        for (int t = 0; t < trials; t++) {

            // pick a random rule according to the probability distribution
            int r = StdRandom.discrete(dist);
            StdDraw.setPenColor(colors[r]);
            // do the update
            double x0 = cx[r][0] * x + cx[r][1] * y + cx[r][2];
            double y0 = cy[r][0] * x + cy[r][1] * y + cy[r][2];
            // StdDraw.line(x, y, x0, y0);
            x = x0;
            y = y0;

            // draw the resulting point
            StdDraw.point(x, y);

            // for efficiency, display only every 100 iterations
            if (t % 100 == 0) {
                StdDraw.show();
                StdDraw.pause(10);
            }
        }

        // ensure everything gets drawn
        StdDraw.show();
    }
}
