package LinkedList;
public class IntNode{
    private int data;
    private IntNode nextNode;
    public IntNode(){
        data = 0;
        nextNode = null;
    }
    public IntNode(int data) {
        this.data = data;
        nextNode = null;
    }
    public int getData(){
        return data;
    }
    public IntNode getNextNode(){
        return nextNode;
    }
    public void setData(int element){
        this.data = element;
    }
    public void setNextNode(IntNode node){
        this.nextNode = node;
    }
}