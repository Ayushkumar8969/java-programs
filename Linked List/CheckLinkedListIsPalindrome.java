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
                                  public boolean checkPalindrome(Node head)
                                  {
                                                       Node node=null;
                                                       Node slow=head;
                                                       Node fast=head;
                                                       while(fast!=null && fast.next!=null)
                                                       {
                                                                     slow=slow.next;
                                                                     fast=fast.next.next;
                                                       }
                                                       if(fast==null) //Even case
                                                       {
                                                                    node=reverse(slow);
                                                       }
                                                       else       // Odd case
                                                       {
                                                                  node=reverse(slow.next);
                                                       }
                                                       return check(head,node);
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
                                  public boolean check(Node head,Node node)
                                  {
                                                 Node temp=head;
                                                          while(node!=null)
                                                          {
                                                                       if(temp.data==node.data)
                                                                       {
                                                                              temp=temp.next;
                                                                              node=node.next;
                                                                       }
                                                                       else 
                                                                       {
                                                                               return false;
                                                                       }
                                                          }
                                                          return true;
                                  }

}
class CheckLinkedListIsPalindrome
 {
                               public static void main(String[] args)
                                {
                                                       LL list=new LL();
                                                         list.insertAtFirst(10);
                                                         list.insertAtFirst(20);
                                                         list.insertAtFirst(30);
                                                         list.insertAtFirst(30);
                                                         list.insertAtFirst(20);
                                                         list.insertAtFirst(10);
                                                         list.display();
                                                         System.out.println(list.checkPalindrome(list.head));
                                                         list.display();
                               }
}
