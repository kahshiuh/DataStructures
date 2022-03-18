package Tree;

public class N_aryNode {
    private Node[] children;
    private N_aryNode(int childrenNodes){
        children = new Node[childrenNodes];
        for(int i = 0; i < childrenNodes; i++){
            children[i] = new Node();
        }
    }
}
