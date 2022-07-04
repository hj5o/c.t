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

       Problem 1337 올바른 배열
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 2147483647;
        int left = 0;
        int right = 0;
        Arrays.sort(arr);

        while (right >= left) {
            if (right >= arr.length) {
                break;
            }
            if (arr[right] - arr[left] > 4) {
                left++;
            } else {
                int val = 5 - (right - left + 1);
                ans = Math.min(ans, val);
                right++;
            }
        }

        System.out.println(ans);
    }
}

       Problem 1427 소트인사이드
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
       
       Problem 1449 수리공 항승
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int water[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			water[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(water);
		double left = water[0] - 0.5;
		int cnt = 1;
		for(int i=0; i<N; i++) {
			if(left+L < water[i]) {
				cnt++;
				left = water[i] - 0.5;
			}
		}
		System.out.println(cnt);
	}
}

       Problem 1449 수리공 항승
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int water[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			water[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(water);
		double left = water[0] - 0.5;
		int cnt = 1;
		for(int i=0; i<N; i++) {
			if(left+L < water[i]) {
				cnt++;
				left = water[i] - 0.5;
			}
		}
		System.out.println(cnt);
	}
}

       Problem 1764 듣보잡
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashSet<String> hear = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i=0; i<N; i++) {
            hear.add(sc.next());
        }

        for (int i=0; i<M; i++) {
            String s = sc.next();
            if (hear.contains(s)) {
                list.add(s);
            }
        }
        Collections.sort(list);

        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}

       Problem 1822 차집합
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();

        for (int i=0; i<A; i++) {
            set.add(sc.nextInt());
        }
        for (int i=0; i<B; i++) {
            int get_rid = sc.nextInt();
            if (set.contains(get_rid)) {
                set.remove(get_rid);
            }
        }
        System.out.println(set.size());
        for (Integer answer : set) {
            System.out.print(answer + " ");
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

       Problem 5800 성적 통계
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int[] arr = new int[a];
            for (int j=0; j<arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int j=0; j<arr.length-1; j++) {
                max = Math.max(max, arr[j+1] - arr[j]);
            }
            System.out.println("Class " + (i+1));
            System.out.println("Max " + arr[arr.length-1] + ", Min " + arr[0] + ", Largest gap " + max);
        }
    }
}

       Problem 10815 숫자 카드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            int num = Integer.parseInt(st2.nextToken());

            if (set.contains(num)) {
                System.out.print("1" + " ");
            } else {
                System.out.print("0" + " ");
            }
        }
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

       Problem 11497 통나무 건너뛰기
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=0; tc<T; tc++) {
            int N = sc.nextInt();
            int[] L = new int[N];
            for (int i=0; i<L.length; i++) {
                L[i] = sc.nextInt();
            }
            Arrays.sort(L);
            int[] num = new int[N];
            int left = 0;
            int right = N-1;
            for (int i=0; i<num.length; i++) {
                if (i % 2 == 0) {
                    num[left++] = L[i];
                } else {
                    num[right--] = L[i];
                }
            }
            int max = 0;
            for (int i=1; i<num.length; i++) {
                max = Math.max(max, Math.abs(num[i] - num[i-1]));
            }
            max = Math.max(max, Math.abs(num[0] - num[num.length-1]));
            System.out.println(max);
        }
    }
}

       Problem 11536 줄 세우기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i=0; i<N; i++) {
            str[i] = br.readLine();
        }
        String[] clone = str.clone();
        Arrays.sort(str);
        if (clone[clone.length-1] == str[0]) {
            System.out.println("DECREASING");
        }
        else if (clone[0] == str[0]) {
            System.out.println("INCREASING");
        }
        else {
            System.out.println("NEITHER");
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

       Problem 16212 정열적인 정렬
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
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

       Problem 20044 Project Teams
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N*2];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = Integer.MAX_VALUE;
        for (int i=0; i<N; i++) {
            answer = Math.min(answer, arr[i] + arr[N*2-1-i]);
        }
        System.out.println(answer);
    }
}

*/
