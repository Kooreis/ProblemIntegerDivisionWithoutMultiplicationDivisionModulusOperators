Here is a simple Java console application that performs integer division without using multiplication, division, or modulus operators:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dividend:");
        int dividend = scanner.nextInt();
        System.out.println("Enter divisor:");
        int divisor = scanner.nextInt();
        int quotient = divide(dividend, divisor);
        System.out.println("Quotient is: " + quotient);
    }

    private static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }

        if (dividend < divisor) {
            return 0;
        }

        int quotient = 1;
        int tempDivisor = divisor;

        while (tempDivisor < dividend) {
            tempDivisor <<= 1;
            quotient <<= 1;
        }

        if (tempDivisor > dividend) {
            tempDivisor >>= 1;
            quotient >>= 1;
        }

        return quotient + divide(dividend - tempDivisor, divisor);
    }
}
```

This program uses bitwise shift operators to perform the division. The `divide` method recursively subtracts the divisor from the dividend until the dividend is less than the divisor. The quotient is calculated by shifting bits to the left, effectively doubling the value, until the divisor is greater than the dividend. If the divisor becomes greater than the dividend, it is shifted back to the right and the quotient is also shifted back to the right. The final quotient is the sum of the current quotient and the quotient of the remaining dividend and the divisor.