package Queue;
import LinkedList.LinkedList;
public class llQueue {
    private LinkedList data;
    public llQueue(){
        data = new LinkedList();
    }
    public void push(int element){
        data.addAtHead(element);
    }
    public int pop(){
        if(data.getHead() != null){
            int ans = data.getHead().getData();
            data.removeHead();
            return ans;
        }
        return 0;
        
    }
    public int peek(){
        if (data.getHead() != null) {
            int ans = pop();
            push(ans);
            return ans;
        }
        return 0;
    }
    
}
