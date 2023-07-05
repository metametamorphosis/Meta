import java.util.*;

public class Main {
    public static void main(String[] args) {
        var primes = getPrimes(100);
        System.out.println(primes.get(primes.size() - 1));
    }
    public static List<Integer> getPrimes(int count) {
        List<Integer> primes = new ArrayList<>();
        if (count > 0) {
            primes.add(2);
            for (int i = 3; primes.size() < count; i += 2) {
                if (isPrime(i, primes)) primes.add(i);
            }
        }
        return primes;
    }
    public static boolean isPrime (int number, List<Integer> primes) {
        double sqrt = Math.sqrt(number);
        for (int n: primes) {
            if (n > sqrt) return true;
            if (number % n == 0) return false;
        }
        return true;
    }
}