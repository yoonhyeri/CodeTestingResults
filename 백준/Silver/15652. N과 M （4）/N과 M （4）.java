import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 클래스 및 변수 선언
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected;

    //입력 처리 메서드. FastReader 클래스를 이용하여 빠르게 입력받습니다.
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
    }

    //백트래킹을 이용하여 순열을 생성하는 재귀 함수입니다.
    //현재 인덱스 k가 M + 1이면, 선택된 숫자를 출력하고 함수를 종료합니다.
    //그렇지 않으면 1부터 N까지의 숫자를 선택하고 재귀 호출합니다.
    static void recursive_function(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {

            int start = selected[k - 1];
            if (start == 0) start = 1;

            for (int cand = start; cand <= N; cand++) {
                selected[k] = cand;
                recursive_function(k + 1);
                selected[k] = 0;
            }
        }
    }


    // 메인 함수
    // 입력받는 함수 input을 호출하고, 문제 푸는 함수 recursive_function를 호출합니다.
    public static void main(String[] args) {
        input(); // 입력을 받는 함수
        recursive_function(1); // 문제를 푸는 함수
        System.out.println(sb.toString());
    }

    // 입력을 빠르게 처리하는 FastReader클래스
    // BufferedReader 및 StringTokenizer을 이용하여 빠르게 입력을 처리하는 클래스입니다.
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}