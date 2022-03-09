package BaekJoon.BASIC;
/*

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
