import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        //문자 입력 받음
        String S = scan.nextLine();
        if (S.length() > 1000000) {
            System.out.println("문자열의 길이는 1,000,000을 넘지 않는다.");
            return;
        }

        // 문자열 양 끝 공백 제거
        S = S.trim();

        // 입력된 문자열이 공백인 경우
        if (S.isEmpty()) {
            System.out.println(0);
        } else {
            int cnt = 0;
            for (int i = 0; i < S.length(); i++) {
                 if (S.charAt(i) == ' ') {
                    cnt++;
                }
            }
            System.out.println(cnt + 1);
        }
        scan.close();
    }
}
