class LL 
{
                                       Node head;
                                       class Node 
                                       {
                                                       int data;
                                                       Node next;
                                                       Node(int data)
                                                       {
                                                                 this.data=data;
                                                       }
                                       }
                                       public void display(Node head)
                                       {
                                                        Node temp=head;
                                                        while(temp!=null)
                                                        {
                                                                  System.out.print(temp.data+"->");
                                                                  temp=temp.next;
                                                        }
                                                        System.out.println("END");
                                       }
                                       public void insertAtFirst(int data)
                                       {
                                                        Node nn=new Node(data);
                                                        nn.next=head;
                                                        head=nn;
                                       }
                                       public Node reverse(Node head)
                                       {
                                                    Node temp=head;
                                                    Node newHead=null;
                                                    while(temp!=null)
                                                    {
                                                                  Node nn=new Node(temp.data);
                                                                  nn.next=newHead;
                                                                  newHead=nn;
                                                                  temp=temp.next;
                                                    }
                                                    return newHead;
                                       }
}
class ReverseLinkedList3 
{
                                           public static void main(String[] args)
                                           {
                                                               LL list=new LL();
                                                               list.insertAtFirst(30);
                                                               list.insertAtFirst(25);
                                                               list.insertAtFirst(20);
                                                               list.insertAtFirst(15);
                                                               list.insertAtFirst(10);
                                                               list.insertAtFirst(5);
                                                               list.display(list.head);
                                                                 list.display(list.reverse(list.head));                     
                                           }
}
