package BaekJoon.BASIC;

// 과제 골드바흐의 추측 6588
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 1000000;

        boolean[] check = new boolean[max + 1];

        check[0] = check[1] = true;

        for (int i = 2; i * i <= max; i++) {
            if (check[i]) continue;
            for (int j = i + i; j <= max; j += i) {
                check[j] = true;
            }
        }
        String input = "";
        while (!(input = br.readLine()).equals("0")) {
            int end = Integer.parseInt(input);
            boolean bool = false;
            for (int i = 3; i <= end; i++) {
                if (!check[i] && !check[end - i]) {
                    bw.write(end + " = " + i + " + " + (end - i) + "\n");
                    bool = true;
                    break;
                }
            }
            if(!bool) bw.write("Goldbach's conjecture is wrong.");
        }
        bw.flush();
        bw.close();
    }
}