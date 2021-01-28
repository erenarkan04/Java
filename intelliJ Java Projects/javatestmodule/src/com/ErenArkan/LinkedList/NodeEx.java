package com.ErenArkan.LinkedList;

public class NodeEx {

    private Integer value;
    private NodeEx next;

    public NodeEx(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public NodeEx getNext() {
        return next;
    }

    public void setNext(NodeEx next) {
        this.next = next;
    }

    public String toString() {
        return value.toString();
    }
}