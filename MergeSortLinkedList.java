// import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortLinkedList {   
     static Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public Node findMid(Node head) {  // Pass head as a parameter
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;  // Fixed assignment
        }
        return slow;
    }
    
    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;  // Fixed reference
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        
        return mergedLL.next;
    }
    
    public Node mergeSort(Node head) {
        // Base case:
        if (head == null || head.next == null) {
            return head;
        }
        
        // Find mid
        Node mid = findMid(head);
        
        // Divide in two
        Node rightHead = mid.next;
        mid.next = null;
        
        Node NewLeft = mergeSort(head);
        Node NewRight = mergeSort(rightHead);
    
        // Merge two linked lists into one
        return merge(NewLeft, NewRight);
    }

   

    public static void main(String[] args) {
        MergeSortLinkedList ll = new MergeSortLinkedList();  // Fixed incorrect object instantiation
        ll.addFirst(5);
        ll.addFirst(9);
        ll.addFirst(11);
        ll.addFirst(3);
        ll.addFirst(10);
        
        System.out.println("Before sorting:");
        ll.print();
        
        head=ll.mergeSort(head);  // Call merge sort
        
        System.out.println("After sorting:");
        ll.print();
    }
}
