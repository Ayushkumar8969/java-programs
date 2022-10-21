                   // BRUTE FORCE
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
                                 public Node findIntersection(Node head1,Node head2)
                                 {
                                                   Node head=new Node(0);
                                                   Node temp=head;
                                                   while(head1!=null)
                                                   {
                                                                   Node temp2=head2;
                                                                     while(temp2!=null)
                                                                     {
                                                                                if(head1.data==temp2.data)
                                                                                {
                                                                                         Node nn=new Node(head1.data);
                                                                                          temp.next=nn;
                                                                                          temp=nn;
                                                                                          break;
                                                                                }
                                                                                temp2=temp2.next;
                                                                     }
                                                                     head1=head1.next;
                                                   }
                                                   return head.next;                    
                                 }
}
class IntersectionOfTwoList 
{
                                         public static void main(String[] args)
                                         {
                                                    LinkedList list=new LinkedList();
                                                    list.insertAtFirst(90);
                                                    list.insertAtFirst(80);
                                                    list.insertAtFirst(40);
                                                    list.insertAtFirst(20);
                                                    list.insertAtFirst(30);
                                                    list.insertAtFirst(50);
                                                    list.display(list.head1);
                                                    
                                                      list.insertAtEnd(20);
                                                       list.insertAtEnd(50);
                                                       list.insertAtEnd(60);
                                                       list.insertAtEnd(10);
                                                       list.insertAtEnd(30);
                                                       list.insertAtEnd(80);
                                                    list.display(list.head2);

                                                  list.display(list.findIntersection(list.head1,list.head2));                        
                                         }
}