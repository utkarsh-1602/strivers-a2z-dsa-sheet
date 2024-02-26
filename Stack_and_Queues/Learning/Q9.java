/*
    Name : Implement Min Stack : O(2N) and O(N) Space Complexity

    Problem Statement: Implement Min Stack | O(2N) and O(N) Space Complexity. Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    Input Format: [[ ], [-2], [0], [-3], [ ], [ ], [ ], [ ]] it represents this ["MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"]


    Result: [null, null, null, null, -3, null, 0, -2]
    Explanation: 
    stack < long long > st
    st.push(-2); Push element in stack
    st.push(0); Push element in stack
    st.push(-3); Push element in stack
    st.getMin(); Get minimum element fromstack
    st.pop(); Pop the topmost element
    st.top(); Top element is 0
    st.getMin(); Minimum element is -2

    Time Complexity: 
    Space Complexity:

    Reference: https://takeuforward.org/data-structure/implement-min-stack-o2n-and-on-space-complexity/
 */

import java.util.Stack;

class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x; 
        this.y = y;
    }
}


public class Q9 {

    static class MinStack{
        Stack<Pair> stack;

        public MinStack(){
            stack = new Stack<>();
        }

        public void push(int x){
            int min;
            if(stack.isEmpty()){
                min = x;
            }
            else{
                min = Math.min(stack.peek().y, x);
            }
            stack.push(new Pair(x, min));
        }

        public void pop() {
            stack.pop();
        }
    
        public int top() {
            return stack.peek().x;
        }
    
        public int getMin() {
            return stack.peek().y;
        }
    
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Minimum element: " + minStack.getMin()); // -3
        minStack.pop();
        System.out.println("Top element: " + minStack.top()); // 0
        System.out.println("Minimum element: " + minStack.getMin()); // -2
    }

}
