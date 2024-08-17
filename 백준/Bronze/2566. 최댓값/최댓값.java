
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);
        // 9x9 격자판을 저장할 2차원 배열 선언
        int[][] table = new int[9][9];

        int maxValue = 0; // 최댓값 저장 변수
        int maxRow = 0; // 최댓값 행 저장 변수
        int maxCol = 0; // 최댓값 열 저장 변수 선언과 초기화

        // 격자판의 값 입력
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                table[i][j] = scan.nextInt();
                // 유효성 검사
                if (table[i][j] < 0 || table[i][j] >= 100) {
                    System.out.println("주어지는 수는 100보다 작은 자연수 또는 0이다.");
                    return;
                }

                if (table[i][j] > maxValue) {
                    maxValue = table[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // 결과 출력
        System.out.println(maxValue);
        // 인덱스는 1부터 시작하므로 1을 더해준다.
        System.out.println((maxRow + 1) + " " + (maxCol + 1));

        scan.close();
    }
}
