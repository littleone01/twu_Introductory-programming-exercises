import java.util.ArrayList;
import java.util.List;

/**
 * Created by yibwang on 2/18/17.
 */
public class PrimeFactorsExercise {
    private List generate(int number) {
        List result = new ArrayList();
        int divideNumber = 2;

        while (divideNumber < number) {
            if (number % divideNumber == 0) {
                result.add(divideNumber);
                number = number / divideNumber;
            }
            divideNumber ++;
        }
        if (number == divideNumber) {
            result.add(number);
        }
        return result;
    }

    public static void main (String[] args) {
        PrimeFactorsExercise exercise = new PrimeFactorsExercise();
        System.out.println(exercise.generate(30));
    }
}
