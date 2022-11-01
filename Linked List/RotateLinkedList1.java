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
                            public void insertAtFirst(int data)
                            {
                                      Node nn=new Node(data);
                                      nn.next=head;
                                      head=nn;
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
                            public Node rotateLinkedList(Node head,int k)
                            {
                                                if(head==null || head.next==null)
                                                {
                                                         return head;
                                                }
                                                    Node temp=head;
                                                    for(int i=1;i<k;i++)
                                                    {
                                                              temp=temp.next;
                                                    }
                                                    Node node=temp.next;
                                                       if(node==null)
                                                       {
                                                              return head;
                                                       }
                                                       temp.next=null;
                                                       temp=node;
                                                       while(temp.next!=null)
                                                       {
                                                                    temp=temp.next;
                                                       }
                                                       temp.next=head;
                                                       return node;                    
                            }
}
class RotateLinkedList1
{
                                   public static void main(String[] args)
                                   {
                                                  LL list=new LL();
                                                     list.insertAtFirst(25);
                                                     list.insertAtFirst(65);
                                                     list.insertAtFirst(25);
                                                     list.insertAtFirst(15);
                                                     list.insertAtFirst(35);
                                                        list.display();
                                                        list.head=list.rotateLinkedList(list.head,2);
                                                        list.display();
                                   }
}
