package LinkedList;

public class DoublyLinkedList {
    private DoublyLinkedIntNode head;
    private DoublyLinkedIntNode cursor;
    private DoublyLinkedIntNode tail;
    public DoublyLinkedList(){
        head = null;
        tail = null;
        cursor = null;
    }
    public void add(int element){
        DoublyLinkedIntNode newNode = new DoublyLinkedIntNode(element);
        if(tail == null){
            head = newNode;
            tail = head;
            cursor = head;
        }else{
            newNode.setPrevNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }
    
    public void addAtHead(int element) {
        DoublyLinkedIntNode newNode = new DoublyLinkedIntNode(element);
        if (head == null) {
            head = newNode;
            tail = head;
            cursor = head;
        } else {
            newNode.setNextNode(head);
            head.setPrevNode(newNode);
            head = newNode;
        }
    }
    public void removeAtTail(){
        if(tail == null){
            return;
        }else{
            tail = tail.getPrevNode();
            tail.setNextNode(null);
        }
    }
    public void removeAtHead(){
        if(head == null){
            return;
        }else{
            head = head.getNextNode();
            head.setPrevNode(null);
        }
    }
    public DoublyLinkedIntNode getHead(){
        return head;
    }
    
    public DoublyLinkedIntNode getTail() {
        return tail;
    }
    
    public DoublyLinkedIntNode getCursor() {
        return cursor;
    }
}
