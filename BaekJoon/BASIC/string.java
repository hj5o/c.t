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

       Problem 1316 그룹 단어 체커
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for (int i=0; i<N; i++) {
            String s = sc.next();
            boolean check[] = new boolean[26];
            boolean tmp = true;

            for (int j=0; j<s.length(); j++) {
                int index = s.charAt(j)-'a';
                if (check[index]) {
                    if (s.charAt(j) != s.charAt(j-1)) {
                        tmp = false;
                        break;
                    }
                } else {
                    check[index] = true;
                }
            }
            if (tmp) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

       Problem 5635 생일
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] answer = new String[N];
        int[] day = new int[N];
        for (int i=0; i<N; i++) {
            answer[i] = sc.next();
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();
            int sum = d + m * 30 + y * 365;
            day[i] = sum;
        }
        int[] c = new int[N];
        c = day.clone();
        Arrays.sort(day);
        for (int i=0; i<N; i++) {
            if (day[day.length-1] == c[i]) {
                System.out.println(answer[i]);
            }
        }
        for (int i=0; i<N; i++) {
            if (day[0] == c[i]) {
                System.out.println(answer[i]);
            }
        }
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

       Problem 14425 문자열 집합
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        int cnt = 0;
        for (int i=0; i<N; i++) {
            set.add(sc.next());
        }
        for (int i=0; i<M; i++) {
            String str = sc.next();
            if (set.contains(str)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

*/
