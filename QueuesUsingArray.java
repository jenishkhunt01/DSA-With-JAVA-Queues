package DataStructureWithMosh.Queues;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class QueuesUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayQueue arrayQueue = new ArrayQueue(n);
        while (n>0){
            arrayQueue.enqueue(sc.nextInt());
            n--;
        }
        arrayQueue.print();
    }
}

class ArrayQueue{
    private int front=0;
    private int rear=0;
    private int count=0;
    private int [] array;
    public ArrayQueue(int size){
        array = new int[size];
    }

    public void enqueue(int item){
        if(count == array.length){
            throw new IllegalStateException();
        }
        array[rear]=item;
        rear++;
        count++;
    }

    public int dequeue(){
        if(count == 0){
            throw new NullPointerException();
        }
        int value = array[front];
        array[front] = 0;
        front = (front+1)%array.length;
        count--;
        return value;
    }
    public boolean isEmpty(){
        return count ==0;
    }
    public boolean isFull(){
        return count == array.length;
    }

    public int peek(){
        return array[front];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);

    }

    public void print(){
        if(array.length == 0){
            System.out.println("Queue is empty");
        }else {
            System.out.println("Queue is : ");
            for (int i = front; i < rear; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
