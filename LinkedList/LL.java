
import java.util.Stack;

class Node {

    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class LL {

    static Node convertLLToArr(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }

    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static int lengthOfLL(Node head) {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    // INSERTION
    // inserting a node in the linked list
    static Node insertAtStart(Node head, int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        return head;
    }

    static Node insertAtEnd(Node head, int val) {
        if (head == null) {
            return head;
        }
        Node node = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    static Node insertAtK(Node head, int val, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(val);
            } else {
                return null;
            }
        }
        if (k == 1) {
            Node node = new Node(val, head);
            head = node;
            return head;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                Node node = new Node(val, temp.next);
                temp.next = node;
            }
            temp = temp.next;
        }
        return head;
    }

    // DELETION
    // deleting a node in the linked list
    static Node deleteHead(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        head = head.next;
        return head;
    }

    static Node deleteTail(Node head) {
        // if there is only one element in the LL we will not delete that node bec then then the LL will be empty
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }

    static Node deletek(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node slow = null;
        while (temp != null) {
            count++;
            if (count == k) {
                slow.next = slow.next.next;
                break;
            }
            slow = temp;
            temp = temp.next;
        }
        return head;
    }

    static Node delete_X(Node head, int x) {
        if (head == null) {
            return head;
        }
        while(head!=null && x == head.val) {
            head = head.next;
        }
        Node temp = head;
        Node slow = null;
        while (temp != null) {
            if (x == temp.val) {
                slow.next = slow.next.next;
            }
            slow = temp;
            temp = temp.next;
        }
        return head;
    }

    // Questions
    
    // Q1
    public static Node findmiddleNode(Node head) {
        // int len = lengthOfLL(head);
        // if (head == null) {
        //     return head;
        // }
        // int k = len / 2 + 1;
        // Node temp = head;
        // int count = 0;
        // while (temp != null) {
        //     count++;

        //     if (count == k) {
        //         return temp;
        //     }
        //     temp = temp.next;
        // }
        // return null;

        // 2nd approach
        // tortoise and hare method
        if(head==null || head.next==null)
        return head;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Q2
    public static Node removeDuplicates(Node head) {
        // if(head==null)
        // return null;
        // Node slow=head;
        // Node temp=head;
        // while(temp!=null)
        // {
        //     if(temp.val!=slow.val)
        //     {
        //         slow.next=temp;
        //         slow=slow.next;
        //     }
        //     temp=temp.next;
        // }
        // slow.next=temp;

        // return head;
        // 2nd approach
        if (head == null) {
            return null;
        }
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    // Q3
    public static  Node mergeTwoLists(Node list1, Node list2) {
         Node dnode =new Node(Integer.MIN_VALUE);
         Node headnode =dnode;
        while(list1 !=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                dnode.next=list1;
                list1=list1.next;
            }
            else
            {
                dnode.next=list2;
                list2=list2.next;
            }
            dnode=dnode.next;
        }
        if(list1==null)
        dnode.next=list2;
        else
        dnode.next=list1;
        headnode=headnode.next;
        return headnode;
    }
    
    // Q4
    public static Node MergeSortLL(Node head) {
        // Node temp = head;
        // List<Integer> list = new ArrayList<>();
        // while (temp != null) {
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // Collections.sort(list);
        // temp=head;
        // int idx=0;
        // while(temp!=null)
        // {
        //     temp.val=list.get(idx);
        //     idx++;
        //     temp=temp.next;
        // }
        // return head;

        // 2nd approach

        // base case
        if(head==null || head.next==null)
        return head;

        Node lefthead=head;
        Node middleNode=findmiddleNode(head);
        Node righthead=middleNode.next;
        middleNode.next=null;

        lefthead=MergeSortLL(lefthead);
        righthead=MergeSortLL(righthead);

        return mergeTwoLists(lefthead, righthead);

    }

    // Q5
     static boolean is_palindrome(Node head)  {
        if(head.next==null)
        return true;
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        while(temp!=null)
        {
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            if(temp.val!=st.pop())
            return false;
            temp=temp.next;
        }
        if(st.isEmpty())
        return true;
        else
        return false;

    }

    // Q6
    static Node even_oddLl(Node head)
    {
        if(head==null || head.next==null)
        return head;

        Node odd=head;
        Node even=head.next;
        Node evenHead=even;
        while(odd.next!=null && odd.next.next!=null && even!=null)
        {
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }

    // Q7
    static Node deleteMiddlNode(Node head){
        if( head.next==null)
        return null;
        Node fast=head;
        Node slow=new Node(0);
        slow.next=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }


    // Q8
    static Node NthNodeFromEnd(Node head,int n)
    {
        if(head.next==null)
        return null;

        int size=lengthOfLL(head);
        int k=size-n+1;
        Node temp=head;
        Node prev=head;
        if(k==1)
        {
            head=head.next;
            return head;
        }

        while(temp!=null)
        {
            if(k==1)
            {
                prev.next=prev.next.next;
                return head;
            }
            prev=temp;
            temp=temp.next;
            k--;
        }

        return head;
    }

    // Q9
    static Node Reverse(Node head){
        if(head==null || head.next==null)
        return head;
        Node curr=head;
        Node prev=null;
        Node temp=curr.next;
        while(curr!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=temp;
            if(temp!=null) temp=temp.next;
        }
        return prev;
    }
 
    //Q10
    static Node Reorder(Node head){
        Node middleNode =findmiddleNode(head);
        Node secondhalf=Reverse(middleNode.next);
        middleNode.next=null;
        // middleNode.next=secondhalf;
        // the ll is reversed from the middel node
        Node fh=head;
        Node sh=secondhalf;
        while(sh!=null)
        {
            Node temp1=fh.next;
            Node temp2=sh.next;
            fh.next=sh;
            sh.next=temp1;
            fh=temp1;
            sh=temp2;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3,4};
        // int arr2[] = new int[]{1,2,3,4};
        Node head = convertLLToArr(arr1);
        // Node head2 = convertLLToArr(arr2);

        // traversal in ll
        printLL(head);
        // printLL(head2);
        // head=insertAtStart(head, 0);
        // printLL(head);
        // head=insertAtEnd(head, 5);
        // printLL(head);
        // head=deleteHead(head);
        // printLL(head);
        // head=deleteTail(head);
        // printLL(head);
        // head=deletek(head, 0);
        // head=delete_X(head, 4);
        // head=insertAtK(head, 0, 1);
        // head = findmiddleNode(head);
        // head = removeDuplicates(head);
        // head=MergeSortLL(head);
        // System.out.println(is_palindrome(head));
        // head=even_oddLl(head);
        // head=deleteMiddlNode(head);
        // head=NthNodeFromEnd(head, 1);
        Reorder(head);

    }
}
