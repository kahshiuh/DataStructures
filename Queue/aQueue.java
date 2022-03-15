package Queue;

import Errors.EmptyStructureException;
import Errors.OutOfSpaceException;

public class aQueue {
    private int[] data;
    private int currentSize;
    private final int MAX_SIZE = 100;
    public aQueue(){
        data = new int[MAX_SIZE];
        currentSize = 0;
    }
    public void push(int element){
        if(currentSize == MAX_SIZE){
            throw new OutOfSpaceException();
        }else{
            data[currentSize] = element;
            currentSize++;
        }
    }
    public int pop(){
        if(currentSize == 0 ){
           return 0;
        }else{
            int ans = data[currentSize];
            currentSize--;
            return ans;
        }
    }
    public int peek(){
        if(currentSize == 0) throw new OutOfMemoryError();
        int temp = pop();
        push(temp);
        return temp;
    }

}
