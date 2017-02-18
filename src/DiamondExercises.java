/**
 * Created by yibwang on 2/18/17.
 */
public class DiamondExercises {
    private void IsoscelesTriangle(int count) {
        int length = count * 2 - 1;
        for (int i = 0; i < count; i ++) {
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

    public static void main(String[] args) {
        DiamondExercises exercises = new DiamondExercises();
        exercises.IsoscelesTriangle(3);
    }
}
