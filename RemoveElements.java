public class RemoveElements {
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
    public static Node remove(int val){
        if(head==null){
            return null;
        }
        Node dummy=new Node(-1);
        Node prev=dummy;
        dummy.next=head;
        while(head!=null){
            if(head.data==val){
                prev.next=head.next;
            }
            else{
                prev=head;
            }
            head=head.next;
        }
        return dummy.next;
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
        insertAtLast(6);
        insertAtLast(3);
        insertAtLast(4);
        insertAtLast(5);
        insertAtLast(6);
        display(head);
        remove(6);
        display(head);


    }
}
