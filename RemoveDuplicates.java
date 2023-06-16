public class RemoveDuplicates {
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
            //System.out.println(data+"added to the list");
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        //System.out.println(data+"added to the list");
        return;
    }

    public static Node removeduplicates(){
        Node curr=head;
        while(curr!=null){
            Node temp=curr;
            while(temp!=null && temp.data==curr.data){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
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
        insertAtLast(11);
        insertAtLast(11);
        insertAtLast(11);
        insertAtLast(12);
        insertAtLast(13);
        insertAtLast(13);
        insertAtLast(14);
        insertAtLast(15);
        insertAtLast(15);
        display(head);
        removeduplicates();
        display(head);
    }
}
