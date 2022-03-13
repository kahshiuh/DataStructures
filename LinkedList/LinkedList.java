package LinkedList;
public class LinkedList {
    IntNode head, tail, cursor;
    public LinkedList(){
        head = null;
        tail = null;
        cursor = null;
    }
    public IntNode getHead(){
        return head;
    }
    
    public IntNode getTail() {
        return tail;
    }
    
    public IntNode getCursor() {
        return cursor;
    }

    public void addAtEnd(int element){
        IntNode newNode = new IntNode(element);
        if(head == null){
            head = newNode;
            tail = head;
            cursor = head;
        }else{
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }
    public void addAtHead(int element){
        IntNode newNode = new IntNode(element);
        if (head == null) {
            head = newNode;
            tail = head;
            cursor = head;
        } else {
            newNode.setNextNode(head);
            head = newNode;
            cursor = head;
        }
    }
    public void removeHead(){
        if(head == null) return;
        head = head.getNextNode();
    }
    public int countOccurences(int target){
        IntNode temp = head;
        int answer = 0;
        while (temp != null) {
            if(target == temp.getData()) answer++;
            temp = temp.getNextNode();
        }
        return answer;
    }
    public int getSize(){
        IntNode temp = head;
        int answer = 0;
        while(temp != null){
            answer++;
            temp = temp.getNextNode();
        }
        return answer;
    }
    
}
