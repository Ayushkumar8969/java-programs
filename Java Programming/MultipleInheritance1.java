interface A 
{
                                 void m1();
}
interface B 
{
                                void m1();
}
interface C extends A,B 
{
                                void m2();
}
class D implements C 
{
                            public void m1()
                            {
                                    System.out.println("Method 1");
                            }
                            public void m2() 
                            {
                                    System.out.println("Method 2");
                            }
}
class Demo 
{
                            public static void main(String[] args)
                            {
                                         D obj=new D();
                                         obj.m1();
                                         obj.m2();
                            }
}