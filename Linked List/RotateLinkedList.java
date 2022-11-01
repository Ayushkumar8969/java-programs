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
                                                temp.next=null;
                                                 Node head1=reverse(head);
                                                 Node head2=reverse(node);
                                                  head.next=head2;
                                                     return reverse(head1);
                                 }
                                 public Node reverse(Node head)
                                 {
                                           Node prev=null,curr=head,temp=null;
                                                 while(curr!=null)
                                                 {
                                                          temp=curr.next;
                                                          curr.next=prev;
                                                          prev=curr;
                                                          curr=temp;
                                                 }
                                                 return prev;
                                 }
}
class RotateLinkedList
{
                                 public static void main(String[] args)
                                 {
                                    
                                 
                                           LL list=new LL();
                                           list.insertAtFirst(65);
                                           list.insertAtFirst(55);
                                           list.insertAtFirst(45);
                                           list.insertAtFirst(35);
                                           list.insertAtFirst(25);
                                           list.insertAtFirst(15);
                                                list.display();
                                               list.head= list.rotateLinkedList(list.head,2);
                                                list.display();
                                 }


}
