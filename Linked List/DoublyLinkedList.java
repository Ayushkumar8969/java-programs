class DLL 
{
                      Node head;
                      class Node 
                      {
                                 int data;
                                 Node prev;
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
                                        if(head==null)
                                        {
                                               head=nn;
                                        }
                                        else 
                                        {
                                                  nn.next=head;
                                                  head.prev=nn;
                                                  head=nn; 
                                        }
                       }
                       public void insertAtEnd(int data)
                       {
                                                    if(head==null)
                                                    {
                                                             insertAtFirst(data);
                                                             return;
                                                    }
                                                    else 
                                                    {
                                                                Node nn=new Node(data);
                                                                Node temp=head;
                                                                while(temp.next!=null)
                                                                {
                                                                          temp=temp.next;
                                                                }
                                                                temp.next=nn;
                                                                nn.prev=temp;
                                                    }
                       }
                         public void insertAtMiddle(int ele,int data)
                         {
                                                if(head==null)
                                                {
                                                        System.out.println("Linked List is Empty");
                                                        return;
                                                }
                                                Node nn=new Node(data);
                                                Node temp=head;
                                                while(temp!=null)
                                                {
                                                               if(temp.data==ele)
                                                               {
                                                                          nn.next=temp.next;
                                                                          temp.next=nn;
                                                                          nn.prev=temp;
                                                                            if(nn.next!=null)
                                                                            {
                                                                                     nn.next.prev=nn;
                                                                            }
                                                                            return;
                                                               }
                                                               else 
                                                               {
                                                                      temp=temp.next;
                                                               }
                                                }
                                                System.out.println("Element not found");
                         }

}
class DoublyLinkedList 
{
                         public static void main(String[] args)
                         {
                                  DLL list=new DLL();
                                 // list.insertAtFirst(64);
                                  // list.insertAtFirst(85);
                                   list.insertAtFirst(96);
                                   list.insertAtEnd(105);
                                   list.insertAtMiddle(105,38);
                                  list.display();
                         }
}