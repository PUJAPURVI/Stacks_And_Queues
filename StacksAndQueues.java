package com.StacksAndQueues;

/**
 * @author puja
 */
public class StacksAndQueues {
    public static void main(String[] args) {
        /**
         * Main method used for stacks operation
         * 1)calling push method
         * 2)calling pop method
         * 3)calling pick method
         * 4)calling printer method
         */


        System.out.println(" Welcome to StackQueue Problem ");
        MyStackOps stack = new MyStackOps();// UC1
        stack.push(70);
        stack.push(30);
        stack.push(56);


        stack.printer();// UC2
        stack.peek();
        stack.pop();
        stack.printer();

        /**
         * Main method used for queue operation
         * 1)calling offer method
         * 2)calling  printer method
         * 3)calling poll method
         *
         */

        MyQueueOps enqueue = new MyQueueOps();// UC3
        enqueue.offer(56);
        enqueue.offer(30);
        enqueue.offer(70);

        enqueue.printer();
        enqueue.poll();
    }
}


