import java.util.Queue;
import java.util.LinkedList;

/*
    Name : Implement Stack Using Single Queue

    Problem Statement: Implement a Stack using a single Queue

    Approach:

    1. Take a single queue.
    2. push(x): Push the element in the queue.
    3. Use a for loop of size()-1, remove element from queue and again push back to the queue, hence the most recent element becomes the most former element and vice versa.
    4. pop(): remove the element from the queue.
    5. top(): show the element at the top of the queue.
    6. size(): size of the current queue.

    Repeat step3 at every insertion of the element.

    Time Complexity:O(N)

    Space Complexity:
        Whole Queue: O(n)



    Reference: https://takeuforward.org/data-structure/implement-queue-using-array/
 */


class Queuestack {
    
    Queue < Integer > q = new LinkedList <>();

    void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    int pop() {
        return q.remove();
    }
    int top() {
        return q.peek();
    }
    int size() {
        return q.size();
    }
}

public class Q3 {

    public static void main(String[] args) {
        Queuestack s = new Queuestack();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
    }

}
