package Stack;

import LinkedList.LinkedList;

public class llStack {
    private LinkedList data;
    public llStack(){
        data = new LinkedList();
    }
    public void push(int element){
        data.addAtHead(element);
    }
    public int pop(){
        int ans = data.getHead().getData();
        data.removeHead();
        return ans;
    }
    public int peek(){
        int temp = pop();
        data.addAtHead(temp);
        return temp;
    }
}
