public class GetNthNodefromend {
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

    public static void getNthNode(int n){
        Node first=head;
        Node last=head;
        int count=0;
        if(head!=null){
            while(count<n){
            if(last==null){
                System.out.println("The n is greater than the length of the list");
                return;
            }
            last=last.next;
            count++;
        }

        if(last==null){
            if(head!=null){
                System.out.println("Nth Node from the last"+ head.data);
                return;
            }
        }
        else{
            while(last!=null){
                first=first.next;
                last=last.next;
            }
            System.out.println("Nth from the last :" + first.data);
        }
    } 
    }

    public static void main(String args[]){
        insertAtLast(1);
        insertAtLast(2);
        insertAtLast(3);
        insertAtLast(4);
        insertAtLast(5);

        getNthNode(3);
    }
}
