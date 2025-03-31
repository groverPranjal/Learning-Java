public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add in LinkedList
    //add first 
    public void addfirst(int data){
        size++;
        //step1 create new node
        Node newNode=new Node(data); 
        if(head==null){
           head=tail=newNode;  
        }
        
        //step2 new node next=head
        newNode.next=head;//link
        //step 3 head=new node
        head=newNode;
    }

    //add last
    public void addlast(int data){
        size++;
        //step 1 create node
        Node newNode=new Node(data);
         if(head==null){
            head=tail=newNode;
         }
        //step 2 
        tail.next=newNode;
        //step3
        tail=newNode;

    }
    //add in middle
     public void addmiddle(int data,int index){
        if(index==0){
            addfirst(data);
            return;
        }
        size++;
        Node temp=head;
        Node newNode=new Node(data);
        int ind=0;
       while(ind<index-1){
          temp=temp.next;
          ind++;
       }
       newNode.next=temp.next;
       temp.next=newNode;

    }
    // remove first
    public int revmoveFirst(){
        if(size==0){
            System.out.println("Empty ll");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    //remove last
    public int removeLast(){
        if(size==0){
            System.out.println("Empty ll");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        //prev=i=i-2
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        return val;
    }

    //print linked list
    public void print(){
        Node temp=head;
        while(temp!=null){
         System.out.print(temp.data+"-->");
          temp=temp.next;
        }
        System.out.println("null");
    }

    ///search in ll
    public int IterationSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;

        }
        return -1;
    }

    //recursive search
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    //reverse a linked list
    public void reverse(){
        Node curr=tail=head;
        Node prev=null;
        Node next;
        while(curr!=null){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
        }
        head=prev;
    }
    public int SearchRec(int key){
       return helper(head, key);
    }
       // remove nth node from end
    public void deleteNthNode(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        //sz-n
        int i=1;
        Node prev=head;
        int idxtofind=sz-n;
        while(i<idxtofind){
         prev=prev.next;
         i++;
        }
        prev.next=prev.next.next;
        return ;

    }
    //find mid
    public Node FindMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next==null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPal(){ 
        if(head==null || head.next==null){
            return true;
        }
        //step1 find mid
        Node midNode=FindMid(head);

        //step 2 reverse 2nd half
         Node curr=midNode;
         Node prev=null;
         Node next;
         while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

         }
         Node right=prev;// right half head
         Node left=head;

        //step3 check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        //methods
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();
        ll.addmiddle(22, 2);
        ll.print();
        System.out.println(size);
        // ll.revmoveFirst();
        ll.print();
        // ll.removeLast();
        ll.print();
        ll.addmiddle(5,1); 
        ll.print();
    //    System.out.println( ll.IterationSearch(22));
    //    System.out.println(ll.SearchRec(22));
    //    ll.reverse();
    //    ll.print();
    ll.deleteNthNode(3);
    ll.print();
    }
}
