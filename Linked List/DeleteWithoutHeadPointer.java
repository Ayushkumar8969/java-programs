class LinkedList 
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
                                         public void deleteNode(Node del)
                                         {
                                                        if(del==null || del.next==null)
                                                        {
                                                                return;
                                                        }
                                                        del.data=del.next.data;
                                                        del.next=del.next.next;
                                         }
}
class DeleteWithoutHeadPointer 
{
                                           public static void main(String[] args)
                                           {
                                                                    LinkedList list=new LinkedList();
                                                                    list.insertAtFirst(98);
                                                                    list.insertAtFirst(25);
                                                                    list.insertAtFirst(96);
                                                                    list.insertAtFirst(73);
                                                                    list.insertAtFirst(65);
                                                                    list.insertAtFirst(25);
                                                                    list.display();
                                                                           list.deleteNode(list.head.next.next.next);
                                                                    list.display();
                                           }
}
