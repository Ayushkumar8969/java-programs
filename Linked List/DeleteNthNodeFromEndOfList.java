class LinkedList{
                         Node head;
                         class Node{
                                int data;
                                Node next;
                                  Node(int data){
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
                         public void insertAtEnd(int data)
                         {
                                          Node nn=new Node(data);
                                              if(head==null)
                                              {
                                                    head=nn;
                                              }
                                              else{
                                                  Node temp=head;
                                                    while(temp.next!=null){
                                                        temp=temp.next;
                                                    }
                                                  temp.next=nn;
                                              }
                         }
                         public Node removeNthNode(Node head,int n)
                         {
                                                   if(head.next==null)
                                                   {
                                                         return null;
                                                   }
                                                   int size=findSize(head);
                                                     if(size==n)
                                                     {
                                                            return head.next; 
                                                     }
                                                     Node prev=head;
                                                       for(int i=1;i<size-n;i++)
                                                       {
                                                                prev=prev.next;
                                                       }
                                                       prev.next=prev.next.next;
                                                        return head;
                         }
                          public int findSize(Node head){
                                          int size=0;
                                          Node curr=head;
                                           while(curr!=null){
                                                     size++;
                                                     curr=curr.next;
                                           }
                                           return size;
                          }
}
public class DeleteNthNodeFromEndOfList {
                                 public static void main(String[] args) {
                                  LinkedList list=new LinkedList();
                                    list.insertAtEnd(55);
                                    list.insertAtEnd(35);
                                     list.insertAtEnd(10);
                                     list.insertAtEnd(12);
                                     list.insertAtEnd(18);
                                     list.insertAtEnd(15);
                                     list.display(list.head);
                                     list.display(list.removeNthNode(list.head,6));
                                }                    
}         

