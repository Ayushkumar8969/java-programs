class A 
{
               private int a,b=4;
               A(int x)
               {
                     a=x;
                    System.out.println(a*b);
               }
               void display()
               {
                       System.out.print(a*b);
               }

}
class B extends A 
{
              B(int m,int n)
              {
                    super(m);
                   System.out.println(m+" "+n);
              }
}
class C 
{
                           public static void main(String[] args) 
                           {
                                           B obj=new B(10,20);
                                           obj.display();
                           }
}