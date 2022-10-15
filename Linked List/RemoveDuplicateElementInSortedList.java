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
                                       public  void insertAtFirst(int data)
                                        {
                                                          Node nn=new Node(data);
                                                                   nn.next=head;
                                                                  head=nn;
                                         }
                                     public  Node removeDuplicate(Node head)
                                     {
                                                   Node temp1=head,temp2=head.next;
                                                        while(temp2!=null)
                                                        {
                                                                         if(temp1.data!=temp2.data)
                                                                         {
                                                                                       temp1.next=temp2;
                                                                                       temp1=temp2;
                                                                         }
                                                                                       temp2=temp2.next;
                                                        }
                                                        temp1.next=temp2;
                                                        return head;
                                     }                                    
}
class RemoveDuplicateElementInSortedList
{
                                              public static void main(String[] args)
                                              {
                                                                   LinkedList list=new LinkedList();
                                                                   list.insertAtFirst(75);
                                                                      list.insertAtFirst(65);
                                                                      list.insertAtFirst(65);
                                                                      list.insertAtFirst(65);
                                                                      list.insertAtFirst(65);
                                                                      list.insertAtFirst(55);
                                                                         list.insertAtFirst(55);
                                                                         list.insertAtFirst(36);
                                                                        list.display();

                                                                         list.head=list.removeDuplicate(list.head);

                                                                         list.display();
                                                                      
                                              }
}