package com.company.linkedlist;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public Node head;
    private Node tail;

    private static Node head1;

    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null){
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(head==null){
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void addMiddle(int data, int index){
        Node node = new Node(data);
        Node temp = head;
        int length = length();
        if(index<0||index>length-1){
            throw new LinkedListIndexOutOfBound("Trying to access: "+index);
        }
        if(index==0||index==length-1){
            throw new LinkedListIndexOutOfBound(index+": is not a middle index.");
        }
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public int removeFirst(){
        int length = length();
        if(length==0){
            System.out.println("List is empty, nothing left to remove");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if(length==1){
            head = null;
            tail = null;
            return val;
        }
        head = head.next;
        return val;
    }

    public int removeLast(){
        Node temp = head;
        int length = length();
        if(length==0){
            System.out.println("List is empty, nothing left to remove");
            return Integer.MIN_VALUE;
        }
        int val = tail.data;
        if(length==1){
            head = null;
            tail = null;
            return val;
        }
        while(temp.next!=tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return val;
    }

    public int length(){
        Node temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public int itrSearch(int value){
        Node temp = head;
        int length = length();
        for(int i=0; i<length; i++, temp=temp.next){
            if(temp.data==value){
                return i;
            }
        }
        return -1;
    }

    public int recurSearch(int value){
        return recurSearch(head, 0, value);
    }

    public int recurSearch(Node node, int index, int value){
        if(node==null){
            return -1;
        }
        if(node.data==value){
            return index;
        }
        return recurSearch(node.next, index+1, value);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public int removeFromLast(int pos){
        int posFromStart = (length() - pos)+1;
        Node temp = head;
        for(int i=2; i<posFromStart; i++){
            temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = temp.next.next;
        return data;
    }

    public Node findMidNode(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        if(head.next.next==null){
            return false;
        }

        //step 1 - find mid
        Node midNode = findMidNode();

        //step 2 - reverse right half
        Node prev = null;
        Node curr = midNode;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        //step 3 - check left half and right half
        boolean isPalindrome = true;
        while(right!=null){
            if(left.data!=right.data){
                isPalindrome = false;
                break;
            }

            left = left.next;
            right = right.next;
        }

        //step 4 - reverse the right and join with the left to undo the changed list.

        prev = null;
        curr = tail;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return isPalindrome;
    }

    private static boolean isCycle(){
        Node slow = head1;
        Node fast = head1;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                return true;
            }
        }

        return false;
    }

    private static void removeCycle(){
        Node slow = head1;
        Node fast = head1;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                break;
            }
        }

        if(fast!=slow){
            return;
        }

        slow = head1;
        Node prev = null;

        while(slow!=fast || (fast==head1&&prev==null)){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        if(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        if(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    private Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        //find mid
        Node mid = getMid(head);
        //sort left and right
        Node rightHead = mergeSort(mid.next);
        mid.next = null;
        Node leftHead = mergeSort(head);
        //merge left and right
        return merge(leftHead, rightHead);
    }

    public void sort(){
        head = mergeSort(head);
    }

    public String toString(){
        String str = "";
        Node temp = head;
        while(temp!=null){
            str += temp.data+" ";
            temp = temp.next;
        }
        return str;
    }

    public static void main(String[] args) {
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = head1;
        System.out.println("Is cycle exist: "+isCycle());
        removeCycle();
        System.out.println("Is cycle exist after removing the cycle: "+isCycle());
    }
}

class LinkedListIndexOutOfBound extends RuntimeException {
    LinkedListIndexOutOfBound(String message){
        super(message);
    }
}
