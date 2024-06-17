import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 0; t < T; t++) {
            int R = scan.nextInt();
            String S = scan.next();
            StringBuilder P = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                for (int j = 0; j < R; j++) {
                    P.append(c);
                }
            }
            System.out.println(P);
        }
        scan.close();
    }
}



