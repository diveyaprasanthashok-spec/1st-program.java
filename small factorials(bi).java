import java.util.*;
import java.math.BigInteger;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            BigInteger fact = BigInteger.ONE;

            for (int i = 1; i <= N; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }

            System.out.println(fact);
        }

        sc.close();
    }
}
