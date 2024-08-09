private static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }

        if (dividend < divisor) {
            return 0;
        }

        int quotient = 1;
        int tempDivisor = divisor;
    }