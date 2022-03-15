package Deque;

import LinkedList.DoublyLinkedList;

public class dllDeque {
    private DoublyLinkedList data;
    public dllDeque(){
        data = new DoublyLinkedList();
    }
    public void pushFront(int element){
        data.addAtHead(element);
    }
    public void pushBack(int element){
        data.add(element);
    }
    public int popFront(){
        int ans = data.getHead().getData();
        data.removeAtHead();
        return ans;
    }
    public int popBack(){
        int ans = data.getTail().getData();
        data.removeAtTail();
        return ans;
    }
    public int front(){
        int temp = popFront();
        pushFront(temp);
        return temp;
    }
    public int back(){
        int temp = popBack();
        pushBack(temp);
        return temp;
    }
}
