public class MathsPaperScanner {
    public int evaluate(String expression) {
        String[] component = expression.split(" ");
        var result = Integer.parseInt(component[0]);

        for (int i = 2; i < component.length; i += 2) {
            Integer currentNumber = Integer.parseInt(component[i]);
            String operator = component[i - 1];
            if (operator.equals("*")) {
                result *= currentNumber;
            } else if (operator.equals("-")) {
                result -= currentNumber;
            } else if (operator.equals("/")) {
                result /= currentNumber;
            } else {
                result += currentNumber;
            }
        }

        return result;
    }
}
