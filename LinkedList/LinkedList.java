package LinkedList;
public class LinkedList {
    Node head, tail, cursor;
    public LinkedList(){
        head = null;
        tail = null;
        cursor = null;
    }
    public Node getHead(){
        return head;
    }
    
    public Node getTail() {
        return tail;
    }
    
    public Node getCursor() {
        return cursor;
    }

    public void add(int element){
        Node newNode = new Node<Integer>();
        newNode.data = element;
        if(head == null){
            head = newNode;
            tail = head;
            cursor = head;
        }else{
            tail.nextNode = newNode;
            tail = newNode;
        }
    }
    public void addAtHead(int element){
        Node newNode = new Node<Integer>();
        newNode.data = element;
        if (head == null) {
            head = newNode;
            tail = head;
            cursor = head;
        } else {
            newNode.nextNode = head;
            head = newNode;
            cursor = head;
        }
    }
    public void removeHead(){
        if(head == null) return;
        head = head.nextNode;
    }
    public int countOccurences(int target){
        Node temp = head;
        int answer = 0;
        while (temp != null) {
            if(target == (int) temp.data) answer++;
            temp = temp.nextNode;
        }
        return answer;
    }
    public void removeTail(){
        Node temp = head;
        if(temp == null) return;
        if(temp.nextNode == null){
            head = null;
        }
        if (temp.nextNode.nextNode == null) {
            tail = head;
        }
        while(temp != null){
            if(temp.nextNode.nextNode == null){
                tail = temp.nextNode;
                tail.nextNode = null;
                return;
            }
            temp = temp.nextNode;
        }
        return;
    }
    public int getSize(){
        Node temp = head;
        int answer = 0;
        while(temp != null){
            answer++;
            temp = temp.nextNode;
        }
        return answer;
    }
    
}
