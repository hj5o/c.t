/*
package BaekJoon.BASIC;

       Problem 1697 숨바꼭질
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int max = 200001;
        boolean[] visited = new boolean[max];
        int[] cnt = new int[max];
        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        cnt[N] = 0;
        visited[N] = true;

        while (!q.isEmpty()) {
            int now = q.remove();

            if (now + 1 < max && !visited[now + 1]) {
                q.add(now + 1);
                visited[now + 1] = true;
                cnt[now + 1] = cnt[now] + 1;
            }

            if (now - 1 >= 0 && !visited[now - 1]) {
                q.add(now - 1);
                visited[now - 1] = true;
                cnt[now - 1] = cnt[now] + 1;
            }

            if (now * 2 < max && !visited[now * 2]) {
                q.add(now * 2);
                visited[now * 2] = true;
                cnt[now * 2] = cnt[now] + 1;
            }
        }
        System.out.println(cnt[K]);
    }
}

       Problem 1926 그림
import java.util.*;

public class Main {
    static int N, M;
    static int[][] board;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int cnt;
    static int[] area;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        visited = new boolean[N][M];
        area = new int[N*M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (board[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        Arrays.sort(area);
        System.out.println(cnt);
        System.out.println(area[area.length-1]);
    }
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        int nx, ny;
        area[cnt]++;
        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (board[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}

       Problem 2178 미로찾기
import java.util.*;

public class Main {
    static int N, M;
    static int[][] board;
    static int[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        visited = new int[N][M];
        for (int i=0; i<N; i++) {
            String s = sc.next();
            for (int j=0; j<M; j++) {
                board[i][j] = s.charAt(j) - '0';
            }
        }
        bfs(board, visited);
        System.out.println(visited[N-1][M-1]);

    }
    static void bfs(int[][] board, int[][] visited) {
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        while (!q.isEmpty()) {
            int[] c = q.poll();
            int cx = c[0];
            int cy = c[1];
            for (int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (visited[nx][ny] == 0 && board[nx][ny] != 0) {
                        visited[nx][ny] = visited[cx][cy] + 1;
                        q.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}

       Problem 2210 숫자판 점프
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static HashSet<String> set = new HashSet<>();
    public static int[][] board;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[5][5];
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                dfs(i, j, 0, "");
            }
        }
        System.out.println(set.size());
    }
    public static void dfs(int x, int y, int cnt, String str) {
        if (cnt == 6) {
            set.add(str);
            return;
        }
        int nx, ny;
        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < 5 && ny < 5) {
                dfs(nx, ny, cnt+1, str + board[nx][ny]);
            }
        }
    }
}

       Problem 2449 단지번호붙이기
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, cnt;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[] area;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new int[N][N];
        visited = new boolean[N][N];
        area = new int[N*N];
        for (int i=0; i<N; i++) {
            String str = sc.next();
            for (int j=0; j<N; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (board[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    dfs(i, j);
                }
            }
        }
        Arrays.sort(area);
        System.out.println(cnt);
        for (int i=0; i<area.length; i++) {
            if (area[i] != 0) {
                System.out.println(area[i]);
            }
        }

    }
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        int nx, ny;
        area[cnt]++;
        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (board[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}

       Problem 2468 안전 영역
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new int[N][N];
        visited = new boolean[N][N];
        int max = Integer.MIN_VALUE;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                board[i][j] = sc.nextInt();
                if (max < board[i][j]) {
                    max = Math.max(max, board[i][j]);
                }
            }
        }
        int[] cnt = new int[max];
        for (int h=0; h<max; h++) {
            int section = 0;
            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    if (board[i][j] > h && !visited[i][j]) {
                        dfs(i, j, h);
                        section++;
                    }
                }
            }
            cnt[h] = section;
            visited = new boolean[N][N];
        }
        Arrays.sort(cnt);
        System.out.println(cnt[cnt.length-1]);
    }
    private static void dfs(int x, int y, int height) {
        visited[x][y] = true;
        int nx, ny;
        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (board[nx][ny] > height && !visited[nx][ny]) {
                    dfs(nx, ny, height);
                }
            }
        }
    }
}

       Problem 3184 양
import java.util.Scanner;

public class Main {
    static int R, C;
    static char[][] board;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int v_cnt;
    static int o_cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        board = new char[R][C];
        visited = new boolean[R][C];
        int v = 0;
        int o = 0;
        for (int i=0; i<R; i++) {
            String str = sc.next();
            for (int j=0; j<C; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                v_cnt = 0;
                o_cnt = 0;
                if (board[i][j] != 'o' && board[i][j] != 'v' && board[i][j] != '.' &&!visited[i][j]) {
                    dfs(i,j);
                    if (v_cnt >= o_cnt) {
                        v += v_cnt;
                    } else {
                        o += o_cnt;
                    }
                }
            }
        }
        System.out.println(o + " " + v);
    }
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        if (board[x][y] == 'v') {
            v_cnt++;
        } else if (board[x][y] == 'o') {
            o_cnt++;
        }
        int nx, ny;
        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
                if (board[nx][ny] != '#' && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}

       Problem 9372 상근이의 여행
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=0; tc<T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] board = new int[M][2];
            for (int i=0; i<M; i++) {
                for (int j=0; j<2; j++) {
                    board[i][j] = sc.nextInt();
                }
            }
            System.out.println(N-1);
        }

    }
}

       Problem 10026 적록색약
import java.util.Scanner;

public class Main {
    static char[][] board;
    static boolean[][] visited, rgvisited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int N, cnt, rgcnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new char[N][N];
        visited = new boolean[N][N];
        rgvisited = new boolean[N][N];
        for (int i=0; i<N; i++) {
            String s = sc.next();
            for (int j=0; j<N; j++) {
                board[i][j] = s.charAt(j);
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
                if (!rgvisited[i][j]) {
                    rgdfs(i, j);
                    rgcnt++;
                }
            }
        }
        System.out.println(cnt + " " + rgcnt);
    }
    static void dfs(int x, int y) {
        visited[x][y] = true;
        int nx, ny;
        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >=0 && nx < N && ny < N) {
                if (!visited[nx][ny] && board[nx][ny] == board[x][y]) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }
    static void rgdfs(int x, int y) {
        rgvisited[x][y] = true;
        int nx, ny;
        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >=0 && nx < N && ny < N) {
                if(!rgvisited[nx][ny]) {
                    if(board[x][y] == 'G' || board[x][y] == 'R') {
                        if (board[nx][ny] == 'R' || board[nx][ny] == 'G') {
                            rgvisited[nx][ny] = true;
                            rgdfs(nx, ny);
                        }
                    } else if (board[x][y] == board[nx][ny]) {
                        rgvisited[nx][ny] = true;
                        rgdfs(nx, ny);
                    }
                }
            }
        }
    }
}

       Problem 14716 현수막
import java.util.Scanner;

public class Main {
    static int N, M, cnt;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
    static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        visited = new boolean[N][M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (board[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        int nx, ny;
        for (int i=0; i<8; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (board[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}

       Problem 21736 헌내기는 친구가 필요해
import java.util.Scanner;

public class Main {
    static int N, M, cnt;
    static char[][] board;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new char[N][M];
        visited = new boolean[N][M];
        for (int i=0; i<N; i++) {
            String str = sc.next();
            for (int j=0; j<M; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (board[i][j] == 'I') {
                    dfs(i, j);
                }
            }
        }
        if (cnt >= 1) {
            System.out.println(cnt);
        } else {
            System.out.println("TT");
        }
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        if (board[x][y] == 'P') {
            cnt++;
        }
        int nx, ny;
        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (!visited[nx][ny] && board[nx][ny] != 'X') {
                    dfs(nx, ny);
                }
            }
        }
    }
}

*/
