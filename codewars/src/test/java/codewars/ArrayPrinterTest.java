package codewars;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayPrinterTest {
    @Test
    @DisplayName("Example test")
    void testInteger() {
      Integer[] array = new Integer[] { 2, 4, 5, 2 };
      assertEquals("2,4,5,2", ArrayPrinter.printArray(array), "Testing with: [2, 4, 5, 2]");
    }
}