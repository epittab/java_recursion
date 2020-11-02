package com.Recursion.SwapNodesInPairs;

public class Node {
    private int val;
    private Node next;

    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
    
    public Node(int val){
        this.val = val;
        this.next = new Node();
    }

    public Node(){
    }

    public Node getNext() {
        return next;
    }

    public int getVal() {
        return val;
    }
}
