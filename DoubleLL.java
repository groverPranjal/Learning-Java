public class DoubleLL {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

        
    }
    public static Node  head;
    public static Node tail;
    public static int size;

    //add first
    public void addFirst(int data){
        Node NewNode=new Node(data);
        size++;
        if(head==null){
           head=tail=NewNode;
           return;

        }
        NewNode.next=head;
        head.prev=NewNode;
        head=NewNode;
    }

    // remove first
    public void removefirst(){
        if(head==null){
            System.out.println("Dll empty");
            return ;
        }
        if(size==1){
            head=tail=null;
            size--;
            return ;
        }
        // int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
    }
    //print 
    public void print(){
        Node temp=head;
      
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //reverse 
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
         next=curr.next;
         curr.next=prev;
         curr.prev=next;
         prev=curr;
         curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
      DoubleLL dll=new  DoubleLL(); 
      dll.addFirst(4);
      dll.addFirst(3);
      dll.addFirst(2);
      dll.addFirst(1);
      dll.print();
      System.out.println(dll.size);
      dll.reverse();
      dll.print();
    }

}
