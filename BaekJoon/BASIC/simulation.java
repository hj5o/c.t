/*
package BaekJoon.BASIC;

       Problem 13335 트럭
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int L = sc.nextInt();
        int[] arr = new int[N];
        Queue<Integer> q = new LinkedList<>();
        int sec = 0;
        int bdg = 0;
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(arr[i]);
                    sec++;
                    bdg += arr[i];
                    break;
                } else if (q.size() == W) {
                    bdg -= q.remove();
                } else {
                    if (bdg + arr[i] > L) {
                        q.offer(0);
                        sec++;
                    } else {
                        q.offer(arr[i]);
                        sec++;
                        bdg += arr[i];
                        break;
                    }
                }
            }
        }
        System.out.println(sec + W);
    }
}
*/
