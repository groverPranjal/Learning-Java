import java.util.ArrayList;

public class BSTTreeTwo {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);


    } 
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node Create(int[] arr,int start,int end){
        if(start>end) {
            return null;
        }
        
        int mid=(start+end)/2;
         Node root=new Node(arr[mid]);

         root.left=Create(arr, start, mid-1);
         root.right=Create(arr,mid+1,end);

         return root;
    }
    public static void getInorder(Node root,ArrayList<Integer>in){
        if(root==null){
            return;
        }
        getInorder(root.left, in);
        in.add(root.data);
        getInorder(root.right, in);
    }
    public static Node balnceBST(Node root){
        //inorder seq
        ArrayList<Integer> in=new ArrayList<>();
        getInorder(root, in);

        //sorted inorder->balance bst
        root=createBST(in, 0, in.size()-1);
        return root;


    }
    public static Node createBST(ArrayList<Integer>in,int st,int ed){
       if(st>ed){
        return null;
       } 
       int mid=(st+ed)/2;
       Node root=new Node(in.get(mid));
       root.left=createBST(in, st, mid-1);
       root.right=createBST(in, mid+1, ed);

       return root;
    }
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST,int size,int min,int max){
        this.isBST=isBST;
        this.size=size;
        this.min=min;
        this.max=max;

    }}
    public static int maxBSt=0;
    public static Info largestbsT(Node root){

        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
       Info left=largestbsT(root.left);
       Info right=largestbsT(root.right);

       int size=left.size+right.size+1;
       int min=Math.min(root.data,Math.min(left.min,right.min));
       int max=Math.max(root.data,Math.max(left.max,right.max));

       if(root.data<=left.max || root.data>=right.min){
        return new Info(false,size,min,max);
       }

       if(left.isBST && right.isBST){
            maxBSt=Math.max(maxBSt,size);
            return new Info(true,size,min,max);
       }

       return new Info(false,size,min,max);
    }

    
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

      largestbsT(root);
      System.out.println(maxBSt);
    }
}
