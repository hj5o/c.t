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

       Problem 13164 행복 유치원
N명의 원생, K개의 조
N명이 하나의 각자 그룹이다. 이 상태에서 1개의 그룹를 만들면 N-1개의 그룹이 남는다.
K개의 조를 형성하면 N-K

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        arr[0] = Integer.parseInt(st.nextToken());

        for (int i=1; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i-1] = arr[i] - arr[i-1];
        }

        Arrays.sort(arr);
        int ans = 0;
        for (int i=0; i<N-K; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
*/
