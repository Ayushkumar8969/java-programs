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
                              public Node sortedInsert(Node head, int key)
                               {
                                                       Node nn=new Node(key);
                                                           if(head==null)
                                                           {
                                                                   head=nn;
                                                                     return head;
                                                           }
                                                           if(key<=head.data)
                                                           {
                                                                      nn.next=head;
                                                                       head=nn;
                                                                      return head;
                                                           }
                                                             Node temp=head;
                                                               while(temp.next!=null)
                                                               {
                                                                        if(key<=temp.next.data)
                                                                        {
                                                                                  nn.next=temp.next;
                                                                                  temp.next=nn;
                                                                                    return head;
                                                                        }
                                                                         else 
                                                                         {
                                                                                 temp=temp.next;
                                                                         }
                                                               }
                                                                     temp.next=nn;
                                                                    return head;
                               }
                                
}
class InsertInSortedList
{
                                         public static void main(String[] args)
                                         {
                                                                  LL list=new LL();
                                                                         list.insertAtFirst(95);
                                                                        list.insertAtFirst(85);
                                                                        list.insertAtFirst(65);
                                                                        list.insertAtFirst(62);
                                                                        list.insertAtFirst(45);
                                                                         list.insertAtFirst(25);
                                                                         list.display();
                                                                         list.head=list.sortedInsert(list.head,56);
                                                                         list.display();
                                         }
}