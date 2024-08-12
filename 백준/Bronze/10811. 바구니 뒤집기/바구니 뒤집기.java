import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 가지고 있는 바구니 수
        int M = scan.nextInt(); // 역순 작업을 반복할 횟수

        // 유효성 검사
        if (N < 1 || N > 100 || M < 1 || M > 100) {
            System.out.println(" N 범위 : 1 ≤ N ≤ 100, M 범위 : 1 ≤ M ≤ 100");
            return;
        }

        // 바구니의 번호를 저장할 배열 선언과 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;

        }

        // 역순 작업
        while (M-- > 0) {
            int i = scan.nextInt();
            int j = scan.nextInt();

            // 유효성 검사
            if (i < 1 || j < 1 || i > N || j > N || i > j) {
                System.out.println("1 ≤ i ≤ j ≤ N");
                return;
            }

            reverse(baskets, i - 1, j - 1);
        }
        // 결과 출력
        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
        scan.close();
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
