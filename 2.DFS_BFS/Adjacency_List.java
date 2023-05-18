import java.util.ArrayList;

class Node {
    private int index;  //static은 클래스 필드 없는건 인스턴스 필드
    private int distance;

    public Node(int index, int distance) {
        this.index = index;  //this는 매개변수가 멤버변수와 동일할때 알아보기 위해 해주는것
        this.distance = distance;
    }

    public void frint() {
        System.out.println(index + "," + distance);
    }
}


public class Adjacency_List {

    //이중 arraylist
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

    public static void main(String[] args) {
        
    }



}
