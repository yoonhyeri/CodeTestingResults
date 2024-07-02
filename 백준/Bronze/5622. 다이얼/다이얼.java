import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 위한 객체 생성 
        Scanner scan = new Scanner(System.in);
        // 문자열 입력
        String s = scan.nextLine();
        // 입력받은 문자열 유효성 검사 
        if (s.length() < 2 || s.length() > 15) {
            System.out.println("단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다");
            return;
        }
        // 결과를 담을 result
        int result = 0;
        // 문자열 순회 
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            // 해당 문자열에 대한 값 필터링 후 결과에 더함 
            if (c == 'A' || c == 'B' || c == 'C') {
                result += 3;
            } else if (c == 'D' || c == 'E' || c == 'F') {
                result += 4;
            }else if (c == 'G' || c == 'H' || c == 'I') {
                result += 5;
            }else if (c == 'J' || c == 'K' || c == 'L') {
                result += 6;
            }else if (c == 'M' || c == 'N' || c == 'O') {
                result += 7;
            }else if (c == 'P' || c == 'Q' || c == 'R' || c =='S') {
                result += 8;
            }else if (c == 'T' || c == 'U' || c == 'V') {
                result += 9;
            }else if (c == 'W' || c == 'X' || c == 'Y' || c =='Z') {
                result += 10;
            }
        }
        System.out.println(result);
        scan.close();
    }
}
