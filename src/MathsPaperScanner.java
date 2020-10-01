import java.lang.reflect.Array;
import java.util.Arrays;

public class MathsPaperScanner {
    public int evaluate(String expression) {

        String[] component = expression.split(" ");
        var result = 0;

//        For debugging
        System.out.print(Arrays.toString(component));

        result += Integer.parseInt(component[0]);
        result += Integer.parseInt(component[2]);


        return result;
    }
}
