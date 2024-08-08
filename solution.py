def integer_division(dividend, divisor):
    if divisor == 0:
        return "Error: Division by zero is not allowed"
    if dividend == 0:
        return 0
    if divisor > dividend:
        return 0