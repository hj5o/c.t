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

       Problem 2693 N번째 큰 수
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
        int[] nums = new int[10];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j=0; j<nums.length; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(nums);
            System.out.println(nums[nums.length-3]);
        }
    }
}

       Problem 2750 수 정렬하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.println(num);
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

       Problem 2752 세수정렬
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[3];
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}

       Problem 2822 점수 계산
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[8];
        int[] temp = new int[8];
        int sum = 0;
        for (int i=0; i<8; i++) {
            num[i] = Integer.parseInt(br.readLine());
            temp[i] = num[i];
        }
        Arrays.sort(num);
        for (int i=3; i<8; i++) {
            sum += num[i];
        }
        System.out.println(sum);
        for (int i=0; i<8; i++) {
            for (int j=3; j<8; j++) {
                if (temp[i] == num[j]) {
                    System.out.print(i+1 + " ");
                }
            }
        }
    }
}

       Problem 3273 두 수의 합
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); //오름차순 정렬을 해준다.

        int x = Integer.parseInt(br.readLine());

        int start = 0;
        int end = n - 1;
        int count = 0;
        int sum = 0;

        while(start < end) {
            sum = arr[start] + arr[end];

            if(sum == x) {
                count++;
            }
            if(sum <= x) {
                start++;
            }
            else {
                end--;
            }
        }
        System.out.println(count);
    }
}

       Problem 5576 콘테스트
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] W = new int[10];
        int[] K = new int[10];
        int W_sum = 0;
        int K_sum = 0;
        for (int i=0; i<W.length; i++) {
            W[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0; i<K.length; i++) {
            K[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(W);
        Arrays.sort(K);
        for (int i=7; i<10; i++) {
            W_sum += W[i];
            K_sum += K[i];
        }
        System.out.println(W_sum + " " + K_sum);
    }
}

       Problem 10867 중복 빼고 정렬하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> hs = new HashSet<>();
        st = new StringTokenizer(br.readLine()," ");
        for (int i=0; i<N; i++) {
            hs.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> nums = new ArrayList<>(hs);
        Collections.sort(nums);

        for (int ans : nums) {
            System.out.print(ans + " ");
        }
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

       Problem 16435 스네이크버드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] fruits = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            fruits[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(fruits);
        for (int i=0; i< fruits.length; i++) {
            if (fruits[i] <= L) {
                L++;
            } else {
                break;
            }
        }
        System.out.println(L);
    }
}

*/
