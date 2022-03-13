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
*/
