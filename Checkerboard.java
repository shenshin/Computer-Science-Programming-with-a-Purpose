/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     20/5/2020
 **************************************************************************** */
// программа прошла все тесты
public class Checkerboard {
    public static void main(String[] args) {
        int n = Math.abs(Integer.parseInt(args[0]));
        if (n == 0) n = 1;
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(0, n);
        // флаг для отслеживания чередования разноцветных квадратов
        boolean x = true;
        boolean even = n % 2 == 0; // четное ли n
        // отношение длины стороны квадратика к (высоте окна)/n
        // если это 1, то высота маленького квадрата равна высоте окна делить на n
        double len = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // установить синий цвет если флаг установлен в true
                if (x) StdDraw.setPenColor(StdDraw.BLUE);
                    // в другом случае установить серый цвет
                else StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                double xCoord = i * len + len / 2;
                double yCoord = j * len + len / 2;
                StdDraw.filledSquare(xCoord, yCoord,
                                     len / 2);
                x = !x; // изменить значение флага на противоположное
            }
            // изменить значение флага при переходе к следующей строке
            // только если n четное. Это подгонка под ответ. не знаю почему так
            x = even != x; // x равно не х только если even
        }
        StdDraw.show();
    }
}
