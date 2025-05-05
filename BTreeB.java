import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BTreeB {
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
        public static boolean isSubtree(Node root,Node subroot){
            if(root==null){
                return false;
            } 
            if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
             }
             

             return isSubtree(root.left, subroot)|| isSubtree(root.right, subroot);
        }
        public static boolean isIdentical(Node root,Node subroot){
            if(root==null && subroot==null){
                 return true;
            }
            else if(root==null || subroot==null || root.data!=subroot.data){
                return false;
            }

            if(!isIdentical(root.left, subroot.left)){
                return false;
            }
            if(!isIdentical(root.right, subroot.right)){
                return false;
            }
                 return true;
        }
        static class View{
            Node node;
            int hd;

            public View(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        public static void TopView(Node root){
            //level order
            Queue<View> q=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();

            int min=0,max=0;
            q.add(new View(root,0));
            q.add(null);

            while(!q.isEmpty()){
                View curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{

                
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }

                if(curr.node.left!=null){
                    q.add(new View(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);

                }
                if(curr.node.right!=null){
                    q.add(new View(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
        }
            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+"  ");
            }
            System.out.println();
        }

        public static void KthLevel(Node root,int level,int k){
             if(root==null){
                return ;
             }
             if(level==k){
                System.out.print(root.data+" ");
                return;
             }
             KthLevel(root.left, level+1, k);
             KthLevel(root.right, level+1, k);
        }

        public static boolean getPath(Node root,int n,ArrayList<Node> path){
             if(root==null  ){
                return false;
             }
            path.add(root);

            if(root.data==n){
                return true;
            }
            boolean lef=getPath(root.left, n, path);
            boolean rig=getPath(root.right, n, path);

            if(lef || rig ){
                return true;
            }
            path.remove(path.size()-1);
            return false;


        }

        public static Node lca(Node root,int n1,int n2){ //o(n);
           ArrayList<Node>path1=new ArrayList<>();
           ArrayList<Node>path2=new ArrayList<>();

           getPath(root,n1,path1);
           getPath(root,n2,path2);
           //last comman acesor
           int i=0;
           for(;i<path1.size() && i<path2.size();i++){

            if(path1.get(i)!=path2.get(i)){
                break;
            }

           }
           
           return path1.get(i-1);

        }

        public static Node lca2(Node root,int n1,int n2){
            if(root==null){
                return root;
            }
        
            if(root.data==n1 || root.data==n2){
                return root;
            }

            Node left=lca2(root.left,n1,n2);
            Node right=lca2(root.right,n1,n2);

            //left=val right=null
            if(right==null) {
                return left;
            }
            if(left==null){
                return right;
            }
            return root;
        }
        public static int minDist(Node root,int n1,int n2){
            Node l=lca2(root,n1,n2);
            int d1=lcaDis( l,n1);
            int d2=lcaDis( l,n2);
            return d1+d2;

        }
        public static int lcaDis(Node root,int n1){
            if(root==null){
                return -1;
            }
            if(root.data==n1){
                return 0;
            }
            int left=lcaDis(root.left,n1);
            int right=lcaDis(root.right,n1);
            if(left==-1 && right==-1){
                return -1;
            }
            else if(left==-1){
                return right+1;
            }
            else{
                return left+1;
            }

        }
        public static int KAncestor(Node root,int n,int k){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int left=KAncestor(root.left, n, k);
            int right=KAncestor(root.right, n, k);

            if(left==-1 && right==-1){
                return -1;
            }
            int max=Math.max(left,right);
            if(max+1==k){
                System.out.println(root.data);
            }
            return max+1;
        }
        public static int SumofTree(Node root){
          if(root==null){
            return 0;
          }
          int left=SumofTree(root.left);
          int right=SumofTree(root.right);
          int dat=root.data;

        int newleft=root.left==null?0:root.left.data;
         int newright=root.right==null?0:root.right.data;
         
          root.data=left+right+newleft+newright;


          return dat;

        }
        public static void preorder(Node root){
            if(root==null){
                return ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
         }
    
    public static void main(String[] args) {
    /*       1  
            /  \
            2   3
            /\  /\
            4 5 6 7
      */ 
      Node root =new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.left=new Node(6);
      root.right.right=new Node(7);
      
      /*
         2
         /\
         4 5
       */
      Node subroot=new Node(2);
      subroot.left=new Node(4);
      subroot.right=new Node(5);

    //   System.out.println(isSubtree(root,subroot));
    //   TopView(root);
    //   int k=3;
    //   KthLevel(root, 1, k);

    //   int n1=4;
    //   int n2=5;
    //   System.out.println(lca2(root, 6, 7).data);
    //   System.out.println(minDist(root, 6,4));
      System.out.println(KAncestor(root, 5, 1));
      SumofTree(root);
      preorder(root);

            
    }
}
