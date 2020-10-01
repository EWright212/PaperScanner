import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathsPaperScannerTest {

    private MathsPaperScanner mathsPaperScanner = new MathsPaperScanner();

    @Test
    public void simpleAdditionTwoIntegers(){
        assertEquals(2, mathsPaperScanner.evaluate("1 + 1"));
        assertEquals(4, mathsPaperScanner.evaluate("2 + 2"));

    }
}
