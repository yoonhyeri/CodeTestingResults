import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        // 중복 없는 9개의 자연수 입력
        int[] nums = new int[9];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
            // 자연수 범위 유효성 검사
            if (nums[i] <= 1 || nums[i] >= 100) {
                System.out.println("입력 자연수는 100 보다 작다");
                return;
            }
        }

        int max = nums[0];
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        //결과 출력
        System.out.println(max);
        System.out.println(maxIndex + 1);
        
        scan.close();
    }
}