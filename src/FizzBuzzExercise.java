/**
 * Created by yibwang on 2/18/17.
 */
public class FizzBuzzExercise {
    private void FizzBuzz() {
        for (int i = 1; i <= 100; i ++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzzExercise exercise = new FizzBuzzExercise();
        exercise.FizzBuzz();
    }
}
