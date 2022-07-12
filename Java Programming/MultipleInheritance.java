interface A 
{
                               public void display();
}
interface B 
{
                              public void multiply();
}
class C implements A,B 
{
                              public void display()
                             {
                                       System.out.println("This is display method");
                             }    
                               public void multiply()
                               {
                                      System.out.print("This is multiply method"); 
                               }
}
class Test 
{
                                  public static void main(String[] args)
                                  {
                                              C obj=new C();
                                                 obj.display();
                                               obj.multiply();
                                  }
}