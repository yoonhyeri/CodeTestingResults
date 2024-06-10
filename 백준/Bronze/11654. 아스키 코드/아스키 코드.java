import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // 입력 길이 유효성 검사
        if (str.length() != 1) {
            return;
        }

        char ch = str.charAt(0);

        // 문자 유효성 검사
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            System.out.println((int) ch);
        } else {
            System.out.println("알파벳 소문자, 대문자, 숫자 0-9 중 하나");
        }
        scan.close();
    }
}
