import java.util.Arrays;

public class Stack {


    //자바의 스택구현

    public static void main(String[] args) {

        Java_Stack java_stack = new Java_Stack(5);
        java_stack.push(3);
        java_stack.push(4);
        java_stack.push(5);
        java_stack.push(6);
        java_stack.push(7);
        java_stack.pop();
        java_stack.pop();
        System.out.println(java_stack.toString());

    }
}


class Java_Stack {

    private int[] arr;
    private int size;
    private int top;
    private int cap;

    public Java_Stack(int size) {
        this.size = size;
        this.cap = size;
        this.top = -1;
        this.arr= new int[size];
    }

    public void push(int x) {

        if (isFull()) {
            System.out.println("overflow");
            System.exit(-1); //종료함수
        }

        System.out.println("넣음" + x);
        top++;
        arr[top] = x;
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("EMPTY");
            System.exit(-1);
        }

        System.out.println("뺌");
        arr[top] = 0;
        top--;
    }

    public int peek() {
            if (!isEmpty()) {
                return arr[top];
            }
            else {
                System.exit(-1);
            }

            return -1;
        }
    public boolean isFull() {
        return  top == cap -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public String toString() {
        System.out.println(Arrays.toString(arr));
        return arr.toString();
    }
}
