package BaekJoon.BASIC;
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
*/
