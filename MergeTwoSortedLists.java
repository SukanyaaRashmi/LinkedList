public class MergeTwoSortedLists {
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

    public static Node merge(Node list1, Node list2){
        Node dummy=new Node(-1);
        Node temp=dummy;

        while(true){
            if(list1==null){
                temp.next=list2;
                break;
            }
            if(list2==null){
                temp.next=list1;
                break;
            }

            if(list1.data<=list2.data){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}
