import java.util.*;

class Twin_Prime {
    boolean isPrime(int n) {
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    void check(int a, int b) {
        if (isPrime(a) == true && isPrime(b) == true) {
            if (a - b == 2 || b - a == 2)
                System.out.println("The numbers are twin prime");
            else
                System.out.println("The numbers are not twin prime");
        } else
            System.out.println("The numbers are not twin prime ");
    }
}
