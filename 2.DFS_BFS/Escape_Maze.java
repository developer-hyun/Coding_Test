import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node1{
    public int x;
    public int y;
    public Node1(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

}


public class Escape_Maze {


    //문제
    // NXM크기의 미로. 시작위치는 (1,1)이고 미로의 출구는 N,M의 위치에 있다.
    //괴물이 있는 부분은 0  괴물이 없는 부분은 1이다.
    //탈출이 가능한 최소 칸의 개수를 구하여라.

    public static int N,M;
    public static int[][] graph = new int[100][100];
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};


    public static int bfs(int x,int y) {
        Queue<Node1> q = new LinkedList<>();
        q.offer(new Node1(x,y));

        while (!q.isEmpty()){
            Node1 node1 = q.poll();
            int getx = node1.getX();
            int gety = node1.getY();

            for (int i=0; i<4 ; i++){
                int nx = getx + dx[i];
                int ny = gety + dy[i];

                if ( nx < 0 || ny < 0 || nx >=N || ny >= M) {
                    continue;
                }
                //벽
                if (graph[nx][ny] == 0) {
                    continue;
                }
                if (graph[nx][ny] == 1) {
                    
                }
            }
        }
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
