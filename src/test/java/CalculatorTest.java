import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void tesSum() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSumWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.sum(0, 0));
    }
}
