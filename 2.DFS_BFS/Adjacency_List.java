import java.util.ArrayList;
import java.util.Arrays;

class Node {
    private int node;
    private int distance;

    public Node(int node , int distance) {
        this.node = node;
        this.distance = distance;
    }
    public void frint() {
        System.out.println(node + "," + distance);
    }


}

public class Adjacency_List {
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Node>());
        }
        graph.get(0).add(new Node(0,3));
        graph.get(1).add(new Node(1,2));

        for (int i=0;i<3;i++) {
            for(int j=0; j<graph.get(i).size();j++){
                graph.get(i).get(j).frint();
            }
            System.out.println();
        }

    }

}























//class Node {
//    private int index;  //static은 클래스 필드 없는건 인스턴스 필드
//    private int distance;
//
//    public Node(int index, int distance) {
//        this.index = index;  //this는 매개변수가 멤버변수와 동일할때 알아보기 위해 해주는것
//        this.distance = distance;
//    }
//
//    public void frint() {
//        System.out.println(index + "," + distance);
//    }
//}
//
//
//public class Adjacency_List {
//
//    //이중 arraylist
//    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
//
//    public static void main(String[] args) {
//
//        for(int i=0; i<3; i++) {
//            graph.add(new ArrayList<Node>());
//            }
//        graph.get(0).add(new Node(1,7));
//        graph.get(0).add(new Node(2,5));
//        graph.get(1).add(new Node(3,9));
//        graph.get(2).add(new Node(0,5));
//
//        for(int i=0; i<3; i++){
//            for (int j=0; j <graph.get(i).size(); j++) {
//                graph.get(i).get(j).frint();
//            }
//            System.out.println();
//        }
//        }
//
//    }




