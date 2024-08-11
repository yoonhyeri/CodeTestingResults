import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 바구니의 개수
        int M = scan.nextInt(); // 공 교환 횟수 

        // 유효성 검사
        if (N < 1 || N > 100 || M < 1 || M > 100) {
            System.out.println(" N (1 ≤ N ≤ 100), M (1 ≤ M ≤ 100)");
            return;
        }

        // 바구니 번호를 저장할 배열 선언과 초기화 
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = i + 1;
        }


        // 공 교환
        for (int x = 0; x < M; x++) {
            int i = scan.nextInt();
            int j = scan.nextInt();

            // 유효성 검사
            if (i < 1 || i > N || j < 1 || j > N || i > j) {
                System.out.println("(1 ≤ i ≤ j ≤ N)");
                return;
            }

            int temp = nums[i - 1];
            nums[i - 1] = nums[j - 1];
            nums[j - 1] = temp;
        }

        //결과 출력
        for (int num : nums) {
            System.out.print(num + " ");
        }

        scan.close();
    }
}