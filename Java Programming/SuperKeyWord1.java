class A 
{
                int z=10;
}
class B extends A 
{
                int z=20;
                 public void f1()
                 {
                          int z=30;
                          System.out.println(z);   // local variable
                          System.out.println(this.z);  // instance variable
                          System.out.println(super.z);  // Parent Class instance variable
                 }
}
class Note 
{
                 public static void main(String[] args) 
                 {
                            B obj=new B();
                            obj.f1();
                 }
}