import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Coding_5_5_9 {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static boolean[] visited = new boolean[9];
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }
        // 노드 1에 연결된 노드 정보 저장
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
        bfs(1);
    }
    public static void bfs(int x) {
        visited[x] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        while (!queue.isEmpty()){
            int nowX = queue.poll();
            System.out.println(nowX+" ");
            //뽑은 원소와 연결된 -> graph에있는 원소 저장
            for(int i=0;i<graph.get(nowX).size();i++){
                int nowY = graph.get(nowX).get(i);
                if(!visited[nowY]){
                    queue.offer(nowY);
                    visited[nowY]=true;
                }
            }
        }
    }
}
