public class allcode {

    // factorial
    public static int factorialno(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // // prime numbers
    // public static boolean isPrime(int n) {

    // // corner case
    // if (n == 2) {
    // return true;
    // }

    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // optimized way of prime number
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // binary to deciaml
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("deciaml of " + myNum+ " is " + decNum);
    }

    public static void main(String[] args) {
        // System.out.println(factorialno(4));
        // primeInRange(20);
        binToDec(101);
    }
}
