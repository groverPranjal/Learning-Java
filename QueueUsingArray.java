public class QueueUsingArray{

    static class Queue{
       static int arr[];
       static int size;
       static int rear;
       static int front;

       Queue(int n){
        size=n;
        arr=new int[n];
        rear=-1;
        front=-1;
       }
       public static boolean isEmpty(){
        return rear==-1 && front==-1;
       }
       //is full
       public static boolean isFull(){
        return (rear+1)%size==front;
       }
       //add function
       public static void add(int data){
         if(rear==size-1){
            System.out.println("Queue is full");
            return;
         }
         if(front==-1){
          front=0;
         }
         rear=(rear+1)%size;
         arr[rear]=data;
       }
       //remove
       public static int remove(){
         if(isEmpty()){
            System.out.println("queue empty");
            return -1;
         }
         int res=arr[0];
         
         if(rear==front){
          rear=front=-1;
         }
         else{
          front=(front+1)%size;
         }
         return res;
       }
       //peek
       public static int peek(){
        if(isEmpty()){
            System.out.println("queue empty");
            return -1;
         }
         return arr[0];
       }

    }
    public static void main(String[] args){
      Queue q=new Queue(5);
      q.add(1);
      q.add(2);
      q.add(3);

      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }
    }
}
