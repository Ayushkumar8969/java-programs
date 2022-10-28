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
                                              temp.data=temp.data+1;
                                              while(temp.next!=null)
                                              {
                                                                    if(temp.data%10==0)
                                                                    {
                                                                             temp.data=temp.data%10;
                                                                             temp.next.data=temp.next.data+1;
                                                                    }
                                                                    else 
                                                                    {
                                                                           break;
                                                                    }
                                                                    temp=temp.next;
                                              }
                                              if(temp.data%10==0)
                                              {
                                                          temp.data=temp.data%10;
                                                          Node nn=new Node(1);
                                                          temp.next=nn;
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
class AddOneToLinkedList
{
                                          public static void main(String[] args)
                                          {
                                                             LL list=new LL();
                                                             list.insertAtFirst(9);
                                                             list.insertAtFirst(9);
                                                             list.insertAtFirst(9);
                                                             list.insertAtFirst(9);
                                                             list.insertAtFirst(9);
                                                             list.display();

                                                             list.head=list.addOne(list.head);
                                                             list.display();
                                          }             
}
