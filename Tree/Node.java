package Tree;

public class Node {
    private int data;
    private Node left, right;
    public Node(){
        left = null;
        right = null;
    }
    public Node(int data){
        left = null;
        right = null;
        this.data = data;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public void setRight(Node right){
        this.right = right;
    }
    public void setData(int data){
        this.data = data;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public int getData(){
        return data;
    }
}
