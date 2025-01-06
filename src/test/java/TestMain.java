import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testSum() {
        Main calculator = new Main();

        // Test case 1: Tính tổng từ 1 đến 5, kết quả là 15 (1+2+3+4+5)
        int result = calculator.calculateSum(5);
        assertEquals(15, result);

        // Test case 2: Tính tổng từ 1 đến 10, kết quả là 55 (1+2+3+...+10)
        result = calculator.calculateSum(10);
        assertEquals(55, result);

        // Test case 3: Tính tổng từ 1 đến 0, kết quả là 0
        result = calculator.calculateSum(0);
        assertEquals(0, result);

        // Test case 4: Tính tổng từ 1 đến 1, kết quả là 1
        result = calculator.calculateSum(1);
        assertEquals(1, result);
    }
}
