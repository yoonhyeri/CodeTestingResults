import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        // 5개의 단어를 저장할 배열 선언과 입력
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = scan.nextLine();
            // 유효성 검사
            if (words[i].length() < 1 || words[i].length() > 15) {
                System.out.println("최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다");
                return;
            }
        }

        // 2차원 배열에 단어를 문자 단위로 저장
        char[][] table = new char[5][15];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                table[i][j] = words[i].charAt(j);
            }
        }

        // 세로로 읽어서 출력
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                // 값이 null (\u0000)이 아니면 출력
                if (table[i][j] != '\u0000')
                    System.out.print(table[i][j]);
            }
        }
        
        scan.close();
    }
}

