import java.util.Scanner;

public class Main {
    
    // 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오
    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);
        
        // 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다.
        String S = scan.nextLine();
        // 단어의 길이는 최대 1000이다.
        if (S.length() > 1000) {
            System.out.println("단어의 길이는 최대 1000이다.");
            scan.close();
            return;
        }

        // 둘째 줄에 정수 i가 주어진다.
        try {

            int i = Integer.parseInt(scan.nextLine());
            //  (1 <= i <= |S|)
            if (i < 1 || i > S.length()) {
                System.out.println("(1 <= i <= |S|)");
            } else {
                char result = S.charAt(i - 1);
                System.out.println(result);
            }
            scan.close();
        } catch (NumberFormatException e) {
            System.out.println("숫자아님");
        }
    }


}
