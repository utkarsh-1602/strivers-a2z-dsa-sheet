/*
    Name : Sort LinkedList

    Problem Statement: Given the head of a linked list, return the list after sorting it in ascending order.

    Input: head = [4,2,1,3]
    Output: [1,2,3,4]

    Input: head = [-1,5,3,4,0]
    Output: [-1,0,3,4,5]

    Input: head = []
    Output: []

    Approach: bruteforce

    Time Complexity:
    For doing mergeSort: O(NLogN)
    For traversal in LinkedList 2 Times: O(2N)

    Overall Time Complexity: O(NLogN) + O(2N) = O(NLogN) 

    Space Complexity:
    For storing LinkedList in ArrayList: O(N)
    For doing mergeSort: O(N)

    Overall Time Complexity: O(2N) = O(N)

    Reference: https://leetcode.com/problems/sort-list/description/
 */

import java.util.ArrayList;

public class Q10_bruteforce{

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

    static void merge(ArrayList<Integer> arr, int low, int mid, int high) {

        // creating temporary array to store left and right half in sorted order 
        ArrayList<Integer> temp = new ArrayList<Integer>(); 

        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high) {

            if(arr.get(left) <= arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }
            else{
                temp.add(arr.get(right));
                right++;
            }

        }


        // if elements on the left half are still remaining
        while(left <= mid){
            temp.add(arr.get(left));
            left++;
        }

        // if elements on the right half are still remaining
        while(right <= high){
            temp.add(arr.get(right));
            right++;
        }

        // transfering all elements from temporary arr to our original array
        for(int i = low; i<= high; i++){
            arr.set(i, temp.get(i-low));
        }
    }

    static void mergeSort(ArrayList<Integer> arr, int low, int high){

        if(low >= high) return;

        int mid = (low+high)/2;

        mergeSort(arr, low, mid); // left half 
        mergeSort(arr, mid+1, high); // right half
        merge(arr, low, mid, high); // merging sorted halfs

    }

    static Node sortLL(Node head){

        if(head == null || head.next == null) return head;

        ArrayList<Integer> arr = new ArrayList<>();

        Node temp = head;
        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }

        mergeSort(arr, 0, arr.size()-1);

        temp = head;
        for(int i = 0; i<arr.size(); i++){
            temp.data = arr.get(i);
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        
        int[] arr = {4,2,1,3};

        Node head = convertArrayToLL(arr);
        head = sortLL(head);
        printLL(head);

    }
}