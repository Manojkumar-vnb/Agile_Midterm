import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    @Test
    void testConversion() {
        TemperatureConverter tc = new TemperatureConverter();
        assertEquals(32.0, tc.convert(0), 0.001);
        assertEquals(212.0, tc.convert(100), 0.001);
    }
}
