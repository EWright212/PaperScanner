import java.lang.reflect.Array;
import java.util.Arrays;

public class MathsPaperScanner {
    public int evaluate(String expression) {
        String[] component = expression.split(" ");
        var result = Integer.parseInt(component[0]);

        for (int i = 2; i < component.length; i += 2) {
            if (component[i - 1].equals("*")) {
                result *= Integer.parseInt(component[i]);
            } else if (component[i - 1].equals("-")) {
                result -= Integer.parseInt(component[i]);
            } else if (component[i - 1].equals("/")) {
                result /= Integer.parseInt(component[i]);
            } else {
                result += Integer.parseInt(component[i]);
            }
        }

        return result;
    }
}
