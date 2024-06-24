import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        // 세 자리 수 입력 * 2
        String A = scan.next();
        String B = scan.next();
        
        // 숫자 유효성 검사 (세 자리 수, 0 포함 x )
        if (A.length() != 3 || B.length() != 3 || A.contains("0") || B.contains("0")) {
            return;
        }

        String reversedA = new StringBuilder(A).reverse().toString();
        String reversedB = new StringBuilder(B).reverse().toString();

        int numA = Integer.parseInt(reversedA);
        int numB = Integer.parseInt(reversedB);

        if (numA > numB) {
            System.out.println(numA);
        } else {
            System.out.println(numB);
        }
        scan.close();
    }
}
