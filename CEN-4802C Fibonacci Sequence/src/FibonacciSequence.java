// Jonathan Taymont
// 5/21/2023
// CEN-4802C

public class FibonacciSequence
{
    public static class RecursiveFibonacci extends Thread
    {
        public Integer n = 0;
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
