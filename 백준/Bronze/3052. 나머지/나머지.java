import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 입력 받은 자연수 저장할 배열
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = scan.nextInt();
            // 유효성 검사
            if (nums[i] < 0 || nums[i] > 1000) {
                System.out.println("1,000보다 작거나 같고, 음이 아닌 정수");
                return;
            }
        }

        // 나머지를 저장할 배열
        boolean[] remainders = new boolean[42]; // 42로 나눈 나머지는 0~41
        // 나머지 계산 
        for (int i = 0; i < 10; i++) {
            remainders[nums[i] % 42] = true;
        }
        // 나머지 존재만 세기 
        int count = 0;
        for (boolean remainder : remainders) {
            if (remainder) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);

        scan.close();
    }
}
