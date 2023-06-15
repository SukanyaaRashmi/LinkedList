public class BasicOperation{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    public static void insertAtStart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            System.out.println(data+"added to the list");
            return;
        }
        newNode.next=head;
        head=newNode;
        System.out.println(data+"added to the list");
        return;
    }

    public static void insertAtLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            System.out.println(data+"added to the list");
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        System.out.println(data+"added to the list");
        return;
    }

    public static void insertAfter(Node prev, int data){
        Node newNode=new Node(data);
        if(prev==null){
            System.out.println("The previous node can not be null");
            return;
        }
        newNode.next=prev.next;
        prev.next=newNode;

    }

    public static void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void deleteAtFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        int x=head.data;
        head=head.next;
        System.out.println(x+" removed from the list");
    }

    public static void deleteAtLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        Node last=head;
        Node sec_last=null;
        while(last.next!=null){
            sec_last=last;
            last=last.next;
        }
        int x=last.data;
        sec_last.next=null;
        System.out.println(x+"removed from the list");

    }


    public static void main(String args[]){
        insertAtStart(5);
        insertAtStart(4);
        insertAtStart(3);
        insertAtStart(2);
        insertAtStart(1);
        display();
        deleteAtLast();
        display();
    }
}