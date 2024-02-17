import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
    }
    static int N,M;
    static int[] selected;

    static void recursive_function(int k) {
        if (k == M + 1) {
            // 배열을 1자리부터 M자리까지 다 찾았을 때
            // selected에 찾아서 저장한 결과를 출력
            for (int i=1; i<=M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            // k번째 원소에 1~N까지 원소가 차례대로 들어올 수 있다.
            for (int cand = 1; cand <= N; cand++) {
                selected[k] = cand;
                // k+1번 ~ M번을 모두 탐색하기 위해 재귀호출
                recursive_function(k+1);
                // 탐색이 끝난 나음에 k번째 기록을 남겨둘 필요가 없기때문에 의례상 지워준다
                selected[k] = 0;
            }
        }
    }



    public static void main(String[] args) {
        //메인은 크게 입력받는 함수와 문제푸는 함수로 심플하게 나눔
        input(); // 입력을 받는 함수

        recursive_function(1); // 문제를 푸는 함수
        System.out.println(sb.toString());
    }


    //패스트리더 구현
    static class FastReader{
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
