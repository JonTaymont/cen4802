// Jonathan Taymont
// 5/21/2023
// CEN-4802C

/**
 * @author Jonathan Taymont
 * @version "%I%, %G%"
 */
public class FibonacciSequence
{
    public static class RecursiveFibonacci extends Thread
    {
        public Integer n = 0;

        /**
         * A recursive method that returns the nth term in the Fibonacci sequence.
         *
         * @param n is the variable being passed into the fibonacci method.
         * @return the value of n after being passed into the fibonacci method.
         */
        int fibonacci(int n)
        {
            if (n == 0)
            {
                return 0;
            }
            if (n == 1)
            {
                return 1;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        public void run()
        {
            n = fibonacci(10);
            System.out.println("\nThe 10th term of the Fibonacci sequence is: " + n);
        }
    }

    public static void main(String[] args)
    {
        (new RecursiveFibonacci()).start();
    }
}
