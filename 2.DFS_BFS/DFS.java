import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class DFS {

    public static boolean[] visit = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public void dfs(int x){
        visit[x] = true;  //1부터 시작하여 방문함.
        for(int j=0;j<graph.get(x).size();j++){
            int y = graph.get(x).get(j); //1과연결된 숫자들(2,3,8)중 2먼저 시작.

            if(!visit[y]) {
                dfs(y);
            }
        }
    }



    public static void main(String[] args) {
        for (int i=0 ; i<9; i++) {
            graph.add(new ArrayList<Integer>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);
        graph.get(2).add(1);
        graph.get(2).add(7);
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        graph.get(4).add(3);
        graph.get(4).add(5);

        // 노드 5에 연결된 노드 정보 저장
        graph.get(5).add(3);
        graph.get(5).add(4);

        // 노드 6에 연결된 노드 정보 저장
        graph.get(6).add(7);

        // 노드 7에 연결된 노드 정보 저장
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // 노드 8에 연결된 노드 정보 저장
        graph.get(8).add(1);
        graph.get(8).add(7);

    }
}
//class DFS_Node {
//    private int index;
//    private int distance;
//
//    public DFS_Node(int index , int distance) {
//        this.index = index;
//        this.distance = distance;
//    }
//
//
//}
//
//public class DFS {
//
//    public static boolean[] visit = new boolean[9];
//    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
//
//    public static void dfs(int x) {
//        visit[x] = true;
//        System.out.println(x + " ");
//        for (int i=0 ; i<graph.get(x).size(); i++) {
//            int y = graph.get(x).get(i);
//            if(!visit[y]){
//                dfs(y);
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        for (int i =0 ; i<9;i++ ) {
//            graph.add(new ArrayList<Integer>());
//        }
//
//        graph.get(1).add(2);
//        graph.get(1).add(3);
//        graph.get(1).add(8);
//        graph.get(2).add(1);
//        graph.get(2).add(7);
//        graph.get(3).add(1);
//        graph.get(3).add(4);
//        graph.get(3).add(5);
//        graph.get(4).add(3);
//        graph.get(4).add(5);
//
//        // 노드 5에 연결된 노드 정보 저장
//        graph.get(5).add(3);
//        graph.get(5).add(4);
//
//        // 노드 6에 연결된 노드 정보 저장
//        graph.get(6).add(7);
//
//        // 노드 7에 연결된 노드 정보 저장
//        graph.get(7).add(2);
//        graph.get(7).add(6);
//        graph.get(7).add(8);
//
//        // 노드 8에 연결된 노드 정보 저장
//        graph.get(8).add(1);
//        graph.get(8).add(7);
//
//        dfs(1);
//    }
//
//}
