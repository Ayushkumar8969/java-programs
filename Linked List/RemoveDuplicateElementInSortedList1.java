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
                                         // without using extra variable
                                     public  Node removeDuplicate(Node head)
                                     {
                                                   Node temp=head;
                                                        while(temp.next!=null)
                                                        {
                                                                         if(temp.data==temp.next.data)
                                                                         {
                                                                                       temp.next=temp.next.next;
                                                                         }
                                                                         else
                                                                         {
                                                                                       temp=temp.next;
                                                                         }
                                                        }
                                                        return head;
                                     }                                    
}
class RemoveDuplicateElementInSortedList1
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