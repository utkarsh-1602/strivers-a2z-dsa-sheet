package LinkedList.medium;

/*
    Name : Find intersection of Two Linked Lists

    Problem Statement: Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

    Input:
    List 1 = [1,3,1,2,4], List 2 = [3,2,4]
    Output: 2
    Explanation: Here, both lists intersecting nodes start from node 2.

    Input:
    List1 = [1,2,7], List 2 = [2,8,1]   
    Output: Null
    Explanation: Here, both lists do not intersect and thus no intersection node is present.

    Approach: bruteforce

    Time Complexity: O(M*N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/
 */

public class Q12_bruteforce{

    public static class Node {
        int data;
        Node next;
    
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    static Node convertArrayToLL(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;
  
        for(int i = 1; i < arr.length; i++){
           Node temp = new Node(arr[i], null);
           prev.next = temp;
           prev = temp;
        }
  
        return head;
  
     }


    static Object findIntersectionLL(Node list1, Node list2){
        while(list2 != null) {
            Node temp = list1;
            while(temp != null) {
                //if both nodes are same
                if(temp == list2) return list2;
                temp = temp.next;
            }
            list2 = list2.next;
        }
        //intersection is not present between the lists return null
        return null;
    
    }

    public static void main(String[] args) {
        
        int[] arr = {1,3,1,2,4};
        int[] arr2 = {3,2,4};

        Node list1 = convertArrayToLL(arr);
        Node list2 = convertArrayToLL(arr2);

        Object result = findIntersectionLL(list1, list2);
        System.out.println(result);
    }
}