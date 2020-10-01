public class MathsPaperScanner {
    public int evaluate(String expression) {
        String[] component = expression.split(" ");
        var result = Integer.parseInt(component[0]);

        for (int i = 2; i < component.length; i += 2) {
            Integer currentNumber = Integer.parseInt(component[i]);
            if (component[i - 1].equals("*")) {
                result *= currentNumber;
            } else if (component[i - 1].equals("-")) {
                result -= currentNumber;
            } else if (component[i - 1].equals("/")) {
                result /= currentNumber;
            } else {
                result += currentNumber;
            }
        }

        return result;
    }
}
