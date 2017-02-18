/**
 * Created by yibwang on 2/18/17.
 */
public class DiamondExercises {
    private void isoscelesTriangle(int count) {
        int length = count * 2 - 1;
        drawTriangle(length, count);
    }

    private void drawTriangle(int length, int height) {
        for (int i = 0; i < height; i ++) {
            int asteriskLength = i * 2 + 1;
            drawLineInCenter(asteriskLength, length);
        }
    }

    private void reverseTriangleInDiamond(int length, int count) {
        for (int i = count - 1; i >= 0; i --) {
            int asteriskLength = i * 2 + 1;
            drawLineInCenter(asteriskLength, length);
        }
    }

    private void drawLineInCenter(int count, int length) {
        String line = "";
        int spaceCountBefore = (length - count) / 2;
        for (int i = 0; i < spaceCountBefore; i ++) {
            line += " ";
        }
        for (int i = 0; i < count; i ++) {
            line += "*";
        }
        System.out.println(line);
    }

    private void drawDiamond(int count) {
        int length = count * 2 - 1;
        drawTriangle(length, count);
        reverseTriangleInDiamond(length, count - 1);
    }

    private void drawDiamondWithName (int count, String name) {
        int length = count * 2 - 1;
        drawTriangle(length, count - 1);
        System.out.println(name);
        reverseTriangleInDiamond(length, count - 1);
    }

    public static void main(String[] args) {
        DiamondExercises exercises = new DiamondExercises();
        exercises.isoscelesTriangle(3);
        exercises.drawDiamond(3);
        exercises.drawDiamondWithName(3, "Bill");
    }
}
