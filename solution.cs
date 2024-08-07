```C#
using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter the dividend: ");
        int dividend = Convert.ToInt32(Console.ReadLine());

        Console.Write("Enter the divisor: ");
        int divisor = Convert.ToInt32(Console.ReadLine());

        int quotient = Divide(dividend, divisor);

        Console.WriteLine("The quotient is: " + quotient);
    }

    static int Divide(int dividend, int divisor)
    {
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.Abs(dividend);
        divisor = Math.Abs(divisor);

        int quotient = 0;

        while (dividend >= divisor)
        {
            dividend -= divisor;
            ++quotient;
        }

        return sign * quotient;
    }
}
```