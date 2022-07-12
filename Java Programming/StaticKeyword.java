class Demo
{
                             static void display1()
                              {
                                      System.out.println("This is display1");
                              }
                                static void display2()
                                {
                                        System.out.println("This is display2");
                                }
}
class Test extends Demo
{
                                public static void main(String[] args)
                                {
                                              display1();
                                              display2();
                                }
}