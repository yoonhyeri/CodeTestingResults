import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        // 첫째줄에 입력 받는 N과 X
        int N = scan.nextInt();
        int X = scan.nextInt();

        // 수열 A를 이루는 N개의 정수를 저장할 배열 생성
        int[] A = new int[N];

        // 수열 A의 정수를 배열에 입력
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        // 수열 내 X보다 작은 수 출력
        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }

        // Scanner 객체 닫기
        scan.close();
    }
}
