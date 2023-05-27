import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Escape_Maze {


    //문제
    // NXM크기의 미로. 시작위치는 (1,1)이고 미로의 출구는 N,M의 위치에 있다.
    //괴물이 있는 부분은 0  괴물이 없는 부분은 1이다.
    //탈출이 가능한 최소 칸의 개수를 구하여라.

    public static int N,M;
    public static int[][] graph = new int[100][100];

    public static int bfs(int x,int y) {

    }



    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for ( int i=0 ; i<N;i++){
            String[] text = bf.readLine().split("");
            for ( int j=0 ; j<M ; j++){
                graph[i][j] = Integer.parseInt(text[j]);
            }
        }


        int result =0;







    }
}
