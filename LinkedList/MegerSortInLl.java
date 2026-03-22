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

public class MegerSortInLl {

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

        Node middleNode=findmiddleNode(head);
        Node righthead=middleNode.next;
        middleNode.next=null;
        Node lefthead=MergeSortLL(head);
        righthead=MergeSortLL(righthead);
        return mergeTwoLists(lefthead, righthead);

    }

    static Node convertLLToArr(int arr[]) {
        if(arr.length==0)
        return null;
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

     public static void main(String[] args) {
        int arr[] = new int[]{5,2,6,1,9,6};
        Node head = convertLLToArr(arr);
        printLL(head);
        head=MergeSortLL(head);
        printLL(head);

    }
    
}
