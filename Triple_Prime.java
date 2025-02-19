import java.util.*;

class Triple_Prime {
  Scanner sc = new Scanner(System.in);
  int n;

  int isPrime(int p) {
    int i;
    for (i = 2; i <= n / 2; i++) {
      if (p % i == 0) {
        return 0;
      } else {
        return 1;
      }
    }
    return 1;
  }

  void input() {
    System.out.println("Enter the limit");
    n = sc.nextInt();
  }

  void print(int a) {
    int j;
    for (j = 2; j <= n - 6; j++)
      if (isPrime(a) == 1 && isPrime(a + 2) == 1 && isPrime(a + 6) == 1) {
        System.out.println("The triple prime numbers are " + a + (a + 2) + (a + 6));
      } else if (isPrime(a) == 1 && isPrime(a + 4) == 1 && isPrime(a + 6) == 1) {
        System.out.println("The triple prime numbers are " + a + (a + 4) + (a + 6));
      } else
        System.out.println("Not twin prime");
  }

  public static void main(String[] args) {
    Triple_Prime obj = new Triple_Prime();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int s = sc.nextInt();
    obj.input();
    obj.print(s);
  }
}
