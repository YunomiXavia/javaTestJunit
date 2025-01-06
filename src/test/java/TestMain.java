import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMain {

    @Test
    public void testCalculateSum() {
        Main calculator = new Main();

        // Kiểm tra tổng các số từ 1 đến 10
        assertEquals(55, calculator.calculateSum(10));

        // Kiểm tra tổng các số từ 1 đến 5
        assertEquals(15, calculator.calculateSum(5));

        // Kiểm tra tổng các số từ 1 đến 0 (kết quả là 0)
        assertEquals(0, calculator.calculateSum(0));

        // Kiểm tra tổng các số từ 1 đến 1 (kết quả là 1)
        assertEquals(1, calculator.calculateSum(1));
    }

    @Test
    public void testCalculateSumWithNegativeNumber() {
        Main calculator = new Main();

        // Kiểm tra khi số âm được đưa vào, mong đợi IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateSum(-5);
        });
    }

    @Test
    public void testCalculateSumWithInvalidLoop() {
        Main calculator = new Main();

        // Kiểm tra khi vòng lặp bị sai (n < i)
        int result = calculator.calculateSum(0);
        assertEquals(0, result);  // Vòng lặp không chạy vì i > n
    }
}
