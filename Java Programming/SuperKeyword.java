class Parent 
{
                         public void application()
                         {
                                 System.out.print("This is Parent Method");
                         }
}
class Child extends Parent 
{
                        public void application()
                        {
                                System.out.println("This is Child Method");
                                 super.application(); // calls the parent class method
                        }
}
class Example
{
                       public static void main(String[] args) 
                       {
                                      Child obj=new Child();
                                      obj.application();
                       }
}