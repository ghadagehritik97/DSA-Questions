package mixedQuestions;

import java.util.List;

/**
 * Utility to check prime numbers in a list.
 * Refactored: fixes incorrect logic (counting divisors starting at 1), removes duplicate prints,
 * and optimizes by checking up to sqrt(n) and skipping even divisors.
 */
public class PrimeNumber {

    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Prime numbers in the list:");
        numList.stream()
               .filter(PrimeNumber::isPrime)
               .forEach(num -> System.out.println(num + " is a prime number"));
        
        System.out.println("\nNon-prime numbers in the list:");
        numList.stream()
               .filter(num -> !isPrime(num))
               .forEach(num -> System.out.println(num + " is not a prime number"));
    }

    /**
     * Returns true if n is prime, false otherwise.
     * Uses optimized checks: <=1 false, 2 true, even numbers false, and tests odd divisors up to sqrt(n).
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
