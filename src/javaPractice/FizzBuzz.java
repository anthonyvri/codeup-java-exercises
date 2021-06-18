package javaPractice;
import java.util.*;
class FizzBuzz {
    public static void main(String args[]) {
        int n = 100;

        // loop for 100 times
        for (int i = 1; i <= n; i++) {
            //number divisible by 15(divisible by
            // both 3 & 5), print 'FizzBuzz' in
            // place of the number
            if (i % 15 == 0)
                System.out.print("FizzBuzz" + " ");
                // number divisible by 5, print 'Buzz'
                // in place of the number
            else if (i % 5 == 0)
                System.out.print("Buzz" + " ");

                // number divisible by 3, print 'Fizz'
                // in place of the number
            else if (i % 3 == 0)
                System.out.print("Fizz" + " ");

            else // print the numbers
                System.out.print(i + " ");
        }
    }

    public Boolean isPrime(Integer n) {
        boolean isPrime = true;

        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public Integer fibonacci(Integer n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
