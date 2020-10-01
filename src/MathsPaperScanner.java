import java.lang.reflect.Array;
import java.util.Arrays;

public class MathsPaperScanner {
    public int evaluate(String expression) {
        String[] component = expression.split(" ");
        var result = 0;
        var firstInt = Integer.parseInt(component[0]);
        var secondInt = Integer.parseInt(component[2]);

        String operator = component[1];
        result = firstInt;

        if (operator.equals("*")) {
            result *= secondInt;
        } else if (operator.equals("-")) {
            result -= secondInt;
        } else if (operator.equals("/")) {
            result /= secondInt;
        } else {
            result += secondInt;
        }

        if (component.length > 3){
            var thirdInt = Integer.parseInt(component[4]);
            result += thirdInt;

        }
        return result;
    }
}
