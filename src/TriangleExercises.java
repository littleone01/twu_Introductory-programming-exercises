/**
 * Created by yibwang on 2/18/17.
 */
public class TriangleExercises {
    private void drawHorizontalLine(int count) {
        String result = "";
        for (int i = 0; i < count; i ++) {
            result += "*";
        }
        System.out.println(result);
    }

    private void printOneAsterisk(){
        System.out.println("*");
    }

    private void drawVerticalLine(int count) {
        for (int i = 0; i < count; i ++) {
            System.out.println("*");
        }
    }

    private void drawRightTriangle(int count) {
        for (int i = 0; i < count; i ++) {
            drawHorizontalLine(i + 1);
        }
    }

    public static void main(String[] args) {
        TriangleExercises exercises = new TriangleExercises();
        exercises.printOneAsterisk();
        exercises.drawHorizontalLine(8);
        exercises.drawVerticalLine(3);
        exercises.drawRightTriangle(3);
    }
}
