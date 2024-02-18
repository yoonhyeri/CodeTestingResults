import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = fibonacci(n);
        System.out.println(result);
    }

    static int[] cache = new int[50];
    static int fibonacci(int n) {


        if (n == 1 || n == 2) return 1;
        if(cache[n] != 0) return cache[n];

        cache[n] =fibonacci(n - 1) + fibonacci(n - 2);
        return cache[n];

    }
}
