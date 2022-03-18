package Tree;

public class Tree {
    private Node root;
    public Tree(){
        root = null;
    }
    public Node getRoot(){
        return root;
    }
    public boolean search(Node n, int target){
        if(n.equals(null)){
            return false;
        }else{
            if(n.getData() == target){
                return true;
            }
        }
        return search(n.getRight(), target) || search(n.getRight(), target);
    }
    
}
