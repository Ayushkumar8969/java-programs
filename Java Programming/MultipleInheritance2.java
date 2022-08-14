interface A 
{
                          void m1();
}
class B 
{
                         void m2()
                          { 
                                    System.out.println("Method 2");
                          }
}
class C extends B implements A 
{
                        public void m1()
                        {
                                    System.out.println("Method 1");
                        }                
                        void m3()
                        {
                                     System.out.println("Method 3");
                        }
}
class Test
{
                        public static void main(String[] args) 
                        {
                                       C obj=new C();
                                       obj.m1();
                                       obj.m2();
                                       obj.m3();
                        }
}