import java.lang.reflect.Array;
import java.util.Arrays;

public class MathsPaperScanner {
    public int evaluate(String expression) {

        String[] component = expression.split(" ");
        var result = 0;
        var firstInt = Integer.parseInt(component[0]);
        var secondInt = Integer.parseInt(component[2]);
        String operator = component[1];

        if (operator.equals("*")) {
            result = (firstInt * secondInt);
        } else if (operator.equals("-")){
            result += firstInt;
            result -= secondInt;
        } else {
            result += firstInt;
            result += secondInt;
        }

//        For debugging

        return result;
    }
}
