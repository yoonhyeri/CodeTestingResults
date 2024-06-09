import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        try {
            // 테스트 케이스 개수 입력
            int T = Integer.parseInt(scan.nextLine());
            // 테스트 케이스 개수 유효성 검사
            if (T < 1 || T > 10) {
                System.out.println("1 ≤ 테스트 케이스 수 ≤ 10");
                return;
            }

            for (int i = 0; i < T; i++) {
                String str = scan.nextLine();
                // [A-Z]+ : 하나 이상의 대문자 알파벳(A~Z)가 연속적으로 나오는지 검사
                if (!str.matches("[A-Z]+")) {
                    System.out.println("문자열은 알파벳 A~Z 대문자");
                    continue;
                }
                // 문자열의 길이는 1000보다 작음
                if (str.length() >= 1000) {
                    System.out.println("문자열의 길이가 1000보다 작음");
                    continue;
                }
                System.out.println("" + str.charAt(0) + str.charAt(str.length() - 1));
            }
        } catch (NumberFormatException e) {
            System.out.println("테스트 케이스 T, 유효한 숫자를 입력" );
        }
        scan.close();

    }
}
