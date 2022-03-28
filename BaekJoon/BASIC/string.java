package BaekJoon.BASIC;
/*

     Problem 1157 단어공부
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        data = data.toLowerCase();

        int [] cnt = new int[26];

        for (int i=0; i<data.length(); i++) {
            cnt[data.charAt(i)-'a']++;
        }
        int max = -1;
        char answer = ' ';
        for (int i=0; i<26; i++) {
            if (max<cnt[i]) {
                max = cnt[i];
                answer = (char)(65+i);
            } else if(max == cnt[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}

       Problem 11656 접미사 배열
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = new String[s.length()];

        for (int i=0; i<s.length(); i++) {
            str[i] = s.substring(i, s.length());
        }
        Arrays.sort(str);

        for (String ans : str) {
            System.out.println(ans);
        }
    }
}

*/
