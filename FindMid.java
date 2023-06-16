public class FindMid {
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

    public static int findMid(){
        if(head==null){
            return -1;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String args[]){
        insertAtLast(1);
        insertAtLast(2);
        insertAtLast(3);
        insertAtLast(4);
        insertAtLast(5);
        insertAtLast(6);
        System.out.println(findMid());
    }
}
