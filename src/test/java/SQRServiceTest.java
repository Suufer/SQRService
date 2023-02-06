import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testCountSquaredNumbers() {
        SQRService service = new SQRService();
        int count = service.countSquaredNumbers(200, 300);
        Assertions.assertEquals(3, count);
    }
}
