import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        // 정수의 개수 N 입력
        int N = scan.nextInt();

        // 정수를 저장할 배열 생성
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scan.nextInt();
        }

        // 최솟값 최대값을 최조의 정수로 초기화
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < N; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // 최솟값과 최댓값 출력
        System.out.println(min + " " + max);

        // Scanner 객체 닫기
        scan.close();
    }
}
