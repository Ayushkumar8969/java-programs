class Parent 
{
                          void myName()
                          {
                                   System.out.println("This is my Name");
                          }
                          void display()
                          {
                                System.out.println("This is Parent Method");
                          }
}
class Child extends Parent 
{
                          void display()
                          {
                                  System.out.println("This is Child Method");
                          }
}
class Test 
{
                        public static void main(String[] args)
                        {
                                     Child obj1=new Child();
                                       obj1.display();
                                       Parent obj2=new Parent();
                                         obj2.myName();
                                         obj2.display();
                                         Parent p1=new Child();
                                          p1.display();
                        }
}