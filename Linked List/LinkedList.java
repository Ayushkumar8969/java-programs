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
                               public void insertAtEnd(int data)
                               {
                                                 Node nn=new Node(data);
                                                    if(head==null)
                                                    {
                                                           head=nn;
                                                    }
                                                    else 
                                                    {
                                                                 Node temp=head;
                                                                 while(temp.next!=null)
                                                                 {
                                                                         temp=temp.next;
                                                                 }
                                                                 temp.next=nn;
                                                    }
                               }
                                public void insertAtPosition(int data,int pos)
                                {
                                                Node nn=new Node(data);
                                                      if(pos==0)
                                                      {  
                                                               nn.next=head;
                                                               head=nn;
                                                      }
                                                      else 
                                                      {
                                                                       Node temp=head;
                                                                       for(int i=0;i<pos-1;i++)
                                                                       {
                                                                                    temp=temp.next;
                                                                                       if(temp==null)
                                                                                       {
                                                                                              return;
                                                                                       }
                                                                       }
                                                                       nn.next=temp.next;
                                                                       temp.next=nn;
                                                      }
                                }
                                 public void deleteAtFirst()
                                 {
                                                     if(head==null)
                                                     {
                                                             System.out.print("Cannot Delete");
                                                             return;
                                                     }
                                                     else 
                                                     {
                                                              head=head.next;
                                                     }
                                 }
                                 public void deleteAtEnd()
                                 {
                                                        if(head==null)
                                                        {
                                                                  System.out.print("Cannot Delete");
                                                                  return;
                                                        }
                                                        if(head.next==null)
                                                        {
                                                                  head=head.next;
                                                        }
                                                        else 
                                                        {
                                                                           Node temp=head,prev=null;
                                                                               while(temp.next!=null)
                                                                               {
                                                                                       prev=temp;
                                                                                       temp=temp.next;
                                                                               }
                                                                               prev.next=null;
                                                        }
                                 }
                                  public void deleteAtPosition(int pos)
                                  {
                                                          if(head==null)
                                                          {
                                                                    System.out.println("Cannot Delete");
                                                                    return;
                                                          }
                                                          if(pos==0)
                                                          {
                                                                     head=head.next;
                                                                     return;
                                                          }
                                                          else 
                                                          {
                                                                         Node temp=head,prev=null;
                                                                             for(int i=0;i<pos;i++)
                                                                             {
                                                                                       prev=temp;
                                                                                       temp=temp.next;
                                                                                            if(temp==null)
                                                                                            {
                                                                                                     return;
                                                                                            }
                                                                             }
                                                                             prev.next=temp.next;
                                                          }
                                  }
                                  public int search(int key)
                                  {
                                                          int pos=0;
                                                          Node temp=head;
                                                              while(temp!=null)
                                                              {
                                                                               if(temp.data==key)
                                                                               {
                                                                                        return pos;
                                                                               }
                                                                               else 
                                                                               {
                                                                                           pos++;
                                                                                           temp=temp.next;
                                                                               }
                                                              }
                                                              return -1;
                                  }
}
class LinkedList 
{
                                                public static void main(String[] args)
                                                {
                                                               LL list=new LL();
                                                               list.insertAtFirst(65);
                                                               list.insertAtFirst(25);
                                                               list.insertAtFirst(96);
                                                               list.insertAtFirst(36);
                                                               list.display();
                                                               System.out.println(list.search(96));
                                                               list.insertAtEnd(89);
                                                               list.display();
                                                               list.insertAtPosition(63,0);
                                                               list.display();
                                                               list.deleteAtFirst();
                                                               list.display();
                                                               list.deleteAtEnd();
                                                               list.display();
                                                               list.deleteAtPosition(2);
                                                               list.display();
                                                }
}