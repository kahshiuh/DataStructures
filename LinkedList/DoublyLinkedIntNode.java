package LinkedList;

public class DoublyLinkedIntNode {
    private int data;
    private DoublyLinkedIntNode nextNode;
    private DoublyLinkedIntNode prevNode;

    public DoublyLinkedIntNode(){
        data = 0;
        nextNode = null;
        prevNode = null;
    }

    public DoublyLinkedIntNode(int data) {
        this.data = data;
        nextNode = null;
    }

    public int getData() {
        return data;
    }

    public DoublyLinkedIntNode getNextNode() {
        return nextNode;
    }
    
    public DoublyLinkedIntNode getPrevNode() {
        return prevNode;
    }

    public void setData(int element) {
        this.data = element;
    }

    public void setNextNode(DoublyLinkedIntNode node) {
        this.nextNode = node;
    }
    
    public void setPrevNode(DoublyLinkedIntNode node) {
        this.prevNode = node;
    }
    
}
