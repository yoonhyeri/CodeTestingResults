import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 클래스 및 변수 선언
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected, used;

    //입력 처리 메서드. FastReader 클래스를 이용하여 빠르게 입력받습니다.
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt(); 
        M = scan.nextInt(); 
        selected = new int[M + 1];
        used = new int[N + 1];
    }

    // 재귀 함수 : 백트래킹을 이용하여 순열을 생성하는 재귀 함수입니다.
    // k값이 1로 시작하며 M+1이 되기 전까지 반복문을 통해 각 숫자를 선택하며 재귀 호출이 이루어집니다.
    static void recursive_function(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            // 가장 먼저 k=1일 때 cand=1부터 시작하여 4까지 반복됩니다.
            for (int cand = 1; cand <= N; cand++) {

                // used 값이 0이면 미사용, 1이면 사용을 뜻합니다.
                // cand = 1 일 때,
                if (used[cand]==1) continue; // used[1] 이 0이므로 사용 가능하고,
                // selected[1]에 1을 할당하고 used[1]을 사용 됨의 뜻인 1로 변경합니다.
                selected[k] = cand; used[cand] =1;
                // recursive_function함수를 만나 반복문 cand=2를 시작하지 못하고 재귀 함수 k = 2를 호출합니다.
                recursive_function(k + 1);

                //백트레킹
                selected[k] = 0; used[cand] = 0;
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