import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ServiceTest {
    @Test
    void testServiceMock() {
        MyService service = mock(MyService.class);
        when(service.greet("John")).thenReturn("Hello John");

        assert "Hello John".equals(service.greet("John"));
    }

    interface MyService {
        String greet(String name);
    }
}
