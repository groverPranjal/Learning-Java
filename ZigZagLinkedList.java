public class ZigZagLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
   /// add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //print linked list

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
     //find mid
     public static Node findMid(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
     }
    // ZigZang change
     public static void change(){
        //find mid
        Node midNode=findMid();
        // break list into two
        Node curr=midNode.next;
        //reverse 2nd half
        midNode.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node left=head;
        Node right=prev;
        Node NextL,NextR;
        while(left!=null && right!=null){
            NextL=left.next;
            left.next=right;
            NextR=right.next;
            right.next=NextL;


            right=NextR;
            left=NextL;

        }

     }
    public static void main(String[] args) {
        ZigZagLinkedList ll=new ZigZagLinkedList();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        //1->2->3->4->5->6->null

        change();
        ll.print();

    }
}
