package DataStructureWithMosh.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Reversing {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while (i<=n){
            queue.add(sc.nextInt());
            i++;
        }
        reverse(queue);
    }

    public static void reverse(Queue<Integer> queue){
        int [] array = new int[queue.size()];
        Stack<Integer> stack = new Stack<>();
//        for(int i=queue.size()-1 ; i>=0 ; i-- ){
//            array[i] = queue.remove();
//        }
//        for(int j=0;j< array.length ; j++){
//            queue.add(array[j]);
//        }
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }

        while (!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
