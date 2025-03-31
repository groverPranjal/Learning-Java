public class LinkedListTwo {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    // to check node has loop or cycle or not
    public static int checkCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int cycle=1;
                Node temp=slow.next;
                while(temp!=slow){
                    cycle++;
                    temp=temp.next;
                }
                return cycle;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Creating nodes
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Making it circular
        head.next.next.next = head; 
        int n=checkCycle(head);
        System.out.println(n);

     
    }

  
    }

