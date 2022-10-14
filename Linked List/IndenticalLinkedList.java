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
                                 public boolean isIdentical(Node head1,Node head2)
                                 {
                                                       Node temp1=head1,temp2=head2;
                                                         while(temp1!=null && temp2!=null)
                                                         {
                                                                      if(temp1.data==temp2.data)
                                                                      {
                                                                              temp1=temp1.next;
                                                                              temp2=temp2.next;
                                                                      }
                                                                      else 
                                                                      {
                                                                                return false;
                                                                      }
                                                         }         
                                                           if(temp1==null && temp2==null)
                                                           {
                                                                    return true;
                                                           }
                                                           return false;
                                 }
}
class IndenticalLinkedList
{
                                                    public static void main(String[] args)
                                                    {
                                                                  LinkedList list=new LinkedList();
                                                                      list.insertAtFirst(65);
                                                                      list.insertAtFirst(25);
                                                                      list.insertAtFirst(35);
                                                                      list.insertAtFirst(15);
                                                                      list.insertAtFirst(95);
                                                                      list.display(list.head1);
                                                                      
                                                                        list.insertAtEnd(95);
                                                                         list.insertAtEnd(15);
                                                                         list.insertAtEnd(35);
                                                                        list.insertAtEnd(25);
                                                                         list.insertAtEnd(65);
                                                                      list.display(list.head2);

                                                                      System.out.println(list.isIdentical(list.head1,list.head2));

                                                    }
}