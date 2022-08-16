import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClassMain {
    @org.junit.jupiter.api.Test

    public void testTaxEarningsOnlyResultIsTrue() {

        int a = 5000;
        int expected = 300;
        int result = Main.taxEarningsOnly(a);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTaxEarningsMinusSpendingsResultNotNull() {

        int a = 50000;
        int b = 26000;
        int result = Main.taxEarningsMinusSpendings(a, b);

        Assertions.assertNotNull(result);
    }

    @Test
    public void testTaxEarningsOnlyResultIsFalse() {

        int a = 5000;
        int b = 700;
        int result = Main.taxEarningsOnly(a);

        Assertions.assertFalse(b == result);

    }
}
