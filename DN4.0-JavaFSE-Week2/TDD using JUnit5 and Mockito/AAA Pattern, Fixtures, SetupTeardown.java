import org.junit.jupiter.api.*;

class SampleTest {

    @BeforeEach
    void setup() {
        System.out.println("Setting up test...");
    }

    @AfterEach
    void teardown() {
        System.out.println("Cleaning up after test...");
    }

    @Test
    void testSum() {
        // Arrange
        int a = 2, b = 3;

        // Act
        int result = a + b;

        // Assert
        Assertions.assertEquals(5, result);
    }
}
