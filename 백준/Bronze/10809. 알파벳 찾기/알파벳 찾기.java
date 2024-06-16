import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();

        // S 길이 유효성 검사
        if (!(S.length() <= 100)) {
            System.out.println("단어 S의 길이는 100을 넘지 X");
            return;
        }

        // a부터 z까지의 알파벳에 대해 처리
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // 기본값을 -1로 설정
            int position = -1;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == ch) {
                    position = i;
                    break;
                }
            }
            System.out.print(position + " ");
        }
        scan.close();
    }
}
