package DataStructureWithMosh.Queues;

import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {
        QueuesStacks que = new QueuesStacks();
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
    }
}
class QueuesStacks{
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item){
        if(stack.isEmpty()) {
            stack.push(item);
        }

    }
    public int dequeue(){
        if(stack2.empty()){
            while (stack.isEmpty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.pop();
    }
}
