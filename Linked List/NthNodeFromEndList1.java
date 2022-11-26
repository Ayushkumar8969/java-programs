class LL{
                               Node head;
                               class Node{
                                       int data;
                                       Node next;
                                        Node(int data)
                                        {
                                           this.data=data;
                                        }
                               }
                               public void display(Node head){
                                             Node curr=head;
                                              while(curr!=null){
                                                       System.out.print(curr.data+"->");
                                                       curr=curr.next;
                                              }
                                              System.out.println("END");
                               }
                               public void insertAtEnd(int data){
                                               Node nn=new Node(data);
                                                  if(head==null){
                                                         head=nn;
                                                  }
                                                  else{
                                                          Node curr=head;
                                                          while(curr.next!=null){
                                                                 curr=curr.next;
                                                          }
                                                          curr.next=nn;
                                                  }
                               }
                               public int findNthNode(Node head,int n){
                                             Node slow=head;
                                             Node fast=head;
                                             int i=1;
                                             while(i<n){
                                                   fast=fast.next;
                                                       if(fast==null)
                                                       {
                                                             return -1;
                                                       }
                                                   i++;
                                             }
                                             while(fast.next!=null){
                                                         slow=slow.next;
                                                         fast=fast.next;
                                             }
                                             return slow.data;          
                               }
}
public class NthNodeFromEndList1
{  
                                public static void main(String[] args)
                                {
                                         LL list=new LL();
                                           list.insertAtEnd(12);
                                           list.insertAtEnd(22);
                                           list.insertAtEnd(32);
                                           list.insertAtEnd(42);
                                           list.insertAtEnd(52);
                                           list.insertAtEnd(62);
                                           list.insertAtEnd(72); 
                                           list.display(list.head);
                                          System.out.println(list.findNthNode(list.head,3));               
                                }
}
