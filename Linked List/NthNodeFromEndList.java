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
                                                                    System.out.print(temp.data+" ");
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
                                     public int getNthFromLast(Node head,int n)
                                     {
                                                               int size=findSize(head);
                                                                 if(n>size)
                                                                 {
                                                                       return -1;
                                                                 }
                                                                 Node temp=head;
                                                                 for(int i=1;i<size-n+1;i++)
                                                                 {
                                                                               temp=temp.next;
                                                                 }
                                                                 return temp.data;
                                     }
                                     public int findSize(Node head)
                                     {
                                                            int size=0;
                                                            Node temp=head;
                                                             while(temp!=null)
                                                             {
                                                                     size++;    
                                                                     temp=temp.next;
                                                             }
                                                           return size;               
                                     }
}
class NthNodeFromEndList
{
                                      public static void main(String[] args)
                                       {
                                        
                                                         LL list=new LL();
                                                         list.insertAtFirst(20);
                                                         list.insertAtFirst(10);
                                                         list.insertAtFirst(60);
                                                         list.insertAtFirst(50);
                                                         list.insertAtFirst(80);
                                                         list.insertAtFirst(65);
                                                         list.display();

                                                         System.out.println(list.getNthFromLast(list.head,2));
                                       }

}
