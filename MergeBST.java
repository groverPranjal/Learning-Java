import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeBST {
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
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);

    }

    public static Node balnceBST(ArrayList<Integer> arr,int st,int ed){
        if(st>ed){
            return null;
        }
        int mid=(st+ed)/2;
        Node root=new Node(arr.get(mid));
        root.left=balnceBST(arr, st, mid-1);
       root.right= balnceBST(arr, mid+1, ed);
        return root;

    }
    public static Node mergeBst(Node root1,Node root2){
        ArrayList<Integer> r1=new ArrayList<>();
        getInorder(root1,r1);

        ArrayList<Integer> r2=new ArrayList<>();
        getInorder(root2,r2);
        
        //merge
        int i=0,j=0;
        ArrayList<Integer> fin=new ArrayList<>();
        while(i<r1.size() && j<r2.size()){
            if(r1.get(i)<=r2.get(j)){
                fin.add(r1.get(i));
                i++;
            }
            else{
                fin.add(r2.get(j));
                j++;
            }
        }
        while(i<r1.size()){
            fin.add(r1.get(i));
            i++;
        }

        while(j<r2.size()){
            fin.add(r2.get(j));
            j++;
        }

        //sorted array to balnced bst
        Node root=balnceBST(fin, 0, fin.size()-1);
        return root;

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);


    } 
    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        Node root=mergeBst(root1, root2);
        preorder(root);
        System.out.println();
        inorder(root);
    }
}
