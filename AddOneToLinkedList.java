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
                             public void display()
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
                             public Node addOne(Node head)
                             {
                                              head=reverse(head);
                                              Node temp=head;
                                              Node prev=null;
                                              int carry=1;
                                              while(temp!=null)
                                              {
                                                           int value=temp.data+carry;
                                                           temp.data=value%10; 
                                                           carry=value/10;
                                                            prev=temp;
                                                            temp=temp.next;
                                              }
                                              if(carry!=0)
                                              {
                                                          Node nn=new Node(carry);
                                                          prev.next=nn;
                                              }
                                              return reverse(head);
                             }
                             public Node reverse(Node head)
                             {
                                               Node prev=null,curr=head,temp=null;
                                               while(curr!=null)
                                               {
                                                            temp=curr.next;
                                                            curr.next=prev;
                                                            prev=curr;
                                                            curr=temp;
                                               }
                                               return prev;
                             }
}
class AddOneToLinkedList1
{
                                          public static void main(String[] args)
                                          {
                                                             LL list=new LL();
                                                             list.insertAtFirst(9);
                                                             list.insertAtFirst(9);
                                                             list.insertAtFirst(9);
                                                             list.insertAtFirst(9);
                                                             list.insertAtFirst(7);
                                                             list.display();

                                                             list.head=list.addOne(list.head);
                                                             list.display();
                                          }             
}

