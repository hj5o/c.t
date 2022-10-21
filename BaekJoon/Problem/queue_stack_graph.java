package BaekJoon.Problem;
/*

       Problem 1302 베스트셀러
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i=0; i<N; i++) {
            String book = sc.next();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        for (String book : map.keySet()) {
            max = Math.max(max, map.get(book));
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (String s : list) {
            if (max == map.get(s)) {
                System.out.println(s);
                break;
            }
        }
    }
}
       Problem 2161 카드1
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            System.out.print(queue.poll() + " ");
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}

       Problem 2164 카드2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        for (int i=1; i<=N; i++) {
            q.offer(i);
        }
        while (q.size() > 1) {
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());

    }
}

       Problem 4949 균형잡힌 세상
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if(s.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<>();
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

       Problem 9012 괄호
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            int length = str.length();

            for (int j=0; j<length; j++) {
                char ch = str.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    if (ch == ')') {
                        if (stack.peek() == '(') {
                            stack.pop();
                        }
                        else {
                            stack.push(ch);
                        }
                    } else {
                        stack.push(ch);
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}

       Problem 10773 제로
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int top = -1;
        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {

            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                top--;
            } else {
                top++;
                arr[top] = number;
            }
        }
        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
*/
