class Node
{
    int val;
    Node next;
    Node prev;
    
    public Node(int val) {
        this.val=val;
        next=null;
        prev=null;
    }
    public Node(int val,Node next,Node prev)
    {
        this.val=val;
        this.next=null;
        this.prev=prev;
    }
    
}

public class DLL {
   static  Node convertArrToDLL(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node backNode=head;
        for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i],null,backNode);
            backNode.next=temp;
            backNode=temp;
        }
        return head;
    }

   static  void print(Node head)
    {
        Node temp=head;
        System.out.println("DLL:");
        while(temp!=null)
        {
            System.err.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    static Node DeleteHead(Node head)
    {
        if(head==null || head.next==null)
        return null;
        Node prev=head;
        head=head.next;
        head.prev=null;
        prev.next=null;
        return head; 
    }

    static Node DeleteTail(Node head){
        if(head==null ||head.next==null)
        return null;
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        Node front=temp.next;
        temp.next=null;
        front.prev=null;
        return head;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=convertArrToDLL(arr);
        // head=DeleteHead(head);
        head=DeleteTail(head);
        print(head);
    }
}
