import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

class BinaryTree
{
    Scanner sc=new Scanner (System.in);
    
    Node  create()
    {
        
        System.out.println("Enter the value:");
        int data=sc.nextInt();
        if (data==-1) {
            return null;
        }
        Node root=new Node(data);
        System.out.println("Enter the left child of "+root.data);
        root.left=create();
        System.out.println("Enter the right child "+root.data);
        root.right=create();
        return root;
    }

    void display(Node root)
    {
        if(root==null)
        return; 
        System.out.print(root.data+" -> ");
        if(root.left!=null) System.out.print(root.left.data+",");
        if (root.right!=null) System.out.print(root.right.data);
        System.out.println();
        display(root.left);
        display(root.right);
    }
    void preorder(Node root) //root L R
    {
        if(root==null)
        return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(Node root) //L root R
    {
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    void postorder(Node root) //L R root
    {
        if (root==null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    void bfs(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0)
        {
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
    }
    void min(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return min(Math.min(root.val,));
    }
    
}
class tree_impl
{
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Node root=tree.create();
        tree.bfs(root);

    }
}


