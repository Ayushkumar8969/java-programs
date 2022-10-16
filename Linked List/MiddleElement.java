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
                              public int getMiddle(Node head)
                              {
                                                   int size=findSize(head);
                                                   System.out.println(size);
                                                     Node temp=head;
                                                   for(int i=0;i<size/2;i++)
                                                   {
                                                            temp=temp.next;
                                                   }
                                                   return temp.data;
                              }
                              public int findSize(Node head)
                              {
                                                Node temp=head;
                                                int size=0;
                                                   while(temp!=null)
                                                   {
                                                           size++;
                                                           temp=temp.next;
                                                   }
                                                   return size;
                              }
}
class MiddleElement 
{
                                              public static void main(String[] args)
                                              {
                                                               LL list=new LL();
                                                               list.insertAtFirst(98);
                                                               list.insertAtFirst(25);
                                                              // list.insertAtFirst(96);
                                                               list.insertAtFirst(73);
                                                               list.insertAtFirst(65);
                                                               list.insertAtFirst(25);
                                                               list.display();
                                                               System.out.println(list.getMiddle(list.head));
                                              }
}