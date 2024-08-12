import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 시험 본 과목의 개수
        //유효성 검사
        if (N > 1000) {
            System.out.println("시험 본 과목의 개수는 1000보다 작거나 같다");
            return;
        }

        // 성적을 저장할 배열 선언과 초기화
        int[] scores = new int[N];
        int max = 0; // 최고점
        for (int i = 0; i < N; i++) {

            scores[i] = scan.nextInt();
            // 유효성 검사
            if (scores[i] > 100 || scores[i] < 0) {
                System.out.println("100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다");
                return;
            }

            if (scores[i] > max) {
                max = scores[i];
            }
        }

        // 성적 조작
        double total = 0.0;
        for (int score : scores) {
            total += (double) score / max * 100;
        }

        // 결과 출력
        System.out.println(total / N);

        scan.close();
    }
}
