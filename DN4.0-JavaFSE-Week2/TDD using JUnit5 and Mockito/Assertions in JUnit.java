import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    @Test
    void testStringEquality() {
        String s = "Java";
        assertNotNull(s);
        assertEquals("Java", s);
        assertTrue(s.startsWith("J"));
    }
}
