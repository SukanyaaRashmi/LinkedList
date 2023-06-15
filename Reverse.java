public class Reverse {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null; 
        }
    }
    static Node head;
    public static void insertAtLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        
        return;
    }
    public static Node reverse(){
        Node curr=head;
        Node next=null;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
       head=prev;
       return head;
    }

    public static void display(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        insertAtLast(1);
        insertAtLast(2);
        insertAtLast(3);
        insertAtLast(4);
        insertAtLast(5);
        display(head);
        reverse();
        display(head);

    }
}
