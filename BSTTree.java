import java.util.ArrayList;

public class BSTTree {
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
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right, val);
        }
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
    public static boolean SearchBST(Node root,int key){
       
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data<key){
            return SearchBST(root.right, key);
        }
        else{
            return SearchBST(root.left, key);
        }
    }
    public static Node delete(Node root,int key){
        if(root.data<key){
            root.right=delete(root.right,key);
        }
        else if(root.data>key){
            root.left=delete(root.left,key);
        }
        else{
            //case 1 leaf
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 1 child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case3 both child
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
       while(root.left!=null){
        root=root.left;
       }
       return root;
    }
    public static void PrintInRange(Node root,int start,int end){
        if(root==null){
            return ;
        }
        //case 1 k1<=root <=k2  both
        //case 2 root>k2 Right
        //case 2 root<k1 left
        if(root.data>=start && root.data<=end){
            PrintInRange(root.left, start, end);
            System.out.print(root.data+" ");
            PrintInRange(root.right, start, end);
        }
        else if(root.data<start){
            PrintInRange(root.left, start, end);
        }
        else{
            PrintInRange(root.right, start, end);
        }

    }
    public static void PrintPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRouteToLeaf(Node root,ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null  && root.right==null){
            PrintPath(path);
        }
        printRouteToLeaf(root.left, path);
        printRouteToLeaf(root.right, path);
        path.remove(path.size()-1);

    }

    public static boolean isValid(Node root,Node min,Node max){
     if(root==null){
        return true;
     }
     if(min!=null && root.data<=min.data){
         return false;
     }
     else if(max!=null && root.data>=max.data){
        return false;
     }

     return isValid(root.left, min,root) && isValid(root.right, root, max);
    }

    public static Node Mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftM=Mirror(root.left);
        Node rightM=Mirror(root.right);

        root.left=rightM;
        root.right=leftM;

        return root;

    }
    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<value.length;i++){
            root=insert(root,value[i]);
        }

        inorder( root);
        System.out.println(SearchBST(root, 6)); 

        // root=delete(root, 5);
        inorder(root);

        System.out.println();

        PrintInRange(root, 5, 12);
        System.out.println();
        ArrayList<Integer> path=new ArrayList<>();
        printRouteToLeaf(root, path);

        System.out.println(isValid(root, null, null));

        Mirror(root);
        inorder(root);

    }
}
