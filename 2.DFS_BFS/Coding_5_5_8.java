import java.util.ArrayList;

public class Coding_5_5_8 {
    //이코테 5-8 DFS예제
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static boolean[] vistit = new boolean[9];
    public static void main(String[] args) {

        for(int i=0;i<9;i++) {
            graph.add(new ArrayList<Integer>()); //[[], [], [], [], [], [], [], [], []]
        }
        //노드정보 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        // 노드 2에 연결된 노드 정보 저장
        graph.get(2).add(1);
        graph.get(2).add(7);

        // 노드 3에 연결된 노드 정보 저장
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        // 노드 4에 연결된 노드 정보 저장
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
    public static void dfs(int x) {
        vistit[x]=true;
        System.out.println(x+" ");
        //dfs재귀방문
        for(int i=0; i<graph.get(x).size();i++) {
            int y = graph.get(x).get(i);
            if(vistit[y]==false) {
                dfs(y);
            }
        }
    }
}
