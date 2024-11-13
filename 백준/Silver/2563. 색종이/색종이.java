import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt(); // 색종이 수
        int[][] cell = new int[100][100]; // 도화지를 100*100개의 cell로 나눈 grid

        // 색종이 좌측 하단 꼭짓점 좌표
        for (int i = 0; i < cnt; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            // 색종이가 있는 cell을 1로 초기화
            for (int dx = x; dx < x + 10; dx++) {
                for (int dy = y; dy < y+10; dy++) {
                    cell[dx][dy] = 1;
                }
            }
        }

        // grid에 색종이가 있는 cell 모두 합하기
        int grid = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (cell[i][j] == 1) {
                    grid++;
                }
            }
        }

        // 결과출력
        System.out.println(grid);
        scan.close();
    }
}
