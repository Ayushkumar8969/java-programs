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
                                 public Node reverse(Node head)
                                 {
                                                            if(head==null || head.next==null)
                                                            {
                                                                       return head;
                                                            }
                                                              Node temp=head;
                                                              temp=temp.next;
                                                              Node node=reverse(temp);
                                                                    temp.next=head;
                                                                    head.next=null;
                                                                       return node;
                                 }
}
class ReverseLinkedList1 
{
                                                    public static void main(String[] args)
                                                    {
                                                                  LinkedList list=new LinkedList();
                                                                      list.insertAtFirst(65);
                                                                      list.insertAtFirst(25);
                                                                      list.insertAtFirst(35);
                                                                      list.insertAtFirst(15);
                                                                      list.insertAtFirst(95);
                                                                      list.display();
                                    
                                                                     list.head= list.reverse(list.head);
                                                                       list.display();

                                                    }
}