Here is a Python console application that performs integer division without using multiplication, division, or modulus operators:

```python
def integer_division(dividend, divisor):
    if divisor == 0:
        return "Error: Division by zero is not allowed"
    if dividend == 0:
        return 0
    if divisor > dividend:
        return 0

    count = 0
    while dividend >= divisor:
        dividend -= divisor
        count += 1
    return count

if __name__ == "__main__":
    dividend = int(input("Enter the dividend: "))
    divisor = int(input("Enter the divisor: "))
    result = integer_division(dividend, divisor)
    print("Result: ", result)
```

This console application works by subtracting the divisor from the dividend repeatedly until the dividend is less than the divisor. The number of times the subtraction is performed is the result of the division.