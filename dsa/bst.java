public class Bst{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=Null;
            this.right=Null;
        }
    }
    public static insert(Node root,int data){
        if(root==Null){
            return (new root(data));
        }
        if(data<root.data){
            root.left=insert(root.left,data);
            return root;
        }
        if(data>root.data){
            root.right=insert(root.right,data);
            return root;
        }
    }
    public void inorder(Node root){
        if(root!=Null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}
