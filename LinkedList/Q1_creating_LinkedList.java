package LinkedList;

class Node {
    int data; // the data value
    Node next; // the reference to the next Node in the linked list

    // Constructors 
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    // the last element 
    Node(int data1){
        this.data = data1;
        this.next = null;
    }

}

public class Q1_creating_LinkedList{
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        // Creating a new Node with the value from the array
        Node y = new Node(arr[0]);
        System.out.println(y.data);
    }
}