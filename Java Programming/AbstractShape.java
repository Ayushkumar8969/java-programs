abstract class Shape
{
                                       int l,b,r;
                                     abstract void printArea();
}
class Rectangle extends Shape
{
                                      void  printArea()
                                      {
                                                   l=10,b=20;
                                            System.out.println("Area="+(l*b));
                                      }

}
class Triangle extends Shape
{
                                          void printArea()
                                          {
                                                      l=15,b=30;
                                                 System.out.println("Area="+(0.5*l*b));
                                          }
}
class Circle extends Shape
{
                                            void printArea()
                                           {
                                                    r=10;
                                                 System.out.println("Area="+(3.14*r*r));
                                           }
}
class Test
{
                                           public static void main(String[] args)
                                          {
                                                       Shape obj;
                                                      obj=new Rectangle();
                                                        obj.printArea();
                                                      obj=new Triangle();
                                                         obj.printArea();
                                                    obj=new Circle();
                                                          obj.printArea();
                                          }
}
