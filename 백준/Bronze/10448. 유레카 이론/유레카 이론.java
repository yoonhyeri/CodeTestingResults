
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner객체 생성
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수
        for (int i = 0; i < T; i++) { 
            int K = sc.nextInt(); 

            // 정수가 3개의 삼각함수의 합으로 표현될 수 있는지 여부를 확인 
            boolean isExpressible = isExpressibleAsTriangleNumber(K);
            // 결과 출력 
            if (isExpressible) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        // Scanner 객체 닫기
        sc.close();
    }


    // 정수가 정확히 3개의 삼각수의 합으로 표현될 수 있는지를 판단하는 메소드
    private static boolean isExpressibleAsTriangleNumber(int K) {
        for (int i = 1; i <= K; i++) {
            int sum = i * (i + 1) / 2;
            for (int j = 1; j <= K; j++) {
                int sum2 = j * (j + 1) / 2;
                for (int k = 1; k <= K; k++) {
                    int sum3 = k * (k + 1) / 2;
                    if (sum + sum2 + sum3 == K) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
