package BaekJoon.Problem;
/*
       Problem 1052 물병
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int buy = 0;

        while (true) {
            int cnt = 0;
            int num = N;
            while (num != 0) {
                if(num % 2 == 1) {
                    cnt++;
                }
                num /= 2;
            }
            if (cnt <= K) {
                break;
            }
            buy ++;
            N ++;
        }
        System.out.println(buy);
    }
}

       Problem 1246 온라인 판매
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int [M];
        for (int i=0; i<M; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int result = 0;
        int val = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<M; i++) {
            if (M-1 < N) {
                result = arr[i] * (M - i);
            } else {
                result = arr[i] * N;
            }
            if (max < result) {
                val = arr[i];
                max = result;
            }
        }
        System.out.println(val + " " + max);
    }
}

       Problem 1343 폴리오미노
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.replaceAll("XXXX","AAAA").replaceAll("XX","BB");
        if(input.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(input);
        }
    }
}

       Problem 1541 잃어버린 괄호
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), "-");

        StringTokenizer st2 = new StringTokenizer(st1.nextToken(), "+");
        int sum = 0;
        while (st2.hasMoreTokens())
            sum += Integer.parseInt(st2.nextToken());

        while(st1.hasMoreTokens()) {
            st2 = new StringTokenizer(st1.nextToken(), "+");

            while (st2.hasMoreTokens())
                sum -= Integer.parseInt(st2.nextToken());
        }
        System.out.println(sum);
    }
}

       Problem 1758 알바생 강호
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        int[] price = new int[N];
        long ans = 0;

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for (int i=0; i<arr.length; i++) {
            price[i] = arr[i] -(i);
            if (price[i] <= 0) {
                price[i] = 0;
            }
            ans += price[i];
        }
        System.out.println(ans);
    }
}

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

       Problem 2839 설탕 배달
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 4 || N == 7) {
            System.out.println(-1);
        }
        else if (N % 5 == 0) {
            System.out.println(N / 5);
        }
        else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) {
            System.out.println((N / 5) + 2);
        }
    }
}

       Problem 5179 안테나
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        if (N % 2 == 0) {
            System.out.println(arr[N/2 - 1]);
        } else {
            System.out.println(arr[N/2]);
        }
    }
}

       Problem 9327 이장님 초대
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        int[] num = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());
        int max = 0;

        for (int i=0; i<N; i++) {
            num[i] = i + arr[i] + 2;
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);
    }
}

       Problem 11047 동전 0
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];

        for (int i=N-1; i>=0; i--) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int ans = 0;
        for (int i=0; i<N; i++) {
            if ( M/coin[i] > 0 ) {
                ans += M/coin[i];
                M %= coin[i];
            }
        }
        System.out.println(ans);
    }
}

       Problem 11399 ATM
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int time = 0;
        for (int i=0; i<N; i++) {
            time += arr[i] * (N-i);
        }
        System.out.println(time);
    }
}
       Problem 11508 2+1 세일
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        int cnt = 0;


        for (int i=0; i<arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i=arr.length-1; i>=0; i--) {
            cnt++;
            if (cnt % 3 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
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

       Problem 13305 주유소
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int oil[]=new int[n];
        int spend[]=new int [n-1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n-1;i++)
            spend[i]=Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            oil[i]=Integer.parseInt(st.nextToken());

        int value=0;
        for(int i=0;i<n-1;i++) {
            if(oil[i]<oil[i+1]) oil[i+1]=oil[i];
            value+=oil[i]*spend[i];
        }
        System.out.println(value);
    }
}

       Problem 20413 MVP 다이아몬드 (Easy)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rank = new int[4];
        for (int i=0; i<rank.length; i++) {
            rank[i] = sc.nextInt();
        }
        String m = sc.next();
        String[] month = m.split("");
        int sum = 0;
        int prev = 0;
        for (int i=0; i<N; i++) {
            if(month[i].equals("B")) {
                sum += rank[0] -1 - prev;
                prev = rank[0] -1 - prev;
            } else if (month[i].equals("S")) {
                sum += rank[1] - 1 - prev;
                prev = rank[1] - 1 - prev;
            } else if (month[i].equals("G")) {
                sum += rank[2] - 1 - prev;
                prev = rank[2] - 1 - prev;
            } else if (month[i].equals("P")) {
                sum += rank[3] - 1 - prev;
                prev = rank[3] - 1 - prev;
            } else if (month[i].equals("D")) {
                sum += rank[3];
                prev = rank[3];
            }
        }
        System.out.println(sum);
        System.out.println();
    }
}
*/
