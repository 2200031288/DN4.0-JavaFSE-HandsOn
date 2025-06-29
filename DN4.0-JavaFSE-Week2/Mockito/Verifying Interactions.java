import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class InteractionTest {
    @Test
    void testVerification() {
        MyService service = mock(MyService.class);
        service.greet("Alice");

        verify(service).greet("Alice");
    }

    interface MyService {
        String greet(String name);
    }
}
