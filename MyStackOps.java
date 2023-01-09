package com.StacksAndQueues;

import java.util.LinkedList;

public class MyStackOps {
    LinkedList<Integer> list = new LinkedList<Integer>();
    public void push(Integer data){
        list.add(data);
    }
    public void printer(){
        System.out.println(list);
    }
}
