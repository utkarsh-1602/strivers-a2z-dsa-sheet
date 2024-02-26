/*
    Name : Implement Queue using linked list

    Problem Statement: Implement Queue using Singly LinkedList.

    But Why to use linked list ? 
    Use linked list for the stack, when the size of the stack is not known in advance.

    Operations Associated with queue are :

    Enqueue     (Insert Node at Rare End )
    Dequeue     (Delete Node from Front ) 
    Peek            (Return value of Front Node without Dequing)
    Empty         (Returns True when queue is empty else False)
    Size             (Returns size of Queue) 
 

    Time Complexity: O(1)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/implement-queue-using-linked-list/
 */


class QueueNode{
    int data;
    QueueNode next;
    QueueNode(int data){
        this.data = data;
        next = null; 
    }
 }

public class Q7{
    
    static class Queue{
    QueueNode Front = null;
    QueueNode Rear = null;
    int size = 0;

    boolean empty(){
        return Front == null;
    }

    int Peek(){

        if(empty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return Front.data;
        }
    }

    void Enqueue(int data){

        QueueNode temp = new QueueNode(data);
        
        if(temp == null){
            System.out.println("Queue is Full");
        }
        else{
            if(Front == null){
                Front = temp;
                Rear = temp;
            }
            else{
                Rear.next = temp;
                Rear = temp;
            }
        }
        System.out.println(data + " Enqueued into queue");
        size++;
    }

    void Dequeue(){
        if(Front == null){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println(Front.data + " Dequeued from queue");
            QueueNode temp = Front;
            Front = Front.next;
            size--;
        }
    }

}
    public static void main(String[] args) {
        
        Queue Q = new Queue();
        Q.Enqueue(10);
        Q.Enqueue(20);
        Q.Enqueue(30);
        Q.Enqueue(40);
        Q.Enqueue(50);
        Q.Dequeue();
        System.out.println("The size of the Queue is "+Q.size);
        System.out.println("The Peek element of the Queue is "+Q.Peek());

    }   
}
