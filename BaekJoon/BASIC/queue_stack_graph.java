package BaekJoon.BASIC;

/*
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
