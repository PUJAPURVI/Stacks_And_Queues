package com.StacksAndQueues;

import java.util.LinkedList;

public class MyQueueOps {
    /**
     * Create a new Linked List
     */

    LinkedList<Integer> list = new LinkedList<>();
    public void enqueue(Integer data){
        /**
         * Method used for add last data
         */

        list.addLast(data);
        System.out.println(list);
    }
    public void dequeue(){
        /**
         * Method used for poll first data
         */

        list.pollFirst();
        System.out.println(list);
    }

    public void printer(){
        /**
         * Method to print the list
         */

        System.out.println(list);
    }
}
