import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathsPaperScannerTest {

    private MathsPaperScanner mathsPaperScanner = new MathsPaperScanner();

    @Test
    public void simpleAdditionTwoIntegers() {
        assertEquals(2, mathsPaperScanner.evaluate("1 + 1"));
        assertEquals(4, mathsPaperScanner.evaluate("2 + 2"));
    }

    @Test
    public void simpleMultiplicationTwoIntegers() {
        assertEquals(1, mathsPaperScanner.evaluate("1 * 1"));
        assertEquals(5, mathsPaperScanner.evaluate("5 * 1"));
        assertEquals(15, mathsPaperScanner.evaluate("5 * 3"));
    }

    @Test
    public void simpleSubtractionTwoIntegers() {
        assertEquals(1, mathsPaperScanner.evaluate("2 - 1"));
        assertEquals(5, mathsPaperScanner.evaluate("15 - 10"));

    }

    @Test
    public void simpleDivisionTwoIntegers() {
        assertEquals(3, mathsPaperScanner.evaluate("6 / 2"));
        assertEquals(3, mathsPaperScanner.evaluate("12 / 4"));
    }

    @Test
    public void simpleAdditionMultipleIntegers() {
        assertEquals(3, mathsPaperScanner.evaluate("1 + 1 + 1"));
        assertEquals(4, mathsPaperScanner.evaluate("1 + 1 + 1 + 1"));

    }

    @Test
    public void simpleMultiplicationMultipleIntegers() {
        assertEquals(8, mathsPaperScanner.evaluate("2 * 2 * 2"));
        assertEquals(27, mathsPaperScanner.evaluate("3 * 3 * 3"));

    }
    @Test
    public void simpleDivisionMultipleIntegers() {
        assertEquals(2, mathsPaperScanner.evaluate("8 / 2 / 2"));
        assertEquals(3, mathsPaperScanner.evaluate("27 / 3 / 3"));

    }
    @Test
    public void simpleSubtractionMultipleIntegers() {
        assertEquals(4, mathsPaperScanner.evaluate("8 - 2 - 2"));
        assertEquals(5, mathsPaperScanner.evaluate("10 - 3 - 2"));

    }

}
