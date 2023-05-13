import java.util.Stack;
public class Stack_java {

    public static void main(String[] args) {

        Stack<Integer> stack_int = new Stack<>(); //<>은 제네릭
        Stack<String> stack_string = new Stack<>();

        stack_int.push(1);
        stack_int.push(2);

        stack_string.push("else");
        stack_string.push("eat");
        stack_string.push("e");
        stack_string.push("top");

        //System.out.println(stack_int);
        //System.out.println(stack_string);
        while(!stack_string.empty()) {
            System.out.println(stack_string.peek());
            stack_string.pop();
        }


    }
}
