# Dự án tính tổng các số

## Mô tả

Dự án này là một chương trình Java đơn giản, mục đích chính là tính tổng các số từ 1 đến một giá trị `n` nhập vào từ người dùng. Chương trình sử dụng vòng lặp `for` để tính toán tổng của tất cả các số từ 1 đến `n`, và in kết quả ra màn hình.

Khi  chạy chương trình, nó sẽ yêu cầu nhập giá trị `n`, sau đó tính tổng các số từ 1 đến `n` và in ra kết quả. Đây là một ví dụ điển hình về cách làm việc với các phép toán cơ bản trong Java.

### Các tính năng chính:

1. **Tính tổng các số**: Dự án sử dụng hàm `calculateSum(int n)` để tính tổng từ 1 đến `n`.
2. **Kiểm thử đơn vị**: Các bài kiểm thử được thực hiện với JUnit 5 để đảm bảo độ chính xác của hàm tính tổng.
3. **Phân tích độ phủ mã (code coverage)**: Dự án sử dụng **JaCoCo** để đo lường độ phủ mã của chương trình và cung cấp báo cáo chi tiết về mức độ kiểm thử mã nguồn.

### Các hàm chính trong chương trình:

- **`calculateSum(int n)`**: Đây là hàm chính của chương trình, thực hiện tính tổng các số từ 1 đến `n`. Hàm này sử dụng vòng lặp `for` để cộng dồn các giá trị và trả về tổng cuối cùng.
- **`main(String[] args)`**: Hàm `main` là điểm bắt đầu khi chương trình được chạy. Nó khởi tạo một đối tượng của lớp `Main`, gọi phương thức `calculateSum()` để tính tổng và sau đó in kết quả ra màn hình.

## Cấu trúc dự án

Dự án được tổ chức thành các thành phần sau:

- **Main.java**: Đây là tệp chứa lớp `Main` và phương thức `calculateSum()`, nơi thực hiện phép tính tổng các số từ 1 đến `n`.
- **TestMain.java**: Tệp chứa các bài kiểm thử sử dụng JUnit 5 để kiểm tra chức năng của hàm `calculateSum()`.
- **pom.xml**: Tệp cấu hình Maven, giúp quản lý phụ thuộc và cấu hình các plugin, bao gồm cả JUnit và JaCoCo.

### Các thư mục và tệp quan trọng:
- **src/main/java**: Chứa mã nguồn chính của dự án.
- **src/test/java**: Chứa các bài kiểm thử.
- **rget**: Chứa các tệp biên dịch và báo cáo độ phủ mã.

## Mã nguồn

### Main.java

```java
package org.example;

public class Main {
    // Hàm tính tổng các số từ 1 đến n
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Hàm main thực thi chương trình
    public stic void main(String[] args) {
        Main calculator = new Main();
        int n = 10; // Tính tổng từ 1 đến 10
        int result = calculator.calculateSum(n);
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + result);
    }
}
```

### TestMain.java

```java
package org.example;

import org.junit.jupiter.api.Test;
import stic org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    
    @Test
    public void testCalculateSum() {
        Main calculator = new Main();
        
        // Kiểm tra tổng các số từ 1 đến 10
        assertEquals(55, calculator.calculateSum(10));
        
        // Kiểm tra tổng các số từ 1 đến 5
        assertEquals(15, calculator.calculateSum(5));
    }
}
```
### Hình ảnh báo cáo JaCoCo

Dưới đây là các hình ảnh minh họa quá trình sử dụng JaCoCo để đo lường độ phủ mã:

- **Hình ảnh về hàm `Main`**:
  ![Main](./images/main.jpg)

- **Hình ảnh về các bài kiểm thử trong `TestMain`**:
  ![Test](./images/test.jpg)

- **Hình ảnh quá trình xây dựng và báo cáo JaCoCo**:
  ![Build_Jacoco](./images/build_jacoco.jpg)

- **Hiển thị báo cáo độ phủ mã (coverage)**:
  ![Show_Coverage](./images/show_coverage_1.jpg)
  ![Show_Coverage_2](./images/show_coverage_2.jpg)
  ![Show_Coverage_3](./images/show_coverage_3.jpg)
