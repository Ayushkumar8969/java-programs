class LinkedList 
{
                                 Node head1;
                                 Node head2;
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
                                                                  System.out.print(temp.data+" ");
                                                                  temp=temp.next;
                                                   }
                                                   System.out.println("END");
                                 }
                                 public void insertAtFirst(int data)
                                 {
                                                            Node nn=new Node(data);
                                                              nn.next=head1;
                                                              head1=nn;
                                 }
                                 public void insertAtEnd(int data)
                                 {
                                                 Node nn=new Node(data);
                                                    if(head2==null)
                                                    {
                                                           head2=nn;
                                                    }
                                                    else 
                                                    {
                                                                 Node temp=head2;
                                                                 while(temp.next!=null)
                                                                 {
                                                                         temp=temp.next;
                                                                 }
                                                                 temp.next=nn;
                                                    }
                                 }
                                 public Node sortedMergeList(Node head1,Node head2)
                                 {
                                                     Node head=new Node(0);
                                                      Node temp=head;
                                                        while(head1!=null && head2!=null)
                                                        {
                                                                            if(head1.data<=head2.data)
                                                                            {
                                                                                         temp.next=head1;
                                                                                         temp=head1;
                                                                                         head1=head1.next;
                                                                            }
                                                                            else 
                                                                            {
                                                                                        temp.next=head2;
                                                                                        temp=head2;
                                                                                        head2=head2.next;
                                                                            }
                                                        }
                                                           if(head1!=null)
                                                           {
                                                               temp.next=head1;
                                                           }
                                                           else 
                                                           {
                                                                temp.next=head2;
                                                           }
                                                          return head.next;
                                 }
}
class MergeTwoSortedLinkedList 
{
                                          public static void main(String[] args)
                                          {
                                                                LinkedList list=new LinkedList();
                                                                      list.insertAtFirst(75);
                                                                      list.insertAtFirst(55);
                                                                      list.insertAtFirst(55);
                                                                      list.insertAtFirst(15);
                                                                      list.insertAtFirst(15);
                                                                      list.insertAtFirst(5);
                                                                      list.display(list.head1);
                                                                      
                                                                        list.insertAtEnd(10);
                                                                         list.insertAtEnd(15);
                                                                         list.insertAtEnd(35);
                                                                         list.insertAtEnd(65);
                                                                      list.display(list.head2);

                                                                    list.display(list.sortedMergeList(list.head1,list.head2));

                                          }
}