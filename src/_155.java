import java.util.Stack;

public class _155 {
    Stack<Integer> dataStack;
    Stack<Integer> minStack ;
    public static void main(String[] args) {

    }
    public void MinStack(){
        dataStack = new Stack<Integer> ();
        minStack = new Stack<Integer> ();
        minStack.push(Integer.MIN_VALUE);
    }
    public void push(int x){
        dataStack.push(x);
        minStack.push(Math.min(x,minStack.peek()));
    }
    public void pop(){
        int temp = dataStack.peek();
        dataStack.pop();
        if(temp == minStack.peek()){
            minStack.pop();
        }
    }
    public int top(){
        return dataStack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }

}
