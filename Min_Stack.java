import java.util.Stack;


public class Min_Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Stack<Integer> stk = new Stack<Integer>();
    Stack<Integer> minstk = new Stack<Integer>();
    
    public void push(int x) {
        stk.push(x);
        
        if(minstk.isEmpty() || x<=minstk.peek())
            minstk.push(x);
    }

    public void pop() {
        
        int tmp=stk.pop();
        if(tmp==minstk.peek())
            minstk.pop();
    }

    public int top() {
        
        return stk.peek();
    }

    public int getMin() {
        
        return minstk.peek();
    }
}
