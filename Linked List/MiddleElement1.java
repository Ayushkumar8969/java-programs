           // ONLY IN ONE TRAVERSAL
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
                                          Node slow=head;
                                          Node fast=head;
                                              while(fast!=null && fast.next!=null)
                                              {
                                                           slow=slow.next;
                                                           fast=fast.next.next;
                                              }
                                              return slow.data;
                              }
                              
}
class MiddleElement1
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