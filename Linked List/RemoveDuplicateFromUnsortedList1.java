import java.util.HashSet;
class LinkedList{
                            Node head;
                            class Node{
                                    int data;
                                    Node next;
                                       Node(int data)
                                       {
                                               this.data=data;
                                       }
                            }
                            public void display(Node head){
                                        Node temp=head;
                                        while(temp!=null){
                                                 System.out.print(temp.data+"->");
                                                 temp=temp.next;
                                        }
                                        System.out.println("END");
                            }
                            public void insertAtEnd(int data)
                            {
                                             Node nn=new Node(data);
                                                 if(head==null)
                                                 {
                                                       head=nn;
                                                 }
                                                 else{
                                                           Node temp=head;
                                                           while(temp.next!=null){
                                                                   temp=temp.next;
                                                           }
                                                           temp.next=nn;
                                                 }
                            }
                            public Node removeDuplicate(Node head)
                            {
                                         HashSet hs=new HashSet();
                                             Node curr=head;
                                             Node prev=null;
                                    while(curr!=null)
                                    {
                                             int value=curr.data;
                                           if(hs.contains(value))
                                           {
                                                     prev.next=curr.next;                
                                           }
                                           else{
                                                       hs.add(value);
                                                       prev=curr;
                                           }
                                           curr=curr.next;
                                    }
                                    return head;
                            }
}
public class RemoveDuplicateFromUnsortedList1{
                  public static void main(String[] args) {
                           LinkedList list=new LinkedList();
                                list.insertAtEnd(55);
                                list.insertAtEnd(15);
                                list.insertAtEnd(35);
                                list.insertAtEnd(15);
                                list.insertAtEnd(10);
                                list.insertAtEnd(15);
                                list.display(list.head);
                                list.display(list.removeDuplicate(list.head));
                  }                     
}
