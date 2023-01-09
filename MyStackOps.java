package com.StacksAndQueues;
/**
 * @author puja
 */

import java.util.LinkedList;

public class MyStackOps {
    /**
     * create new linked list to add data
     */
    LinkedList<Integer> list = new LinkedList<Integer>();
    public void push(Integer data){
        /**
         * Method for push in list
         */
        list.add(data);
    }
    public void printer(){
        /**
         * Method for Print list
         */
        System.out.println(list);
    }
    public void peek() {
        /**
         * Method for peek list
         */
        System.out.println(list.peek());
    }

    public void pop() {
        /**
         * Method to pop list
         */
        System.out.println( list.pop());

    }
}
