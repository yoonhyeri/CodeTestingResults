import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);
        // 테스트 케이스의 개수 입력
        int T = scan.nextInt();
        // 테스트 케이스 개수 유효성 검사
        if (T < 1 || T > 1000) {
            System.out.println("테스트 케이스 개수 T, 1 ≤ T ≤ 1,000");
            return;
        }
        // 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            // 테스트 케이스 반복 횟수
            int R = scan.nextInt();
            // 테스트 케이스 반복 횟수 유효성 검사
            if (R < 1 || R > 8) {
                System.out.println("테스트 케이스는 반복 횟수 R, (1 ≤ R ≤ 8)");
                return;
            }
            // 압력받는 문자
            String S = scan.next();
            // 입력받는 문자 유효성 검사
            if (S.length() < 1 || S.length() > 20) {
                System.out.println("S의 길이는 적어도 1이며, 20글자를 넘지 않는다.");
                return;
            }
            // 새로운 문자열 P 생성
            StringBuilder P = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                for (int j = 0; j < R; j++) {
                    P.append(c);
                }
            }
            // 결과 출력
            System.out.println(P.toString());
        }
        // Scanner 객체 닫기
        scan.close();
    }
}
