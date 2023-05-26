import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Drink_Frozen {

    public static int N,M;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs1(int x,int y){
        if (x<= -1 || x >= N || y <=-1 || y >= M){
            return false;
        }

        if (graph[x][y] == 0) {
            graph[x][y]=1;
            dfs1(x - 1, y);
           dfs1(x, y - 1);
           dfs1(x + 1, y);
           dfs1(x, y + 1);
          return true;

        }
        return false;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++){
            String[] text = bf.readLine().split("");
            for (int j=0 ; j<M; j++){
                graph[i][j] = Integer.parseInt(text[j]);
            }
        }
        int result =0;
        for ( int i=0 ; i<N; i++) {
            for (int  j=0; j<M; j++){
                if(dfs1(i,j) == true) {
                    result +=1;
                }
            }
        }
        System.out.println(result);

    }
}


//public class Drink_Frozen {
//
//    public static int N,M;
//    public static int[][] graph = new int[1000][1000];
//
//    //문제
//    //NM 크기의 얼음틀 뚫려 있는 부분은 0 칸막이는 1
//    //뚫려있는 부분이 상하좌우 붙어있으면 연결되어있음  총 생성되는 아이스크림 개수.
//    //연결되어있으면 하나임.
//
//    public static boolean dfs1(int x, int y) {
//        if (x<= -1 || x >= N || y <=-1 || y >= M){
//            return false;
//        }
//        if (graph[x][y] ==0) {  //1이면 방문할 필요가없고 0이면 얼음이 생성될수있기 때문에 방문해야함
//            graph[x][y] =1; //방문을 하게되면 1로 체크하여 다시 방문하지않도록.
//
//            dfs1(x - 1, y);
//            dfs1(x, y - 1);
//            dfs1(x + 1, y);
//            dfs1(x, y + 1);
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        for(int i =0 ; i<N ; i++) {
//            //StringTokenizer st1 = new StringTokenizer(bf.readLine());
//            String[] text  = bf.readLine().split("");
//            for (int j =0 ; j<M; j++){
//               // graph[i][j] = Integer.parseInt(st1.nextToken());
//                graph[i][j] = Integer.parseInt(text[j]);
//            }
//        }
////        for (int i=0 ; i<6; i++){
////
////            for(int j=0; j<6; j++){
////                System.out.println(graph[i][j]);
////            }
////        }
//
//        int result =0;
//        for (int i=0 ; i<N;i++){
//            for(int j=0; j<M; j++){
//                dfs1(i,j);
//                result +=1;
//            }
//        }
//        System.out.println(result);
//    }
//}
