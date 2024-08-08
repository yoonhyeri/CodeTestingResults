import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        // 정수의 개수 N 입력
        int N = scan.nextInt();
        // 정수를 저장할 배열
        int[] nums = new int[N];
        // 정수 입력
        for (int i = 0; i < N; i++) {
            nums[i] = scan.nextInt();
        }
        // 찾으려는 정수 V 입력
        int v = scan.nextInt();
        
        // 결과를 담을 변수 생성
        int result = 0;
        for (int i = 0; i < N; i++) {
            if ( v == nums[i]) {
                result++;
            }
        }
        System.out.println(result);
        scan.close();
    }
}
