package BaekJoon.BASIC;
/*

       Problem 1181 단어정렬
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        for (int i=1; i<N; i++) {
            if (!arr[i].equals(arr[i-1])) {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}

       Problem 1427
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        Arrays.sort(arr);

        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}

       Problem 2751 수 정렬하기 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for (int num : list) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}

       Problem 11650 좌표 정렬하기
 * Comparator와 2차원배열 Intellij에서는 오버라이드와 compare 함수선언이 자동완성으로 되었지만
 프로그래머스에서 직접 짜야할 때 할 수 있을지.. 스캐너가 아닌 br, st로 했을때 왜 예외가 나는지..
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i][0]+ " " +arr[i][1]);
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

*/
