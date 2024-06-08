
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        if (word.length() > 100) {
            return;
        } else {
            int result = word.length();
            System.out.println(result);
        }
    }
}