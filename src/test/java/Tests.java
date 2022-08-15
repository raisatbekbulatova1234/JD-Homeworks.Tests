import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @org.junit.jupiter.api.Test
    public void testResultIsTrue() {

        int a = 5000;
        int expected = 300;
        int result = Main.taxEarningsOnly(a);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testResultNotNull() {

        int a = 50000;
        int b = 26000;
        int result = Main.taxEarningsMinusSpendings(a, b);

        Assertions.assertNotNull(result);
    }

    @Test
    public void test38e238u() {

        int a = 5000;
        int b = 700;
        int result = Main.taxEarningsOnly(a);

        Assertions.assertFalse(b == result);

    }
}
