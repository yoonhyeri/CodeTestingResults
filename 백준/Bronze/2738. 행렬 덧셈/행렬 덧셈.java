import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        // 행렬의 크기 입력
        int N = scan.nextInt();
        int M = scan.nextInt();
        // 유효성 검사
        if (N < 1 || N > 100 || M < 1 || M > 100) {
            System.out.println("N과 M은 100보다 작거나 같다");
            return;
        }

        // 행렬 A,B 선언, 초기화, 입력
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scan.nextInt();
                // 유효성 검사
                if (Math.abs(A[i][j]) > 100) {
                    System.out.println("행렬의 원소는 절댓값이 100보다 작거나 같은 정수");
                    return;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = scan.nextInt();
                // 유효성 검사
                if (Math.abs(B[i][j]) > 100) {
                    System.out.println("행렬 원소의 절댓값은 100 이하여야 합니다.");
                    return;
                }
            }
        }

        // 행렬 A,B 원소를 합한 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}