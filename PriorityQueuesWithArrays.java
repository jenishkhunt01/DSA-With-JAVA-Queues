package DataStructureWithMosh.Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class PriorityQueuesWithArrays {
    public static void main(String[] args) {
     PriorityQueues que = new PriorityQueues();
     que.insert(4);
        que.insert(5);

        que.insert(6);

//     que.insert(2);
    }
}

class PriorityQueues{

    private int [] array = new int [5];

    public void insert(int item){
        int [] newarray = new int[array.length+1];
        for(int i=0 ; i< array.length ; i++){
            newarray[i] = array[i];
        }
        array = newarray;

        for(int i = array.length -2 ; i>=0 ; i--){
            if(array[i] > item){
                array[i+1] = array[i];
            }
            else{
                array[i+1] = item;
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
