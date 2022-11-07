class LL 
{
                              Node head;
                              int size;
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
                                                         size++;
                                              }
                                              System.out.println("END");
                              } 
                              public void insertAtFirst(int data)
                              {
                                              Node nn=new Node(data);
                                              nn.next=head;
                                              head=nn;
                              }
                              public Node getNode(int index)
                              {
                                                Node temp=head;
                                                for(int i=0;i<index;i++)
                                                {
                                                            temp=temp.next;
                                                }
                                                return temp;
                              }
                              public void reverse()
                              {
                                                int left=0;
                                                int right=size-1;
                                                while(left<right)
                                                {
                                                                Node leftNode=getNode(left);
                                                                Node rightNode=getNode(right);
                                                                swap(leftNode,rightNode);
                                                                left++;
                                                                right--;
                                                }
                              }
                              public void swap(Node leftNode,Node rightNode)
                              {
                                              int temp=leftNode.data;
                                              leftNode.data=rightNode.data;
                                              rightNode.data=temp;
                              } 
}
class ReverseLinkedList2
{
                                         public static void main(String[] args)
                                         {
                                                          LL list=new LL();
                                                          list.insertAtFirst(65);
                                                          list.insertAtFirst(55);
                                                          list.insertAtFirst(45);
                                                          list.insertAtFirst(35);
                                                          list.insertAtFirst(25);
                                                            list.display();
                                                           //  LL.Node node=list.getNode(2);
                                                           // System.out.println(node.data);
                                                           list.reverse();
                                                           list.display();
                                         }
    
}
