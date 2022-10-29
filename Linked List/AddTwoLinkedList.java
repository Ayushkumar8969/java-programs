class LinkedList 
{
                                                    Node first;
                                                    Node second;
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
                                                                         nn.next=first;
                                                                         first=nn; 
                                                      }
                                                      public void insertAtEnd(int data)
                                                      {
                                                                    Node nn=new Node(data);
                                                                       if(second==null)
                                                                       {
                                                                             second=nn;
                                                                       }
                                                                       else 
                                                                       {
                                                                                    Node temp=second;
                                                                                    while(temp.next!=null)
                                                                                    {
                                                                                              temp=temp.next;
                                                                                    }
                                                                                    temp.next=nn;
                                                                       }
                                                      }
                                                      public Node addTwoList(Node first,Node second)
                                                      {
                                                                           Node head=new Node(0);
                                                                           Node temp=head;
                                                                           first=reverse(first);
                                                                           second=reverse(second);
                                                                           int carry=0;
                                                                           int value=0;
                                                                           while(first!=null || second!=null)
                                                                           {
                                                                                            if(first!=null && second!=null)
                                                                                            {
                                                                                                 value=first.data+second.data+carry;
                                                                                                 first=first.next;
                                                                                                 second=second.next;
                                                                                            }
                                                                                            else if(first==null)
                                                                                            {
                                                                                                     value=second.data+carry;
                                                                                                     second=second.next;
                                                                                            }
                                                                                            else if(second==null)
                                                                                            {
                                                                                                    value=first.data+carry;
                                                                                                    first=first.next;
                                                                                            }
                                                                                            carry=value/10;
                                                                                            Node nn=new Node(value%10);
                                                                                            temp.next=nn;
                                                                                            temp=nn;
                                                                           }
                                                                           if(carry!=0)
                                                                           {
                                                                                   Node nn=new Node(carry);
                                                                                   temp.next=nn;
                                                                           }
                                                                           return reverse(head.next);
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
class AddTwoLinkedList
{
                                                    public static void main(String[] args)
                                                    {
                                                                    LinkedList list=new LinkedList();
                                                                    list.insertAtFirst(7);
                                                                    list.insertAtFirst(9);
                                                                    list.insertAtFirst(6);
                                                                    list.insertAtFirst(9);
                                                                    list.display(list.first);

                                                                    list.insertAtEnd(7);
                                                                    list.insertAtEnd(3);
                                                                    list.insertAtEnd(6);
                                                                    list.insertAtEnd(7);
                                                                    list.display(list.second);

                                                                    list.display(list.addTwoList(list.first, list.second));



                                                    }   
}
