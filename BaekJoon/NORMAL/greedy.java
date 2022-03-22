package BaekJoon.NORMAL;
/*
       Problem 2437 저울
주어진 저울추를 이용해서 측정할 수 없는 최소의 값 만드는 문제
만약 1,2,3,8의 저울추가 주어진다면
1,2,3을 이용해 6을 만들 수 있지만 7을 만들 수 없다.
때문에 주어진 저울추들을 정렬해 배열의 첫번째 무게를 저장하고,
반복을 통해 최대 무게를 갱신해나간다.
1,2,3을 이용해 7을 만들 수 없기에, 최대 무게의 +1이 된 순간 반복을 종료한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] w = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            w[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(w);

        int max = 0;
        for (int i=0; i<N; i++) {
            if (max+1 < w[i]) {
                break;
            }
            max += w[i];
        }
        System.out.println(max+1);
    }
}
*/
