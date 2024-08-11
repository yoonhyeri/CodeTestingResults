import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        // 학생 30명에 대한 배열 선언, 기본값은 false
        boolean[] submitted = new boolean[30 + 1]; // 0은 사용 x

        // 제출한 학생 번호 입력
        for (int i = 1; i <= 28; i++) {
            int studentNumber = scan.nextInt();

            // 학생 번호 유효성 검사
            if (studentNumber < 1 || studentNumber > 30) {
                System.out.println("(1 ≤ 번호 ≤ 30)");
                return;
            }
            // 해당 학생 번호는 제출 상태를 참으로 변경 
            submitted[studentNumber] = true;
        }

        // 결과 출력
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }
        
        scan.close();
    }
}