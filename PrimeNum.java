public class PrimeNum {
    public static void main(String[] args) {
        int primeCount = 0;
        int num = 2;
        while (primeCount < 10) {
            if (isPrime(num)) {
                System.out.println(num);
                primeCount++;
            }
            num++;
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}