import java.util.LinkedList;
import java.util.Queue;

public class BTreeA {

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

    static class BinaryTree{
    static int idx= -1;

     public static Node buildTree(int nodes[]){
      idx++;
      if (idx >= nodes.length || nodes[idx] == -1) {
        return null; 
    }

       Node newNode=new Node(nodes[idx]);
       newNode.left=buildTree(nodes);
       newNode.right=buildTree(nodes);

       return newNode;
     } 
     
     public static void preoder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preoder(root.left);
        preoder(root.right);
     }
     public static void Inoder(Node root){
        if(root==null){
            return ;
        }
        Inoder(root.left);
        System.out.print(root.data+" ");
        Inoder(root.right);
     }

     public static void Postoder(Node root){
        if(root==null){
            return ;
        }
        Postoder(root.left);
        Postoder(root.right);
        System.out.print(root.data+" ");
        
     }

     public static void LevelOrder(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> q=new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
              System.out.println();
              if(q.isEmpty()){
                break;
              }
              else{
                q.add(null);
              }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
     }

     public int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);

        int height=Math.max(lh,rh)+1;
        return height;

     }

     public int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);

        return lc+rc+1;
     }

     public int sumofNode(Node root){
        if(root==null){
            return 0;
        }

        int leftsum=sumofNode(root.left);
        int rightsum=sumofNode(root.right);

        return leftsum+rightsum+root.data;

     }

     public  int diameteroneapp(Node root){
        if(root==null){
            return 0;
        }

        int leftd=diameteroneapp(root.left);
        int leftH=height(root.left);
        int rightd=diameteroneapp(root.right);
        int rightht=height(root.right);

        int selfd=leftH+rightht+1;

        return Math.max(selfd,Math.max(rightd,leftd));
     }
     class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
          this.ht=ht;
          this.diam=diam;
        }
     }
     public Info diameter(Node root){

        if(root==null){
            return new Info(0,0);
        }
      
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);

        int dia=Math.max(leftInfo.ht+rightInfo.ht+1,Math.max(leftInfo.diam,rightInfo.diam));

        int ht=Math.max(leftInfo.diam,rightInfo.diam)+1;

        return new Info(dia,ht);


     }

    }

    
    


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        BinaryTree tree=new BinaryTree();
       Node root= tree.buildTree(nodes);
       System.out.println(root.data);

       tree.preoder(root);
    //    System.out.println();
    //    tree.Inoder(root);
    //    System.out.println();
    //    tree.Postoder(root);

    //    System.out.println();
    //    tree.LevelOrder(root);

       System.out.println(tree.height(root));
       System.out.println(tree.count(root));
       System.out.println(tree.sumofNode(root));
       System.out.println(tree.diameter(root).diam);
    }
}
