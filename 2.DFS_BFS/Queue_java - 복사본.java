import java.util.LinkedList;
import java.util.Queue;

public class Queue_java {
    public static void main(String[] args) {
        //0512!!
        Queue<Integer> queue_int = new LinkedList<>(); //자바에서 큐는 링크드리스트를 이용
        Queue<String> queue_string = new LinkedList<>();

        queue_int.add(1);
        queue_int.add(2);

        queue_string.add("else");
        queue_string.offer("eat");
        queue_string.offer("e");
        queue_string.offer("a");
        queue_string.poll();
        while(!queue_string.isEmpty()){
            System.out.println(queue_string.poll());
        }

    }
}
