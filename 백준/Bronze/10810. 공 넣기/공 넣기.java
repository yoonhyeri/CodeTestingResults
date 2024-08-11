
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 바구니의 개수
        int M = scan.nextInt(); // 공을 넣는 방법의 수

        // N, M 유효성 검사
        if (N < 1 || N > 100 || M < 1 || M > 100) {
            System.out.println("N의 범위 1 ≤ N ≤ 100, M의 범위 1 ≤ M ≤ 100");
            return;
        }

        // 바구니 상태를 저장할 배열 생성, 초기화 0인 상태
        int[] baskets = new int[N];


       for (int x = 0; x < M; x++) {
            int i = scan.nextInt(); // 시작 바구니 번호
            int j = scan.nextInt(); // 끝 바구니 번호
            int k = scan.nextInt(); // 공의 번호

           // 입력된 i, j, k의 유효성 검사
           if (i < 1 || i > N || j < 1 || j > N || i > j || k < 1 || k > N) {
               System.out.println("(1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)");
               return;
           }

            // i번 바구니부터 j번 바구니까지 k의 공 넣음
            for (int idx = i-1; idx < j; idx++) {
                baskets[idx] = k;
            }
        }

        // 결과 출력
        for (int basket : baskets) {
            System.out.print(basket + " ");
        }

        scan.close();
    }
}
