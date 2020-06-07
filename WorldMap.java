/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     20/5/2020
 **************************************************************************** */
// программа прошла все тесты
public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        while (!StdIn.isEmpty()) {
            StdIn.readString();
            int vertices = StdIn.readInt();
            double[] x = new double[vertices];
            double[] y = new double[vertices];
            for (int i = 0; i < vertices; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }
        StdDraw.show();
    }
}
