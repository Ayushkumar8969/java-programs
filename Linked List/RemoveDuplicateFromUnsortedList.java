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
                        public void display(Node head)
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
                        public Node removeDuplicates(Node head)
                        {
                                        Node newHead=new Node(head.data);
                                        Node temp1=head.next;
                                        while(temp1!=null)
                                        {
                                                        Node temp2=newHead;
                                                        while(temp2.next!=null)
                                                        {
                                                               if(temp1.data==temp2.data)
                                                               {
                                                                       break;
                                                               }
                                                               else{
                                                                      temp2=temp2.next;
                                                               }
                                                        }
                                                        if(temp2.next==null)
                                                        {
                                                               if(temp1.data!=temp2.data){
                                                                   Node nn=new Node(temp1.data);
                                                                   temp2.next=nn;
                                                               }
                                                        }
                                                        temp1=temp1.next;
                                        }
                                        return newHead;
                        }  
}
class RemoveDuplicateFromUnsortedList{
                    public static void main(String[] args) {
                                  LL list=new LL();
                                  list.insertAtFirst(10);
                                  list.insertAtFirst(2);
                                  list.insertAtFirst(10);
                                  list.insertAtFirst(2);
                                  list.insertAtFirst(10);
                                  list.display(list.head);
                                  list.display(list.removeDuplicates(list.head));
                    }
}