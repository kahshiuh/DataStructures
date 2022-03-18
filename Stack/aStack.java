package Stack;

public class aStack {
    int size;
    private final int MAX_SIZE = 100;
    int[] data;
    public aStack(){
        size = 0;
        data = new int[MAX_SIZE];
    }
    public void push(int element){
        data[size] = element;
        size++;
    }
    public int pop(){
        if(size == 0) return -1;
        int ans = data[size-1];
        size--;
        return ans;
    }
    public int top(){
        int temp = pop();
        push(temp);
        return temp;
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
