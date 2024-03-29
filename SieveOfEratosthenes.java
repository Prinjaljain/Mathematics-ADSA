import java.util.*;

public class SieveOfEratosthenes {
    // print all the prime numbers smaller or equal to the given number
    static void sieve(int n) {
        if (n <= 1)
            return;

        boolean isPrime[] = new boolean[n + 1];

        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        sieve(n);
    }
}
